/**
 * Dice Game Test Program
 * @author Recep Uysal
 * @version 28.11.2019
 */ 

public class TestDiceGame {
   public static void main( String[] args) {
      
      // variables
      DiceGame diceGame;
      
      // program code
      
      // Create a dicegame
      diceGame = new DiceGame();
      
      // show the how many times dicegame rolls
      System.out.println( "The number of times is "  + diceGame.play() );
   }
}