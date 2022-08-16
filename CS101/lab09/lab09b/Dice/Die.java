/**
 * Die Class
 * @author Recep Uysal
 * @version 28.11.2019
 */ 
public class Die
{
   // properties
   private int faceValue;
   
   // constructors
   public Die()
   {
      faceValue = (int) (( 6 * Math.random()) + 1);
   }
   
   // methods
   
   /**
    *  method rolls a die
    * @return faceValue is the value of die.
    */
   public int roll()
   {
      faceValue = (int) (( 6 * Math.random()) + 1);
      return faceValue;
   }
   
   /**
    * getFaceValue method shows the value of die.
    * @return faceValue is the value of a die.
    */
   public int getFaceValue()
   {
      return faceValue;
   }
   
   /**
    * toString method prints the value of die in String type.
    * @return the value of a die.
    */
   public String toString()
   {
      return ("The face value is " + faceValue);
   }
}