/**
 * Dice Game Class
 * @author Recep Uysal
 * @version 28.11.2019
 */ 
public class DiceGame
{
   // properties
   private Dice dice;
   
   // constructors
   public DiceGame()
   {
      dice = new Dice();
   }
   
   // methods
   
   /**
    * play method rolls dice
    * @return the roll number of dice.
    */
   public int play()
   {
      int count;
      
      count = 0;
      do 
      {
         count++;
      } while ( dice.roll() != 12);
      
      return count;   
   }
}