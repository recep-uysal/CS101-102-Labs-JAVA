package hangmangame.extras;

import cs102.hangman.*;
import hangmangame.extras.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Letter Button Control Class
 * @author Recep Uysal
 * @version 13.04.2020
 */
public class HangmanLetterButtonControls extends LetterButtonControls implements IHangmanView
{
   //constructor
   public HangmanLetterButtonControls( Hangman hangman, int rows, int coloumns )
   {
      super( hangman.getAllLetters(), rows, coloumns );
      // set size
      this.setPreferredSize( new Dimension( 300, 250)  );
      //set font
      this.setFont( new Font( "Calibri", Font.BOLD, 25 ) );
   }
   
   // methods
   /**
    * updateView updates the letter buttons
    * @param Hangman hangman
    */
   @Override
   public void updateView(Hangman hangman)
   {
      //if the game continue
      if ( !hangman.getUsedLetters().equals("") )
         this.setDisabled( hangman.getUsedLetters() );
      
      //if the game is over
      if ( hangman.isGameOver() )
         setEnabledAll( true );
   }
}
