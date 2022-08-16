import java.util.Scanner;
import java.util.ArrayList;

/**
 * Dice Frequency Histogram
 * @author Recep Uysal
 * @version 12.12.2019
 */ 
public class Lab09b
{
   /**
    *  method findFrequency find the frequency of total value of dice.
    * @return frequency gives the frequency of values.
    */
   public static ArrayList<Integer> findFrequency()
   {
      ArrayList<Integer> values;
      ArrayList<Integer> frequency;
      Dice dice;
      int valuesOf2;
      int valuesOf3;
      int valuesOf4;
      int valuesOf5;
      int valuesOf6;
      int valuesOf7;
      int valuesOf8;
      int valuesOf9;
      int valuesOf10;
      int valuesOf11;
      int valuesOf12;
      
      // create a array list that includes the value of dices
      values = new ArrayList<Integer>();
      
      // create a new dice
      dice = new Dice();
      
      // roll dice for 1000 times
      for ( int counter = 0; counter < 1000; counter++)
      {
         dice.roll();
         values.add(dice.getDiceTotal());
      }
      
      // intiliaze the total values
      valuesOf2 = 0;
      valuesOf3 = 0;
      valuesOf4 = 0;
      valuesOf5 = 0;
      valuesOf6 = 0;
      valuesOf7 = 0;
      valuesOf8 = 0;
      valuesOf9 = 0;
      valuesOf10 = 0;
      valuesOf11 = 0;
      valuesOf12 = 0;
      
      // find that how many times a value comes
      for ( int index = 0; index < 1000; index++)
      {
         if (values.get( index) == 2)
            valuesOf2++;
         if (values.get( index) == 3)
            valuesOf3++;
         if (values.get( index) == 4)
            valuesOf4++; 
         if (values.get( index) == 5)
            valuesOf5++;
         if (values.get( index) == 6)
            valuesOf6++;
         if (values.get( index) == 7)
            valuesOf7++;
         if (values.get( index) == 8)
            valuesOf8++;
         if (values.get( index) == 9)
            valuesOf9++;
         if (values.get( index) == 10)
            valuesOf10++;
         if (values.get( index) == 11)
            valuesOf11++;
         if (values.get( index) == 12)
            valuesOf12++;
      }
      
      // create a new array list which include frequencies
      frequency = new ArrayList<Integer>();
      
      // add frequencies to the arraylist
      frequency.add(valuesOf2);
      frequency.add(valuesOf3);
      frequency.add(valuesOf4);
      frequency.add(valuesOf5);
      frequency.add(valuesOf6);
      frequency.add(valuesOf7);
      frequency.add(valuesOf8);
      frequency.add(valuesOf9);
      frequency.add(valuesOf10);
      frequency.add(valuesOf11);
      frequency.add(valuesOf12);
      
      return frequency;
   }
   
   /**
    *  method draw draws a histogram that shows the frequency with using stars.
    */
   public static void draw( ArrayList<Integer> frequency)
   {
      ArrayList<String> line;
      int max;
      int starCount;

      // find the max frequency
      max = frequency.get(0);
      for ( int counter = 1; counter < frequency.size(); counter++)
         max = Math.max(max, frequency.get(counter));
      
      // compute a stars value
      starCount = (int) Math.round(max / 10.0);
      
      // create a new array list for lines
      line = new ArrayList<String>();
      
      // add 10 lines to the array list
      for ( int index = 0; index < 10; index++)
         line.add( index, "");
      
      // draw every line with using for
      for ( int counter = 0; counter < 10 ; counter++)
      {
         for ( int index = 0; index < 11; index++)
         {
            if ( (int) (frequency.get(index) / starCount) >= 10 - counter)
               line.set(counter, line.get(counter) + "*" );
            else
               line.set(counter, line.get(counter) + " " );
         }
      }
      
      // outprint the menu
      System.out.println(" Frequency Distribution" +
                   "\r\n  for 1000 Dice rolls" +
                   "\r\n  ( max freq is " + max + " )");
      
      // output the line arraylist
      for ( String star : line)
         System.out.println( star );
   }
   
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // program code

      draw( findFrequency());
   }
}