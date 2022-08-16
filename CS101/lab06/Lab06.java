import java.util.Scanner;

/**
 * Math Program
 * @author Recep Uysal
 * @version 14.11.2019
 */ 
public class Lab06
{
 
   /**
    * The method compute the power of a value.
    * @param value is a number that we want to compute the power of it. 
    * @param value2 is power.
    * @return is the value2'th power of parameter value.
    */
   public static double power( double value, int value2 ) 
   {
      double result;
      
      result = 1;
      while (value2 != 0 )
      {
         result = result * value;
         value2 = value2 - 1;
      }
      return result;
   }
  
   /**
    * The method compute a factorial of any value.
    * @param number is a value which we want to compute the factorial of it.
    * @return is the factorial of parameter number.
    */
   public static long factorial( int number ) 
   {
      long result;
      
      result = 1;
      for ( int counter = 1; counter <= number; counter = counter + 1)
      {
         result = result * counter;
      }
      return result;
   }

   /**
    * The method reverse words in sentence. 
    * @param sentence is a sentence which we want to reverse.
    * @return is the reversed version of parameter sentence
    */
   public static String reverse( String sentence)
   {
      String reverse;
      int length;
      
      length = sentence.length();
      reverse = "";
      for (int counter = length; counter >= 1; counter = counter - 1)
      {
         reverse = reverse + sentence.charAt( counter - 1);
      }
      return reverse;
   }
   
   /**
    * Ýt converts a binary to decimal.
    * @param binary is binary which we want to convert to decimal.
    * @return is the decimal version of parameter binary
    */
   public static int toDecimal ( String binary )
   {
      int number;
      int two;
      int decimal;
      int length;
      int digit;
      
      number = Integer.valueOf(binary);
      two = 1;
      decimal = 0;
      length = binary.length();
      for ( int counter = length; counter >= 1; counter= counter - 1)
      {
         digit = number % 10;
         number = number / 10;
         decimal = decimal + (digit * two);
         two = two * 2;
      }
      return decimal;
   }
   
   /**
    * This method converts a decimal to binary.
    * @param number is decimal that we want to convert to binary.
    * @return is the binary of decimal number.
    */
   public static String toBinary( int number )
   {
      String bin;
      
      bin = "";
      while (number != 0)
      { 
         if (number % 2 == 0)
         {
            bin = bin + "0";
         }
         else
            bin = bin + "1";
         number = number / 2;
      }
      return reverse( bin );
   }
  
   /**
    * The method computes the sin value of any number.
    * @param value is value that we want to compute sin.
    * @return is the value of sin(value).
    */
   public static double sin1( double value )
   {
      double term1;
      double sin1;
      int sign1;
      
      term1 =  value;
      sin1 =  value;
      for ( int counter = 1; counter <10; counter++)
      {
         sign1 = (int) power( -1.0, counter);
         term1 = term1 * (( sign1 * power(value, 2))) / ( (2 * counter) * ( 2 * counter + 1));
         sin1 = sin1 + term1;
      }
      return sin1;
   }
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      
      int length;
      int decimal1;
      int decimal2;
      int sum;
      int sign;
      int counter5;
      String binary1;
      String binary2;
      String word2;
      String word;
      double sin;
      double value2;
      double power1;
      double term;
      long factorial1;
      long factorial2;
      
      // program code
      
      // Task1 Table with powers
      System.out.println( "Table with powers" );
      System.out.println();
      System.out.println( "    n " + "     n^2" + "     n^3" + "     n^4" );
      for ( double counter = -1; counter <= 10;counter++)
      {
         System.out.println();
         
         // Print n
         if (counter == 0)
            length = 3;
         else if (counter < 0)
            length = (int) Math.log10(-counter) + 4;
         else
            length = (int) Math.log10(counter) + 3;
         for ( int countOfSpace = 0; countOfSpace + length != 6; countOfSpace++)
         {
            System.out.print(" ");
         }
         System.out.print(counter);
         
         // Print n^2
         if (counter == 0)
            length = 3;
         else
            length = (int) Math.log10(power(counter, 2)) + 3;
         for ( int countOfSpace = 0; countOfSpace + length != 8; countOfSpace++)
         {
            System.out.print(" ");
         }
         System.out.print(power(counter, 2));
         
         // Print n^3
         if (counter == 0)
            length = 3;
         else if (counter < 0)
            length = (int) Math.log10(-power(counter, 3)) + 4;
         else
            length = (int) Math.log10(power(counter, 3)) + 3;
         for ( int countOfSpace = 0; countOfSpace + length != 8; countOfSpace++)
         {
            System.out.print(" ");
         }
         System.out.print(power(counter, 3));
         
         //Print n^4
         if (counter == 0)
            length = 3;
         else
            length = (int) Math.log10(power(counter, 4)) + 3;
         for ( int countOfSpace = 0; countOfSpace + length != 8; countOfSpace++)
         {
            System.out.print(" ");
         }
         System.out.print(power(counter, 4));
      }
      
      // Task2 Table with factorials
      System.out.println();
      System.out.println();
      System.out.println( "Table with factorials");
      System.out.println();
      System.out.println( "   n  " + "         factorial" );
      for ( int counter2 = 1; counter2 <= 15; counter2++)
      {
         System.out.println();
         
         // Print n
         length = (int) Math.log10(counter2) + 1;
         for ( int countOfSpace = 0; countOfSpace + length != 4 ; countOfSpace++)
         {
            System.out.print( " ");
         }
         System.out.print( counter2);
         
         // Print factorial
         length = (int) Math.log10(factorial(counter2)) + 1;
         for ( int countOfSpace = 0; countOfSpace + length != 18 ; countOfSpace++)
         {
            System.out.print( " ");
         }
         System.out.print( factorial(counter2));
      }
      
      // Task3 The sum of two binary
      System.out.println();
      System.out.println();
      System.out.println( "The sum of two binary ");
      System.out.println();
      
      // Enter 2 binary
      System.out.println("Please enter first binary");
      binary1 = scan.nextLine();
      System.out.println("Please enter second binary");
      binary2 = scan.nextLine();
      
      // Compute binaries sum11
      
      sum = 0;
      decimal1 = toDecimal(binary1);
      decimal2 = toDecimal(binary2);
      sum = decimal1 + decimal2;
      System.out.println(toBinary(sum));
      
      // Task4 Reverse a sentence
      System.out.println();
      System.out.println();
      System.out.println( "Reverse a word ");
      System.out.println();
      System.out.println("Please enter a word or sentence");
      word = scan.nextLine() + " ";
      word2 = "";
      for ( int counter = 0; counter < word.length(); counter++ )
      {
         if ( word.charAt(counter) != ' ' )
         {
            word2 = word2 + word.charAt(counter);
         }
         else
         {
            System.out.print( reverse(word2) + " " );
            word2 = "";
         }
      }
      
      // Task 5 Coumpute sin(x)
      System.out.println();
      System.out.println();
      System.out.println( "Coumpute sin(x)");
      System.out.println();
      System.out.println("Please enter a value to compute sin(value)");
      value2 = scan.nextDouble();
      
      System.out.println("   n" + "    (-1)^n " + "                 x^(2n+1) " + "                   (2n+1)! " + "                            Term" + "                                 sin");
      sin = 0.0;
      for ( int counter3 = 0; counter3 <=10; counter3++)
      {
         System.out.println();
         
         // Print n
         if ( counter3 == 0)
            length = 1;
         else
            length = (int) Math.log10(counter3) + 1;
         for (int countOfSpace = 0; countOfSpace + length < 4; countOfSpace++)
         {
            System.out.print( " ");
         }
         System.out.print(counter3);
         
         // Print (-1)^n
         sign = (int) power( -1.0, counter3);
         if (sign == 1 )
            System.out.print("       "); 
         else
            System.out.print("      ");
         System.out.print( sign );
         
         // Print x^(2n+1)
         power1 = power(value2, ((2 * counter3) + 1) );
         length = (int)Math.log10(power1) + 3;
         for ( int countOfSpace = 0; countOfSpace + length < 25; countOfSpace++)
         {
            System.out.print( " ");
         }
         System.out.print( power1 );
         
         // Print (2n+1)!
         factorial1 = factorial((2 * counter3) + 1);
         if ( factorial1 < 0 )
            factorial2 = (-factorial1);
         else
            factorial2 =  factorial1;
         length = (int) Math.log10(factorial2);
         for ( int countOfSpace = 0; countOfSpace + length < 25; countOfSpace++)
         {
            System.out.print( " ");
         }
         System.out.print( factorial1 );
         
         //Print Term
         term = ( sign * power1 ) / factorial2;
         length = (int) Math.log10(term);
         for ( int countOfSpace = 0; countOfSpace + length < 25; countOfSpace++)
         {
            System.out.print( " ");
         }
         System.out.print( term );
         
         // Print sin;
         sin = sin + term;
         length = (int) Math.log10(sin);
         for ( int countOfSpace = 0; countOfSpace + length < 30; countOfSpace++)
         {
            System.out.print( " ");
         }
         System.out.print( sin );
      }
      System.out.println();
      System.out.println(" The sin is " + sin);
      
      // Task 6 Compute each term from previous one
      System.out.println();
      System.out.println();
      System.out.println( "Coumpute each term from previous one");
      System.out.println();
      
      System.out.println( " Sin from my method is " + sin1(value2));
      System.out.println( " Sin from Math method is " + Math.sin(value2));
      System.out.println( " The difference is " + ( sin1(value2) - Math.sin(value2)));
   }
}