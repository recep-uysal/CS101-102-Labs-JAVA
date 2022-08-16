import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * My Panel
 * @author Recep Uysal
 * @version 30.03.2020
 */ 
public class MyPanel extends JPanel
{
   // proporties
   JPanel panel;
   JLabel label;
   JButton[] buttons;
   JButton button;
   int number;
   int random;
   boolean finish;
   
   // constructors
   public MyPanel()
   {
      // initialise all proporties
      panel = new JPanel();
      label = new JLabel();
      button = new JButton();
      buttons = new JButton[25];
      number = 0;
      random = (int) ( 25 * Math.random() );
      finish = false;
      
      // add label to the frame
      add( label );
      
      // add buttons into array
      for( int k = 0; k < 25; k++)
      {
         // create button
         button = new JButton( "Find" );
         
         // change buttons' size and colors
         button.setPreferredSize(new Dimension(300, 150));
         button.setBackground(Color.BLACK);
         button.setForeground(Color.WHITE);
         button.setFont(new Font("Arial", Font.PLAIN, 40));
         
         // add them into array
         buttons[k] = button;
      }
      
      // add all buttons from the array and add MyActionListener to them
      for( int k = 0; k < 25; k++)
      {
         buttons[k].addActionListener( new MyActionListener() );
         panel.add( buttons[k] );
      }
      
      // add panel
      add( panel );
      
      
      // set layout
      setLayout( new FlowLayout() );
      panel.setLayout( new GridLayout( 5, 5, 10, 10 ) );
      
      // make panel visible
      setVisible( true );
   }
   
   // methods
   
   // inner MyActionListener Class
   public class MyActionListener implements ActionListener
   {
      /**
       * actionPerformed manages the game
       * @param ActionEvent e
       */
      public void actionPerformed( ActionEvent e )
      {
         // increase the number
         number++;
         
         // make boolean true if the user finds the prize
         if( number == random )
            finish = true;
         
         // if finish is true, say the number of try
         if( finish == true )
         {
            label.setText( "You found the secret button in " + number + " try." );
            number--;
            
            // make button disable
            for( int k = 0; k < 25; k++)
            {
               buttons[k].setEnabled(false);
            }
         }
      }
   }
}