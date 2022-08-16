/**
 * Circle Class
 * @author Recep Uysal
 * @version 09.03.2020
 */ 
public class Circle extends Shape implements Selectable
{
   // properties
   int radious;
   boolean selected;
 
   // constructors
   public Circle( int radious, int x, int y )
   {
      this.radious = radious;
      setLocation(x, y);
   }
   
   // methods
   /**
    * method getArea shows area
    * @return the area
    */
   public double getArea()
   {
      return ( 3.14 * radious * radious );
   }
   
   /**
    * method toString gives the information about circle
    * @return gives the information
    */
   public String toString()
   {
      return ( "A circle with the radious: " + radious + " and the point (" + x + "," + y + ")" + " selected: " + selected);
   }
     
   /**
    * method getSelected shows selected
    * @return selected shows selected
    */
   public boolean getSelected()
   {
      return selected;
   }
   
   /**
    * method setSelected changes selected
    */
   public void setSelected( boolean selected )
   {
      this.selected = selected;
   }
   
   /**
    * method contains finds the shape which has x and y
    * @param x is the x coordinate
    * @param y is the y coordinate
    * @return shape which contains the x and y
    */
   public Shape contains( int x, int y )
   {
      int a;
      int b;
      
      a = getX();
      b = getY();
      
      if ( (( a - x ) * ( a - x )) + (( b - y ) * ( b - y )) <= (radious * radious) )
         return this;
      else
         return null;
   }
}