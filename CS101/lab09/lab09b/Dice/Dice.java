/**
 * Dice Class
 * @author Recep Uysal
 * @version 28.11.2019
 */ 
public class Dice
{
   // properties
   private Die die1;
   private Die die2;
   
   // constructors
   public Dice()
   {
      die1 = new Die();
      die2 = new Die();
   }
   
   // methods
   
   /**
    * roll method rolls dice
    * @return the number of rolss of both dies.
    */
   public int roll()
   {
      return (die1.roll() + die2.roll());
   }
   
   /**
    * getDie1FaceValue method shows the Die1s value
    * @return the facevalue of Die1.
    */
   public int getDie1FaceValue()
   {
      return die1.getFaceValue();
   }
   
   /**
    * getDie1FaceValue method shows the Die2s value
    * @return the facevalue of Die2.
    */
   public int getDie2FaceValue()
   {
      return die2.getFaceValue();
   }
   
   // getDiceTotal method shows
   /**
    * getDiceTotal method shows the sum of both dices facevalues
    * @return the sum of both dices facevalues
    */
   public int getDiceTotal()
   {
      return ( die1.getFaceValue() + die2.getFaceValue());
   }
   
   /**
    * toString method shows the facevalues of dice in String type
    * @return prints the facevalues of dice
    */
   public String toString()
   {
      return ( "The value of die1 is " + die1.getFaceValue() + " the value of die2 is " + die2.getFaceValue());
   }
}
