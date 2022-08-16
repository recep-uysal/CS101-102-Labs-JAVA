/**
 * A simple Java class!
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
   public double getArea()
   {
      return ( 3.14 * radious * radious );
   }
   
   public String toString()
   {
      return ( "A circle with the radious: " + radious);
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
      
      if ( ( a - x ) * ( a - x ) + ( b - y ) * ( b - y ) <= radious * radious )
         return true;
      
      return false;
   }
}