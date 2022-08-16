/**
 * BigNum Class
 * @author Recep Uysal
 * @version 19.12.2019
 */ 
public class BigNum
{
   // properties
   public static final int SIZE = 4;
   public static final int BASE = 16;
   private int[] digits;
   
   // constructors
   public BigNum()
   {
      digits = new int[SIZE];
   }
   
   public BigNum( String value)
   {
      digits = new int[SIZE];
      
      for ( int index = 0; index < value.length(); index++)
      {
         if( Character.isDigit(value.charAt(value.length() - 1 - index)))
            digits[index] = value.charAt(value.length() - 1 - index) - '0';
         else
            digits[index] = value.charAt( value.length() -1 -index) - 'A' + 10;
      }
      
      for ( int counter = value.length(); counter < SIZE; counter ++)
      {
         digits[counter] = 0;
      }
   }
   
   public BigNum( BigNum other)
   {
      this.digits = other.digits.clone();
   }
   
   // methods
   
    /**
    *  method toString shows the digits of a number.
    * @return array gives digits of a number.
    */
   public String toString()
   {
      String array;
         
      array = "";
      
      for ( int counter = SIZE - 1; counter >= 0; counter--)
      {
         if ( digits[counter] < 10 && digits[counter] >= 0)
            array = array + digits[counter] + " ";
         else
         {
            array = array + (char)(digits[counter] + 'A' - 10) + " ";
         }
      }
      
      return array;
   }
   
   /**
    *  method equals shows that a BigNum is eauals to another.
    * @param other is the BigNum which we want to compare.
    * @return shows they are equals or not.
    */
   public boolean equals( BigNum other)
   {
      int error;
      
      error = 0;
      
      for ( int index = 0; index < SIZE; index++)
      {
         if ( digits[index] != other.digits[index])
            error = error + 1;
      }
      
      return (error == 0);
   }
   
   /**
    *  method isZero shows a BigNum is zero or not.
    * @return if BigNum is zero, it shows true.
    */
   public boolean isZero()
   {
      for( int index = 0;  index < SIZE; index++)
      {
         if( digits[index] != 0)
            return false;
      }
      return true;
   }
   
   /**
    *  method shift changes the index of digits.
    * @param left determine we will increase the index of digits or decrease.
    */
   public void shift( boolean left)
   {
      if ( left)
      {
         for ( int counter = SIZE - 1; counter > 0; counter--)
         {
            digits[counter] = digits[counter - 1];
         }
         digits[0] = 0;
      }
      else
      {
         for ( int index = 0; index < SIZE - 1; index++)
         {
            digits[index] = digits[index + 1];
         }
         digits[SIZE - 1] = 0;
      }
   }
   
   /**
    *  method add adds a BigNum to another.
    * @param other is the BigNum which we want to add.
    * @return shows the sum of 2 BigNums.
    */
   public String add( BigNum other)
   {
      int sum;
      int carry;
      String sumOfValues;
      
      carry = 0;
      sumOfValues = "";
      
      for ( int counter = 0; counter < SIZE; counter++)
      {
         sum = this.digits[counter] + other.digits[counter] + carry;
         carry = sum / BASE;
         if ( (sum % BASE)< 10 && (sum % BASE) >= 0)
            sumOfValues = (sum % BASE) + sumOfValues;
         else
            sumOfValues = (char)((sum % BASE) + 'A' - 10) + sumOfValues;
      }
      return "sum: " + sumOfValues + " overflow: " + carry;
   }
   
   /**
    *  method isLessThan compare a BigNum to another.
    * @param other is the BigNum which we want to compare.
    * @return if BigNum other is less, it shows true. 
    */
   public boolean isLessThan( BigNum other)
   {
      int counter = SIZE - 1;
      
      while( counter >= 0 && other.digits[counter] == digits[counter] )
      {
         counter--;
      }
      
      return !( counter == -1 || other.digits[counter] < digits[counter] );
   }   
}