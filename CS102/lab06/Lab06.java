import java.util.*;

/**
 * Recursion 
 * @author Recep Uysal
 * @version 27.04.2020
 */ 
public class Lab06
{
   /*
    * countOfE method finds the count of e in a string
    * @param word is the string 
    * @return count is the count of e
    */
   public static int countOfE( String word )
   {
      int count;
      count = 0;
      
      // stopping case
      if( word.length() == 0 ) 
      {
         return count;
      }
      
      //if char is e, increase count
      if ( word.charAt(0) == 'e' ) 
         // check other letters
         count = 1 + countOfE( word.substring(1) );
      else
         count = countOfE( word.substring(1) );
      
      return count;
   }
   
   /*
    * binary method turns a decimal value to binary
    * @param value is the decimal 
    */
   public static void binary( int value ) 
   {
      //create and initilase a string
      String binary;
      binary = "";
      
      if ( value > 0 ) 
      {
         // continue until it becomes 0
         binary( value / 2 );
         // add value to string
         System.out.print( value % 2 + binary);
      }
   }
   
   /*
    * order method checks an ArrayList's strings
    * @param words is the ArrayList 
    * @return check is the result
    */
   public static Boolean order( ArrayList<String> words )
   {
      boolean check = false;
      
      // stopping case
      if( words.size() == 1 )
         return true;
      
      // if they are not in order
      else if( words.get(0).compareTo( words.get(1) ) == 1 ) 
      {
         check = false;
      }
      else 
      {
         // remove first element
         words.remove(0);
         // check other strings
         check = order( words ); 
      } 
      
      return check;
   }
   
   /*
    * check method checks a integer 
    * @param number is the integer 
    * @return control is the answer
    */
   public static Boolean check( int number )
   {
      boolean control = false;
      
      // turn number to string
      String value;
      value = number + "";
      
      // stopping case
      if( value.length() == 1 )
         return true;
      
      // if it is not true
      else if( Character.getNumericValue(value.charAt(0)) >= Character.getNumericValue(value.charAt(1)) ) 
      {
         control = false;
      }
      else 
      {
         // check other digits
         control = check( Integer.parseInt(value.substring(1)) );
      } 
      
      return control;
   }
   
   /*
    * orderedNumbers method writes ordered values
    * @param digit is the digit number
    */
   public static void orderedNumbers( int digit )
   {
      // create first number
      int number;
      number = (int) Math.pow(10.0, digit - 1.0);
      
      while( number < (int) Math.pow(10.0, digit) )
      {
         // check number
         if ( check( number ) && number % 2 == 0)
            System.out.print( number + ",");
         
         // increase number
         number++;
      }
   }
   
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      ArrayList<String> words1;
      ArrayList<String> words2;
      
      // program code
      // Part a
      System.out.println( "" );
      System.out.println( "--------- Part A ---------" );
      System.out.println( countOfE( "aaaa" ) );
      System.out.println( countOfE( "recep" ) );
      System.out.println( countOfE( "eeeeeeeeeeeee" ) );
      
      // Part b
      System.out.println( "" );
      System.out.println( "--------- Part B ---------" );
      binary( 6 );
      System.out.println( "" );
      binary( 17 );
      
      // Part c
      System.out.println( "" );
      System.out.println( "--------- Part C ---------" );
      
      // initialise arraylists
      words1 = new ArrayList<String>();
      words2 = new ArrayList<String>();
      
      // add strings into arraylist
      words1.add( "aaa" );
      words1.add( "bbb" );
      words1.add( "ccc" );
      
      words2.add( "ccc" );
      words2.add( "bbb" );
      words2.add( "aaa" );
      
      System.out.println( order( words1) );
      System.out.println( order( words2) );
      
      // part d
      System.out.println( "" );
      System.out.println( "--------- Part D ---------" );
      orderedNumbers(7);
   }
}