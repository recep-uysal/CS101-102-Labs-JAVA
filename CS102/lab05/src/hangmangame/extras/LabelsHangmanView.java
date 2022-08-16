package hangmangame.extras;

import cs102.hangman.*;
import hangmangame.extras.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import cs102.hangman.IHangmanView;

/**
 * Labels Class
 * @author Recep Uysal
 * @version 13.04.2020
 */
public class LabelsHangmanView extends JPanel implements IHangmanView
{
   // proporties
   JLabel incorrect;
   JLabel known;
   JLabel usedLetters;
   JLabel lost;
   
   // constructors
   public LabelsHangmanView()
   {
      super();
      setPreferredSize( new Dimension(400,200) );
      
      // create all labels into center
      incorrect = new JLabel( "", SwingConstants.CENTER);
      known = new JLabel( "", SwingConstants.CENTER);
      usedLetters = new JLabel( "", SwingConstants.CENTER );
      lost = new JLabel( "", SwingConstants.CENTER );
      
      // change labels fonts
      incorrect.setFont( new Font( "Times New Roman", Font.BOLD, 30 ) );
      known.setFont( new Font( "Times New Roman", Font.BOLD, 30 ) );
      usedLetters.setFont( new Font( "Times New Roman", Font.BOLD, 30 ) );
      lost.setFont( new Font( "Times New Roman", Font.BOLD, 30 ) );
      
      // set gridLayout
      setLayout( new GridLayout(4,0) );
      
      // add labels
      add( known );
      add( incorrect );
      add( usedLetters );
      add( lost );
      
      // change color
      setBackground( Color.GREEN );
      
      // set visible
      setVisible( true );
   }
   
   // methods
   /**
    * updateView updates the labels
    * @param Hangman hangman
    */
   @Override
   public void updateView( Hangman hangman )
   {
      // if the game continue
      if ( !hangman.isGameOver() ) 
      {
         known.setText( hangman.getKnownSoFar() );
         incorrect.setText( "Tries: " + hangman.getNumOfIncorrectTries() );
         usedLetters.setText( "Used letters: " + hangman.getUsedLetters() );
      }
      
      else
      {
         // if the game has been lost
         if ( hangman.hasLost() )
         {
            known.setText( hangman.getKnownSoFar() );
            incorrect.setText(  hangman.getNumOfIncorrectTries() + " tries!!" );
            usedLetters.setText( hangman.getUsedLetters() );
            lost.setText( "You Lost." );
         }
         // if the game has been won
         else
         {
            known.setText( hangman.getKnownSoFar() );
            incorrect.setText(  hangman.getNumOfIncorrectTries() + " tries!!" );
            usedLetters.setText( hangman.getUsedLetters() );
            lost.setText( "You won." );
         }
      }
   }
}