import java.util.Scanner;

/**
 * Shape tester
 * @author Recep Uysal
 * @version 08.03.2020
 */ 
public class ShapeTester
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      int option;
      int x;
      int y;
      ShapeContainer shapes;
      Circle circle;
      Rectangle rectangle;
      Square square;
      
      // program code
      shapes = null;
      
      do{
      System.out.println( "1.create an empty set of shapes");
      System.out.println( "2.add shape");
      System.out.println( "3.show total area");
      System.out.println( "4.show info");
      System.out.println( "5.find a shape");
      System.out.println( "6.remove all shapes");
      System.out.println( "7.exit");
      
      option = scan.nextInt();
      
      if( option == 1 )
         shapes = new ShapeContainer();
      
      if( option == 2)
      {
         int selection;
         
         do{
         System.out.println( "1.Circle");
         System.out.println( "2.Rectangle");
         System.out.println( "3.Square");
         System.out.println( "4.Back to Menu");
         
         selection = scan.nextInt();
         
         if( selection == 1 )
         {
            int radious;
            
            System.out.println( "Please enter radious" );
            radious = scan.nextInt();
            System.out.println("Please enter x axis");
            x = scan.nextInt();
            System.out.println("Please enter y axis");
            y = scan.nextInt();
            
            circle = new Circle( radious, x, y );
            shapes.addShape( circle );
         }
         
         if( selection == 2 )
         {
            int height;
            int widht;
            
            System.out.println( "Please enter height" );
            height = scan.nextInt();
            System.out.println( "Please enter widht" );
            widht = scan.nextInt();
            System.out.println("Enter x axis");
            x = scan.nextInt();
            System.out.println("Enter y axis");
            y = scan.nextInt();
            
            rectangle = new Rectangle( widht, height, x, y );
            shapes.addShape( rectangle );
         }
         
         if( selection == 3 )
         {
            int side;
            
            System.out.println( "Please enter side" );
            side = scan.nextInt();
            System.out.println("Please enter x axis");
            x = scan.nextInt();
            System.out.println("Please enter y axis");
            y = scan.nextInt();
            
            square = new Square( side, x, y );
            shapes.addShape( square );
         }
         
         } while( selection != 4 );
      }
      
      if( option == 3)
      {
         System.out.println( shapes.getArea() );
      }
      
      if( option == 4)
      {
         System.out.println( shapes.toString() );
      }
      
      if( option == 5 )
      {
         System.out.println("Please enter x axis:");
         x = scan.nextInt();
         System.out.println("Please enter y axis:");
         y = scan.nextInt();
         
         for( int k = 0; k < shapes.shapes.size();k++)
         {
            if( shapes.shapes.get(k).contains( x, y ))
            {
               shapes.shapes.get(k).setSelected( true );
               System.out.println( shapes.shapes.get(k).toString());
            }
         }
      }
      
      if( option == 6 )
      {
         for( int k = 0; k < shapes.shapes.size();k++)
         {
            shapes.shapes.remove(k);
         }
      }
      
      } while ( option != 7);
   }
}