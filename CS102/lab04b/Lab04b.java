import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import shapes.*;

/**
 * Balloons Game
 * @author Recep Uysal
 * @version 06.04.2020
 */ 
public class Lab04b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      JFrame frame;
      BalloonsGamePanel panel;
      
      // program code
      // create frame and balloonsGamePanel
      frame = new JFrame();
      panel = new BalloonsGamePanel();
      
      // add balloonsGamePanel to the frame
      frame.add( panel );
      
      // set layout of the frame
      frame.setLayout( new FlowLayout() );
      
      frame.pack();
      
      // make frame visible
      frame.setVisible( true );
   }
}