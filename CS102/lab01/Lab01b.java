import java.util.Scanner;

/**
 * IntBag Test Program
 * @author Recep Uysal
 * @version 17.02.2020
 */ 
public class Lab01b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      IntBag primeNumbers;
      int prime;

      // program code
      primeNumbers = new IntBag(100);
      primeNumbers.add( 2);
      
      for( int k = 1; k < 99;k++)
      {
         prime = primeNumbers.get( k ) + 1;
         int check;
         
         do{
            check = 0;
            for ( int i = 2; i < prime; i++)
            {
               if ( prime % i == 0)
                  check++;
            }
            
            if( check != 0)
               prime++;
            
         } while( check != 0);

         primeNumbers.add( prime);
      }

      System.out.println( primeNumbers);
   }

}