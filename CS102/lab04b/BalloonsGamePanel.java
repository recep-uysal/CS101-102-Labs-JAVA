import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Iterator;
import java.util.ArrayList;
import shapes.*;

/**
 * My Balloons Game Panel Class
 * @author Recep Uysal
 * @version 06.04.2020
 */ 
public class BalloonsGamePanel extends JPanel
{
   // proporties
   JLabel label;
   ShapeContainer balloons;
   MyMouseListener mouse;
   Graphics g;
   Timer time;
   int points;
   int elapsedTime;
   
   // constructors
   public BalloonsGamePanel()
   {
      // create label, mouseListener and shapeContainer
      balloons = new ShapeContainer();
      label = new JLabel( "Points: " + points );
      label.setForeground( Color.WHITE );
      mouse = new MyMouseListener();
      
      // initilase points and elapsedTime
      points = 0;
      elapsedTime = 0;
      
      // create iterator
      Iterator it;
      it = balloons.iterator();
      
      // set the size of the panel
      setPreferredSize( new Dimension( 700, 700 ) );
      
      // add circles into balloons
      for( int i = 0; i < 25; i++ )
      {
         balloons.addShape( new Balloon() );
      }
      
      // create timer
      time = new Timer ( 100, new MyActionListener() );
      time.start();
      
      // add maouseListener and label
      addMouseListener( mouse );
      add( label );
   }
   
   // methods
   /**
    * method paintComponent draws the circles
    * @param g is the graphics object we want to draw
    */
   @Override
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );
      
      // create iterator
      Iterator group;
      group = balloons.iterator();
      
      // set background color
      setBackground( Color.BLACK );
      
      // draw balloons
      while( group.hasNext() )
      {
         ( (Drawable) ( group.next() ) ).draw( g );
      }
   }
   
   // inner MyMouseListener Class
   private class MyMouseListener extends MouseAdapter
   {
      /**
       * mousePressed manages the mouse event when mouse is pressed
       * @param MouseEvent e
       */
      public void mousePressed ( MouseEvent event )
      {
         int x;
         int y;
         int selected;
         
         // get x and y
         x = event.getX();
         y = event.getY();
         
         // select all balloons
         selected = balloons.selectAllAt( x, y );
         
         // increase points
         points = points + selected;
         
         // remove balloons
         balloons.remove();
         
         repaint();
         
         // change score label
         label.setText( "Points: " + points );
      }
   }
   
   // inner MyActionListener Class
   private class MyActionListener implements ActionListener
   {
      /**
       * actionPerformed manages the game
       * @param ActionEvent e
       */
      public void actionPerformed( ActionEvent e )
      {
         // create iterator
         Iterator itr;
         itr = balloons.iterator();
         
         // grow balloons
         while( itr.hasNext() )
         {
            ( (Balloon) itr.next() ).grow();
         }
         
         // add new balloons if the number of balloons decrease
         if( balloons.size() < 25 )
         {
            for( int k = 0; k < 25 - balloons.size(); k++ )
            {
               balloons.addShape( new Balloon() );
            }
         }
         
         // increase elapsedTime
         elapsedTime++;
         
         // Change score label
         label.setText( "Points: " + points );
         repaint();
         
         // if time is up
         if( elapsedTime >= 150 )
         {
            // stop the time and remove mouse listener
            time.stop();
            removeMouseListener( mouse );
            
            // create JoptionPane
            int selection;
            selection = JOptionPane.showConfirmDialog( BalloonsGamePanel.this, "Play Again?" , "Game Over", 0 );
            
            // if the answer is yes
            if( selection == JOptionPane.YES_OPTION )
            {
               // make points and elapsedTime 0
               elapsedTime = 0;
               points = 0;
               
               // create new balloons shapeContainer
               balloons = new ShapeContainer();
               for( int i = 0; i < 25; i++ )
               {
                  balloons.addShape( new Balloon() );
               }
               
               // start time
               time.start();
               
               //add mouselistener
               addMouseListener( mouse );
               
               // Set score label
               label.setText( "Points: " + points );
            }
            
            // if the answer is no
            else if( selection == JOptionPane.NO_OPTION )
            {
               // quit the parogram
               System.exit(0);
            } 
         }
      }
   }
}


