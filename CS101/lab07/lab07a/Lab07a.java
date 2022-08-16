/**
 * Dice Game Program
 * @author Recep Uysal
 * @version 28.11.2019
 */ 
public class Lab07a
{
   public static int gambling()
   {
     return (int) (( 6 * Math.random()) + 1);  
   }
   
   public static void main( String[] args)
   {

      // variables
      int die1;
      int die2;
      int die3;
      int die4;
      int rollCount;

      // program code
      
      // Task1
      System.out.println( "Task1 1 pair of dice");
      
      rollCount = 0;
      die1 = 0;
      die2 = 0;
      
      // calculate how many times they roll
      do{
         die1 = gambling();
         die2 = gambling();
         rollCount = rollCount + 1;
         
      } while ( die1 != 6 || die2 != 6);


      // print the roll number
      System.out.println( "The number of rolls is " + rollCount);
      
      // Task2
      System.out.println();
      System.out.println( "Task2 2 pairs of dice");
      
      rollCount = 0;
      die1 = 0;
      die2 = 0;
      die3 = 0;
      die4 = 0;
      
      // calculate how many times they roll
      do{
         die1 = gambling();
         die2 = gambling();
         die3 = gambling();
         die4 = gambling();
         rollCount = rollCount + 1;
         
      } while ( die1 != 6 || die2 != 6 || die3 != 6 || die4 != 6);

      // print the roll number
      System.out.println( "The number of rolls is " + rollCount);
   }
}