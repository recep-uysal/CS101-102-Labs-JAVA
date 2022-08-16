import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * My Frame
 * @author Recep Uysal
 * @version 30.03.2020
 */ 
public class MyFrame extends JFrame
{
   // constructors
   public MyFrame()
   {
      MyPanel panel;
      
      // create MyPanel object
      panel = new MyPanel();
      
      // add My Window Listener to close to window
      addWindowListener( new MyWindowListener() );
      
      // add panel to the frame
      add( panel );
      
      pack();
      
      setLayout( new BorderLayout() );
      
      // make it visible
      setVisible( true );
   }
   
   // methods
   
   // inner MyWindowListener class
   public class MyWindowListener extends WindowAdapter
   {
      /**
       * windowClosing provides closing the window 
       * @param WindowEvent e
       */
      @Override
      public void windowClosing( WindowEvent e )
      {
         dispose();
      }
   }
}