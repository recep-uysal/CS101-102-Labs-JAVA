import java.util.*;
/**
 * A simple Java class!
 */
public class ShapeContainer {
   
   //proporties
   ArrayList<Shape> shapes;
   
   //constructors
   public ShapeContainer ()
   {
      shapes = new ArrayList<Shape>();
   }
   
   //methods
   public void addShape( Shape s)
   {
      shapes.add( s );
   }
   
   public double getArea()
   {
      double area;
      area = 0.0;
      
      for( int i = 0; i < shapes.size(); i++)
      {
         area = area + shapes.get(i).getArea();
      }
      
      return area;
   }
   
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
}