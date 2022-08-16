/**
 * A simple Java class!
 */
public class Rectangle extends Shape implements Selectable
{
   // properties
   int height;
   int widht;
   boolean selected;

   // constructors
   public Rectangle( int widht, int weight, int x, int y )
   {
      this.height = height;
      this.widht = widht;
      setLocation(x, y);
   }
   
   // methods
   public double getArea()
   {
      double area = (double)( widht * height ); 
      return area;
   }
      
   public String toString()
   {
      return ( "The rectangle with the height " + height + " and the widht " + widht );
   }
   
   public boolean getSelected()
   {
      return selected;
   }
   
   public void setSelected( boolean selected )
   {
      this.selected = selected;
   }
   
   public boolean contains( int x, int y )
   {
      int a;
      int b;
      
      a = getX();
      b = getY();
      
      if( x <= a + widht / 2 && x >= a - widht / 2 && y <= b + widht / 2 && y >= b - widht / 2 )
         return true;
      
      return false;
   }
}