package hangmangame.extras;

import cs102.hangman.*;
import hangmangame.extras.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Letter Buttons Controller Class
 * @author Recep Uysal
 * @version 13.04.2020
 */
public class HangmanLetterButtonsController implements ActionListener
{
   //properties 
   Hangman hm;
   
   //constructor
   public HangmanLetterButtonsController( Hangman hangman )
   {
      hm = hangman;
   }
   
   // methods
   /**
    * actionPerformed manages the letters buttons
    * @param ActionEvent e
    */
   public void actionPerformed( ActionEvent e) 
   {
      // get the word on the world
      JButton button = (JButton) e.getSource();
      
      // get the letters
      char letter = button.getText().charAt(0);
      
      // try it
      hm.tryThis( letter );
   }
} 