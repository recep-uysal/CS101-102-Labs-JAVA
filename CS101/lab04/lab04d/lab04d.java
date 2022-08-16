import java.util.Scanner;

/**
 * Character Program 
 * @author Recep Uysal
 * @version 31.10.2019
 */ 
public class lab04d
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
     
      // variables
      int widht;
      int countOfCh;
      int writtenCh;
      String ch;
      
      // program code
      ch = scan.nextLine();
      widht = scan.nextInt();
      
      countOfCh = 0;
      writtenCh = 0;
      while ( countOfCh != widht)
      {
         countOfCh = countOfCh + 1;
         while ( writtenCh != countOfCh  )
         {
            System.out.print(ch);
            writtenCh = writtenCh + 1;
         }
         writtenCh = 0;
         System.out.println();
      }
//      double d;
//      d = 0.1;
//      while ( d != 1.0 )
//      {
//         System.out.println( d);
//         d = d + 0.1;
//      }
//      System.out.println( d + " <- final value after loop!");
   }
   
}