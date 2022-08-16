import java.util.Scanner;

/**
 * IntBag Test Program
 * @author Recep Uysal
 * @version 17.02.2020
 */ 
public class Lab01c
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // variables
      int option;
      int test;
      IntBag numbers;
      
      // program code
      test = 0;
      numbers = new IntBag();;
      do{
         System.out.println( "1.Create a new empty collection with a specified maximum capacity");
         System.out.println( "2.Read a set of positive values into the collection");
         System.out.println( "3.Print the collection of values.");
         System.out.println( "4.Add a value to the collection of values at a specified location");
         System.out.println( "5.Remove the value at a specified location from the collection of values");
         System.out.println( "6.Read a single test value");
         System.out.println( "7.Compute the set of locations of the test value within the collection");
         System.out.println( "8.Print the set of locations");
         System.out.println( "9.Quit the program");
         option = scan.nextInt();
         
         if( option == 1)
         {
            System.out.println( "Please enter the capacity of array");
            numbers = new IntBag(scan.nextInt());
         }
         
         if( option == 2)
         {
            int value;
            System.out.println( "Please enter set of values");
            value = scan.nextInt();
            
            while (value > 0)
            {
               value = scan.nextInt();
               numbers.add(value);
            }
            
         }
         
         if( option == 3)
         {
            System.out.println( numbers);
         }
         
         if( option == 4)
         {
            int value;
            int location;
            
            System.out.println( "Please enter value");
            value = scan.nextInt();
            
            do{
               System.out.println( "Please enter location (positive)");
               location = scan.nextInt();
            } while( location < 0 && location >= numbers.size());
            
            numbers.add(location, value);
         }
         
         if( option == 5)
         {
            int location;
            
            do{
               System.out.println( "Please enter the location of element you want to remove");
               location = scan.nextInt();
            } while( location < 0);
            
            numbers.remove( location);
         }
         
         if( option == 6)
         {
            System.out.print( "Please enter a test value : " );
            test = scan.nextInt();
         }
         
         if( option == 7)
         {
            numbers.findAll( test);
         }
         
         if( option == 8)
         {
            if( numbers.findAll( test) == "")
                System.out.println( "This value is not in the array!");
            else
               System.out.println( numbers.findAll( test));
         }
         
      } while ( option != 9); 
      System.out.println("Thanks");
   }
}