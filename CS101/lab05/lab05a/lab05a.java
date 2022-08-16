import java.util.Scanner;

/**
 * Rectangle Creater
 * @author Recep Uysal
 * @version 07.11.2019
 */ 
public class lab05a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      int widht;
      int height;
      int thickness;
      int lineNumber;
      int countOfStars;
      int countOfSpace;
      
      // program code
      //1. Enter widht, height and thickness
      System.out.println( "Please enter widht");
      widht = scan.nextInt();
      System.out.println( "Please enter height");
      height = scan.nextInt();
      System.out.println( "Please enter thickness");
      thickness = scan.nextInt();
      
      //2.Check the values
      if ( widht <= 0 || height <= 0 || thickness <= 0 )
         System.out.println( "Please enter positive value");
      else
      {
         //3. Check the hole
         if ( widht <= 2 * thickness || height <= 2 * thickness)
         {
            for ( lineNumber = 0; lineNumber < height; lineNumber = lineNumber + 1 )
            {   
               if ( lineNumber != 0 )
                  System.out.println( "");
               for ( countOfStars = 0; countOfStars < widht ; countOfStars = countOfStars + 1)
                  System.out.print( "*");
            }      
            
            System.out.println( "");
            System.out.println( "There is no hole");
         }
         else
         {
            //4. Print Rectangle
            for ( lineNumber = 0; lineNumber < thickness; lineNumber = lineNumber + 1 )
            {   
               if ( lineNumber != 0 )
                  System.out.println( "");
               for ( countOfStars = 0; countOfStars < widht ; countOfStars = countOfStars + 1)
                  System.out.print( "*");
            }      
            
            System.out.println( "");
            for ( lineNumber = thickness; lineNumber < height - thickness; lineNumber = lineNumber + 1)
            {
               if ( lineNumber != thickness )
                  System.out.println( "");
               for ( countOfStars = 0; countOfStars < thickness ; countOfStars = countOfStars + 1)
                  System.out.print( "*");
               for ( countOfSpace = 0; countOfSpace < widht - 2 * thickness ; countOfSpace = countOfSpace + 1)
                  System.out.print( " ");
               for ( countOfStars = 0; countOfStars < thickness ; countOfStars = countOfStars + 1)
                  System.out.print( "*");
            }
            
            System.out.println( "");
            for ( lineNumber = height - thickness; lineNumber < height; lineNumber = lineNumber + 1)
            {
               if ( lineNumber != height - thickness )
                  System.out.println( "");
               for ( countOfStars = 0; countOfStars < widht ; countOfStars = countOfStars + 1)
                  System.out.print( "*");
            }
         } 
      }
      
      
      
      
      
      
      
      
     
      


    
   }

}