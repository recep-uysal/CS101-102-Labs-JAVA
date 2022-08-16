import java.util.*;
/**
 * ShapeContainer Class
 * @author Recep Uysal
 * @version 09.03.2020
 */
public class ShapeContainer implements Iterable
{
   
   //proporties
   ArrayList<Shape> shapes;
   
   //constructors
   public ShapeContainer ()
   {
      shapes = new ArrayList<Shape>();
   }
   
   //methods
   /**
    * method addShape adds shapes into ArrayList
    * @param s is the shape
    */
   public void addShape( Shape s)
   {
      shapes.add( s );
   }
   
   /**
    * method getArea shows total area
    * @return the total area
    */
   public double getArea()
   {
      double area;
      area = 0.0;
      
      for( int i = 0; i < shapes.size(); i++)
      {
         area = area + shapes.get(i).getArea() ;
      }
      
      return area;
   }
   
   /**
    * method toString gives the total information
    * @return gives the total information
    */
   public String toString()
   {
      String word;
      word = "";
      
      for( int i = 0; i < shapes.size(); i++)
      {
         word = word + shapes.get(i).toString() + "    ";
      }
      
      return word;
   }
   
   /**
    * method find finds the first shape 
    * @param x is the x coordinate of the point
    * @param y is the y coordinate of the point
    * @return returns shape
    */
   public Shape find( int x, int y )
   {
      int k;
      k = 0;
      
      while( ((Selectable) shapes.get(k)).contains( x, y ) != null)
      {
         if ( ((Selectable) shapes.get(k)).contains( x, y ) == shapes.get(k))
         {
            ((Selectable) shapes.get(k)).setSelected( true);
            return shapes.get(k);
         }
         k = k + 1;
      } 
      
      return null;
   }
   
   /**
    * method remove removes the shape
    */
   public void remove()
   {
      for( int i = shapes.size() - 1; i >= 0 ; i--)
      {
         if( ( (Selectable) shapes.get(i) ).getSelected() )
            shapes.remove( i );
      }
   }
   
   /**
    * method Size gives the size of the shapeContainer
    * @return the size of the shapeContainer
    */
   public int size()
   {
      return shapes.size();
   }
   
   /**
    * method selectAllAt select all shapes with given x, y
    * @param x is the x coordinate
    * @param y is the y coordinate
    * @return count is the number of shape
    */
   public int selectAllAt( int x, int y )
   {
      int count;
      count = 0;
      
      for( int i = 0; i < shapes.size(); i++ ) 
      {
         if ( ( (Selectable) shapes.get( i ) ).contains( x, y ) != null )
         {
            ( (Selectable) shapes.get( i ) ).setSelected( true );
            ++count;
         }
      }
      
      return count;
   }
   
   /**
    * method iterator makes shapeContainer iterator
    * @return iterator of the shapeContainer
    */
   public Iterator iterator()
   {
      return shapes.iterator();
   }
}
