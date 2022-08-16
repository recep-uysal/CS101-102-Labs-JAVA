import java.util.Scanner;

/**
 * Simple Calculator
 * @author Recep Uysal
 * @version 07.11.2019
 */ 
public class lab05c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      String value;
      double value2;
      char sign;
      double number;
      int length;
      int power;
      int b;
      double c;
      
      
      // program code
      value2 = 0;
      do
      {
         System.out.println( "----------------------");
         System.out.println( "[" + value2 + "]");
         System.out.println( "----------------------");
         System.out.println( "+,-,*,/ value");
         System.out.println( "Clear");
         System.out.println( "Quit");
         System.out.println( "----------------------");
         System.out.println( "Select :");
         value = scan.nextLine();
         sign = value.charAt(0);
         length = value.length();
         number = 0;
         power = length - 3;
         for  (int a = 2; a <= length - 1; a++ )
         {
            b = Character.getNumericValue(value.charAt(a));
            c = Math.pow(10, power);
            number = number + (b * c);
            power = power - 1;
         }
         if ( sign == '+' )
            value2 = value2 + number;
         else if ( sign == '-' )
            value2 = value2 - number;
         else if ( sign == '*' )
            value2 = value2 * number;
         else if ( sign == '/' )
         {
            if (number != 0 )
               value2 = value2 / number;
            else
               System.out.println( "error");
         }
         else if ( !"clear".equals(value) || !"Clear".equals(value) || !"c".equals(value) || !"C".equals(value) )
            value2 = 0;
         
      } while ( !"quit".equals(value) && !"Quit".equals(value));
      System.out.println( "Thank you for using simple calculator. Good bye...");
   }
   
}