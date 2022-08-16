package hangmangame.extras;

import cs102.hangman.*;
import hangmangame.extras.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * NewGame Button Control Class
 * @author Recep Uysal
 * @version 13.04.2020
 */
public class NewGameButtonControl extends JButton implements IHangmanView
{
   // proporties
   Hangman hm;
   
   // constructors
   public NewGameButtonControl( Hangman hangman )
   {
      super( "New Game" );
      hm = hangman;
      
      // add actionlistener
      addActionListener( new MyActionListener2() );
      
      // set button disabled
      setEnabled( false );
   }
   // methods
   // inner MyActionListener2 Class
   private class MyActionListener2 implements ActionListener
   {
      /**
       * actionPerformed manages the new game button
       * @param ActionEvent e
       */
      public void actionPerformed(ActionEvent e)
      {
         // start a new game
         hm.initNewGame();
         // make button disabled
         setEnabled( false );
      }
   }
   
   /**
    * updateView updates the new game button
    * @param Hangman hangman
    */
   @Override
   public void updateView( Hangman hangman )
   {
      // if the game finished
      if ( hangman.isGameOver() )
      {
         setEnabled(true);
      }
   }
}