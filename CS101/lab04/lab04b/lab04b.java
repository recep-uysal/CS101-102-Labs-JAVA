import java.util.Scanner;

/**
 * Min Max Numbers
 * @author Recep Uysal
 * @version 31.10.2019
 */ 
public class lab04b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
     
      // variables
      int n;
      double sum;
      double count;
      double average;
      double max;
      double min;
      
      // program code
      sum = 0;
      count = 0;
      n = scan.nextInt();
      min = n;
      max = n;
      sum = n;
      count = 1;
      while ( count < 100 )
      {  
         n = scan.nextInt();
         sum = sum + n;
         count = count + 1;
         
         if ( n > max )
            max = n;
         
         if ( n < min )
            min = n;
      }
      
      System.out.println( "The sum is " + sum );
      System.out.println( "The count is " + count );
      average = sum / count;
      System.out.println( "The average is " + average );
      System.out.println( "The maximum value is  " + max );
      System.out.println( "The minimum value is  " + min );
   }
   
}