/**
 * Die Test Program
 * @author Recep Uysal
 * @version 28.11.2019
 */ 

public class TestDie {
   public static void main( String[] args) {
      
      // variables
      Die die1;
      Die die2;
      
      // program code
      
      // create 2 dies
      die1 = new Die();
      die2 = new Die();
      
      // show dies' values
      System.out.println( die1);
      System.out.println( die2);
      
      // roll dies
      System.out.println();
      System.out.println( die1.roll());
      System.out.println( die2.roll());
      
      // show face values
      System.out.println();
      System.out.println( die1.getFaceValue());
      System.out.println( die2.getFaceValue());
      
      // show values of dies
      System.out.println();
      System.out.println( die1.toString());
      System.out.println( die2.toString());
   }
}