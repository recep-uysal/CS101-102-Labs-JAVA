/**
 * Shape Class
 * @author Recep Uysal
 * @version 09.03.2020
 */
public abstract class Shape implements Locatable
{
   // properties
   int x;
   int y;
   // constructors
   
   // methods
   public abstract double getArea();
   
   /**
    * method getX shows x
    * @return x shows x
    */
   public int getX()
   {
      return x;
   }
   
   /**
    * method getY shows y
    * @return y shows y
    */
   public int getY()
   {
      return y;
   }
   
   /**
    * method setLocation changes selected
    * @param x is the x coordinate of shape
    * @param y is the y coordinate of shape
    */
   public void setLocation( int x, int y)
   {
      this.x = x;
      this.y = y;
   }
}