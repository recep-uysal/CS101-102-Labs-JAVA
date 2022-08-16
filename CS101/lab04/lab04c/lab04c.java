import java.util.Scanner;

/**
 * Positive Value Calculator
 * @author Recep Uysal
 * @version 31.10.2019
 */ 
public class lab04c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // variables
      int n;
      double average;
      double sum;
      double count;
      double max;
      double min;

      // program code
      n = 0;
      count = 0;
      sum = 0;
      n = scan.nextInt(); 
      max = n;
      min = n;
      sum = n;
      count = 1;
      
      while ( n >= 0 )
      {
         n = scan.nextInt(); 
         if ( n < 0 )
         {
            count = count + 0;
            sum = sum + 0;
            min = min + 0;
         }
         else
         {
            count = count + 1;
            sum = sum + n;
         
         if ( n > max )
            max = n;
            
         if ( n < min )
            min = n;
         }
         
      }
      average = sum / count;
      System.out.println( "The average is " + average );
      System.out.println( "The maximum value is " + max );
      System.out.println( "The minimum value is " + min );
   }

}