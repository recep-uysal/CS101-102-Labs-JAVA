import java.util.Scanner;
/**
 * Numbers Program
 * @author Recep Uysal
 * @version 24.10.2019
 */ 
public class lab03a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      int countodd;
      int counteven;
      int number;
      double sum1;
      double sum2;
      
      // program code
      System.out.println( "Please enter a Number" );
      number = scan.nextInt();
      sum1 = number * ( number + 1 ) * 0.5;
      
      countodd=0;
      counteven=0;
      sum2=0;
      
      for ( int x = 0; x <= 50; x++ )
      {
         System.out.println( x );
         
         if ( x<12 || x>25 )
            System.out.println( "out of range 12-25 " );
         
         if ( x % 2 == 0 )
            counteven = counteven + 1;
         else
            countodd = countodd + 1;
         
         if ( x % 5 == 0)
            System.out.println( "Hi Five " );
         else
         {
            if ( x % 2 == 0)
               System.out.println( "Hi Two " );
            else
            {
               if ( x % 3 ==0 || x % 7 == 0 )
                  System.out.println( "Hi ThreeOrSeven " );
               else
                  System.out.println( "Hi Others " );
            } 
         }
         if ( x>0 && x <= number)
            sum2 = sum2 + x;
         
      }
      if ( sum1 == sum2 )
         System.out.println( "They are same " );
      else
         System.out.println( "They are not same " );
      
      
      System.out.println (" The number of even values is " + counteven);
      System.out.println (" The number of odd values is " + countodd);
      
      
   }
}

