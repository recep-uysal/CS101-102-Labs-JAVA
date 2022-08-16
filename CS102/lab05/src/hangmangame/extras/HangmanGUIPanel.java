package hangmangame.extras;

import cs102.hangman.HangmanModel;
import cs102.hangman.*;
import hangmangame.extras.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * GUI Panel Class
 * @author Recep Uysal
 * @version 13.04.2020
 */
public class HangmanGUIPanel extends JPanel {
   
   HangmanModel hm;
   
   public HangmanGUIPanel( HangmanModel hm) 
   {
      this.hm = hm;
      setPreferredSize( new Dimension( 1000, 600) );
      setLayout( new BorderLayout() );
      
      // variables
      TextFieldControlPanel panel1;
      NewGameButtonControl controlButton;
      LabelsHangmanView labels;
      GallowsHangmanView gallow;
      HangmanLetterButtonControls buttons;
      
      // initialise all variables
      panel1 = new TextFieldControlPanel( hm );
      controlButton = new NewGameButtonControl( hm );
      labels = new LabelsHangmanView();
      gallow = new GallowsHangmanView( hm );
      buttons = new HangmanLetterButtonControls( hm, 13, 2 );
      
      // add actionlistener to all buttons
      buttons.addActionListener(new HangmanLetterButtonsController( hm ));
      
      // set layouts and add them into hangmanGUIPanel
      add( panel1, BorderLayout.PAGE_START  );
      add( controlButton, BorderLayout.PAGE_END );
      add( labels, BorderLayout.WEST );
      add( gallow, BorderLayout.CENTER );
      add( buttons, BorderLayout.EAST );
      
      // add views to all of the variables
      hm.addView( labels );
      hm.addView( buttons );
      hm.addView( gallow );
      hm.addView( controlButton );
   }
}
