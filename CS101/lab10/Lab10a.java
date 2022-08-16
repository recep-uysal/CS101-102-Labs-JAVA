import java.util.Scanner;

/**
 * Test of BigNum 
 * @author Recep Uysal
 * @version 19.12.2019
 */ 
public class Lab10a
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // variables
      BigNum b1;
      BigNum b2;
      BigNum b3;

      // program code
      System.out.println( "Start...");
      
      // Create new BigNums
      b1 = new BigNum("F560");
      b2 = new BigNum( "E012");
      b3 = new BigNum( b2);
      
      // Show all BigNums
      System.out.println("b1 = " + b1);
      System.out.println("b2 = " + b2);
      System.out.println("b3 = " + b3);
      
      // Show shift method
      b2.shift(false);
      System.out.println("b2 = " + b2);
      b1.shift(true);
      System.out.println("b1 = " + b1);
      
      System.out.println( "equals: "+ b2.equals(b3));
      
      // Show add method
      System.out.println("b2 + b1 = " + b1.add(b2));
      
      // Show isLessThan method
      System.out.println( "isLessThan: " + b1.isLessThan(b2));
   }
}