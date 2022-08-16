import java.util.Scanner;

/**
 * Calculator
 * @author Recep Uysal
 * @version 10.17.2019
 */ 
public class Lab02c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      double max;
      double min;
      int number1;
      int number2;
      int sum;
      double difference;
      double product;
      double division;
      int remainder;
            
      // program code
      
      // 1. Welcome Message      
      System.out.println( "Welcome to Calculator" );
      
      // 2. Enter the numbers   
      System.out.println( "Please enter Number1" );
      number1 = scan.nextInt();
      System.out.println( "Please enter Number2" );
      number2 = scan.nextInt();
      
      // 3. Calculation and report   
      
      // 3.1 Sum
      System.out.print( "The sum of Number1 and Number2 is " );
      sum = number1 + number2;
      System.out.println( sum );
      
      // 3.2 Difference
      System.out.print( "The Difference between Number1 and Number2 is " );
      max = Math.max (number1,number2);
      min = Math.min (number1,number2); 
      difference = max - min;
      System.out.println( difference );
      
      // 3.3 Product
      System.out.print( "The Product of Number1 and Number2 is " );
      product = number1 * number2;
      System.out.println( product );
      
      // 3.4 Division
      System.out.print( "The Division of Number1 and Number2 is " );
      division = number1 / number2;
      remainder = number1 % number2;
      System.out.println( division );
      System.out.print( "The remain is " );
      System.out.println( remainder );
             
   }

} // end class