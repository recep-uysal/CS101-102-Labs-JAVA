/**
 * A simple Java class!
 */
public class Square extends Rectangle
{
   // properties
   int side;

   // constructors
   public Square( int side, int x, int y )
   {
      super( side, side, x, y );
      this.side = side;
   }
   
   // methods
   public double getArea()
   {
      return super.getArea();
   }
   
   public String toString()
   {
      return ( "A square with the side: " + side );
   }
}