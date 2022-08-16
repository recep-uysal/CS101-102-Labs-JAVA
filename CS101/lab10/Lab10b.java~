import java.util.Scanner;

/**
 * The biggest BigNum
 * @author Recep Uysal
 * @version 19.12.2019
 */ 
public class Lab10b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      BigNum[] numbers;
      BigNum[] clone;
      String random;
      int turn;
      int digit;
      BigNum max;
      int indexOfMax;
      
      // program code
      // create BigNum array and its clone
      clone = new BigNum[10];
      numbers = new BigNum[10];
      
      // Create BigNums using Math.random
      for ( int i = 0; i < numbers.length; i++)
      {
         random = "";
         
         for ( int k = 0; k < BigNum.SIZE ; k++)
         {
            digit = (int)(Math.random() * BigNum.BASE);
            
            if ( digit < 10 && digit >= 0)
               random = random + digit;
            else
            {
               random = random + (char)(digit + 'A' - 10);
            }
         }
         
         numbers[i] = new BigNum(random);
      }
      
      // take a input from user
      do {
         System.out.println( "Please enter a number between 1 and 10 and in order to quit, press negative numbers");
         turn = scan.nextInt();
         
         // find max Bignum
         max = numbers[0];
         
         for ( int b = 1; b < turn; b++)
         {
            if ( max.isLessThan( numbers[b]))
            {
               max = numbers[b];
            }
         }
         
         // if input < 0, shows only BigNums
         if ( turn <= 0)
         {
            for ( BigNum k : numbers)                      
               System.out.println( k );
         }
         else
         {
            // find the index of max BigNum
            indexOfMax = 0;
            for (int k = 0; k < turn; k++)
            {
               if ( numbers[k].equals(max))
                  indexOfMax = k;
            }
            
            // Priny the max BigNum
            System.out.println( "max BigNum " + max);
            
            // create clone array
            clone = numbers.clone();
            
            // Change the index of max in clone array
            clone[turn - 1] = numbers[indexOfMax];
            clone[indexOfMax] = numbers[turn - 1];
            
            // Make Numbers same with clone
            numbers = clone;
            
            // Print BigNum array
            for ( BigNum k : numbers)                      
               System.out.println( k );
         }
      // quit the program 
      } while ( turn >= 0 );
   }
}