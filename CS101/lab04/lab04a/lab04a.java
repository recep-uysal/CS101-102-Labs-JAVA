import java.util.Scanner;

/**
 * While Program
 * @author Recep Uysal
 * @version 31.10.2019
 */ 
public class lab04a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
     
      // variables
      int n;
      int a;
      int square; 
      int number;
      double division;
      
      // program code
      
      // 1. Enter a Number and Check
      n = scan.nextInt();
      
      if ( n < 0 )
         System.out.println( "Please enter a positive number" );
      
      // 2. While 1. Step
      a = 0;
      System.out.println( "Output the integer values from 0 up to n exclusive" );
      
      while (a < n)
      {   
         System.out.print( a + " " );
         a = a + 1;
      }   
      
      // 3. While 2. Step
      System.out.println( " " );
      System.out.println( " " );
      System.out.println( "Output the integer values from 0 up to n exclusive (five values per line)" );
      a = 0;
      
      while (a < n)
      {   
         if ( a % 5 == 4)
         {
            System.out.println( a + " " );
         }   
         else
            System.out.print( a + " " );
         a = a + 1;
      }   
      
      // 4. While 3. Step
      System.out.println( " " );
      System.out.println( " " );
      System.out.println( "Output the integer values from n down to 0 inclusive" );
      a = n;
      
      while (a >= 0)
      {   
         System.out.print( a + " " );
         a = a - 1;
      }  
      
      // 5. While 4. Step
      System.out.println( " " );
      System.out.println( " " );
      System.out.println( " Output the even values from -n up to n inclusive." );
      a = -n;
      
      while (a <= n )
      {   
         if ( a % 2 == 0)
         {
            System.out.print( a + " " );
            a = a + 1;
         }
         else
            a = a + 1;
      }
      
      // 6. While 5. Step
      System.out.println( " " );
      System.out.println( " " );
      System.out.println( "Output (separated by spaces, five numbers per line ) the squares of the even values from 0 up to n inclusive" );
      a = 0;
      number=0;
      
      while (a <= n)
      {   
         square = 0;
         if ( a % 2 == 0)
         {
            number = number + 1;
            if (number == 5)
            {
               square = a * a;
               System.out.println( square + " " );
               number = 0;
            }
            else
            {  
               square = a * a;
               System.out.print( square + " " ); 
            }
         }
         a = a + 1;
      }
      
      // 7. While 6. Step 
      System.out.println( " " );
      System.out.println( " " );
      System.out.println( "Output (separated by spaces, five numbers per line) the values which are divisible by 3 or 4, but not both, from n down to 3 inclusive" );
      a = n;
      number = 0;
      
      while (a <= n && a >= 3)
      {   
         if ( a % 12 != 0 && (a % 3 == 0 || a % 4 == 0))
         {   
            number = number + 1;
            
            if ( number == 5)
            {   
               System.out.println( a + " " );
               number = 0;
            }
            else
            {
               System.out.print( a + " " );
            }
         }
         a = a - 1;
      }
      
      // 8. While 7. Step
      System.out.println( " " );
      System.out.println( " " );
      System.out.println( "Output all of the divisors of n" );
      a = 2;
      
      while ( a <= n && a > 1)
      {
         if ( n % a == 0 )
         {
            System.out.print( a + " " );
         }
         a = a + 1;
      }
      
      // 9. While 8. Step
      System.out.println( " " );
      System.out.println( " " );
      System.out.println( "For every integer k from n down to 1, outputs the values of 1 / k  that are greater than 0.01" );
      a = n;
      division = 0;
      
      while ( a <= n && a >= 1 )
      {
         division = 1.0 / a;
         if ( division > 0.01 )
         {
            System.out.printf("%.2f", division);
            System.out.print( " ");
         }
         a = a - 1;
      }
      
   }
   
}