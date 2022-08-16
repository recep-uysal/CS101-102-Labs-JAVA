import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import shapes.*;

/**
 * My Balloon Class
 * @author Recep Uysal
 * @version 06.04.2020
 */ 
public class Balloon extends Circle implements Drawable
{
   // proporties
   Graphics g;
   
   // constructors
   public Balloon()
   {
      super( 25, 0, 0 );
      
      int x;
      int y;
      
      // Create random x and y
      x = (int) ( 700 * Math.random() );
      y = (int) ( 700 * Math.random() );
      
      // set location
      this.setLocation( x, y );
   }
   
   // methods
   /**
    * method grow increase the size of the radious
    * @return true if it increases
    */
   public boolean grow() 
   {
      // increase radious
      this.radious++;
      
      // if radious equals to max number
      if ( this.radious >= 100 ) 
      {
         // set radious to zero
         this.radious = 25;
      }
      
      // if radious is zero
      if( this.radious == 25 )
         return false;
      else
         return true;
   }
   
   /**
    * method draw draws the circles
    * @param g is the graphics object we want to draw
    */
   public void draw( Graphics g )
   {
      // set color
      int random;
      random = (int) ( 3 * Math.random() );
      if( random == 0 )
         g.setColor( Color.RED );
      if( random == 1 )
         g.setColor( Color.BLUE );
      if( random == 2 )
         g.setColor( Color.GREEN );
      
      // draw
      g.drawOval( this.getX() - radious, this.getY() - radious, 2 * this.radious, 2 * this.radious );   
   }
}