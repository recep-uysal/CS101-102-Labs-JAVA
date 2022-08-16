package hangmangame.extras;

import cs102.hangman.*;
import hangmangame.extras.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Gallow Class
 * @author Recep Uysal
 * @version 13.04.2020
 */
public class GallowsHangmanView extends JPanel implements IHangmanView
{
   // proporties
   Hangman hangman;
   String secretWord;
   String tries;
   String usedWords;
   
   // constructors
   public GallowsHangmanView( Hangman hangman )
   {
      super();
      this.hangman = hangman;
      // set size
      setPreferredSize( new Dimension(400,200) );
      
      // change background color
      this.setBackground(Color.YELLOW);
      
      // initilise strings
      secretWord = "";
      tries = "";
      usedWords = "";
   }
   
   // methods
   /**
    * updateView updates the strings
    * @param Hangman hangman
    */
   @Override
   public void updateView(Hangman hangman)
   {
      // if the game continue
      if ( !hangman.isGameOver() ) 
      {
         secretWord = hangman.getKnownSoFar();
         tries = "Tries: " + hangman.getNumOfIncorrectTries();
         usedWords = "Used letters: " + hangman.getUsedLetters();
      }
      else
      {
         // if the game has been lost
         if ( hangman.hasLost() )
         {
            secretWord = "Oops";
            tries = "You lost!";
            usedWords = "You used: " + hangman.getUsedLetters();
         }
         // if the game has been won
         else
         {
            secretWord = "In " + hangman.getNumOfIncorrectTries();
            tries = "You won!!";
            usedWords = "You used: " + hangman.getUsedLetters();
         }
      }
      
      repaint();
   }
   /**
    * paintComponent draw gallow and man
    * @param graphics g
    */
   @Override
   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );
      
      // draw gallow
      g.setColor( Color.BLACK );
      g.fillRect( 20, 450, 250, 50 ) ;
      g.fillRect( 60, 90, 20, 360 );
      g.fillRect( 80, 90, 113, 20 );
      g.fillRect( 187, 110, 6, 30 );
      
      // draw head
      if( hangman.getNumOfIncorrectTries() == 1 )
      {
         g.drawOval( 160, 140, 60, 60 );
      }
      
      // draw body
      else if( hangman.getNumOfIncorrectTries() == 2 )
      {
         g.drawOval( 160, 140, 60, 60 );
         g.drawLine( 190, 200, 190, 270 );
      }
      
      // draw left arm
      else if( hangman.getNumOfIncorrectTries() == 3 )
      {
         g.drawOval( 160, 140, 60, 60 );
         g.drawLine( 190, 200, 190, 270 );
         g.drawLine( 190, 210, 140, 250 );
      }
      
      // draw right arm
      else if( hangman.getNumOfIncorrectTries() == 4 )
      {
         g.drawOval( 160, 140, 60, 60 );
         g.drawLine( 190, 200, 190, 270 );
         g.drawLine( 190, 210, 140, 250 );
         g.drawLine( 190, 210, 240, 250 );
      }
      
      // draw right leg
      else if( hangman.getNumOfIncorrectTries() == 5 )
      {
         g.drawOval( 160, 140, 60, 60 );
         g.drawLine( 190, 200, 190, 270 );
         g.drawLine( 190, 210, 140, 250 );
         g.drawLine( 190, 210, 240, 250 );
         g.drawLine( 190, 270, 240, 320 );
      }
      
      // draw left leg
      else if ( hangman.getNumOfIncorrectTries() == 6 )
      {
         g.drawOval( 160, 140, 60, 60 );
         g.drawLine( 190, 200, 190, 270 );
         g.drawLine( 190, 210, 140, 250 );
         g.drawLine( 190, 210, 240, 250 );
         g.drawLine( 190, 270, 240, 320 );
         g.drawLine( 190, 270, 140, 320 );
      }
      
      // add strings
      g.drawString( secretWord, 40, 560 );
      g.drawString( usedWords, 40, 620 );
      g.drawString( tries, 165, 400 );
   }
}