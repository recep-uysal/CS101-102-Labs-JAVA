package hangmangame.extras;

import cs102.hangman.*;
import hangmangame.extras.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * TextFiels Control Class
 * @author Recep Uysal
 * @version 13.04.2020
 */
public class TextFieldControlPanel extends JPanel
{
   // proporties
   Hangman hangman;
   JTextField text;
   
   // constructors
   public TextFieldControlPanel ( Hangman h )
   {
      super();
      hangman = h;
      text = new JTextField( 50 );
      
      add( text ); 
      text.addActionListener( new MyActionListener() );
   }
   
   // methods
   // inner MyActionListener Class
   private class MyActionListener implements ActionListener
   {
      /**
       * actionPerformed manages the textField
       * @param ActionEvent e
       */
      public void actionPerformed( ActionEvent e )
      {
         String word = text.getText();
         
         for ( int i = 0; i < word.length(); i++ )
         {
            hangman.tryThis( word.charAt( i ) );
         }

         text.setText( "" );
      }
      
   }
}
