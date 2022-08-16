import java.util.Scanner;

/**
 * Row and Column Program
 * @author __your name___
 * @version 07.11.2019
 */ 
public class lab05b
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // constants
      
      // variables
      int row;
      int column;
      int counter;
      int counter2;
      String widht;
      int widht2;
      int product;
      int product2;
      int cellNumber;
      int cellNumber2;
      int x;
      
      
      // program code
      // 1. Enter the number of rows and columns
      System.out.println( "Please enter th number of rows");
      row = scan.nextInt();
      System.out.println( "Please enter th number of columns");
      column = scan.nextInt();
      
      // 2.Task 1
      System.out.println( "The row & column numbers");
      
      for ( counter = 1; counter <= row; counter++ )
      {
         for ( counter2 = 1; counter2 <= column; counter2++ )
         {
            widht = counter + "," + counter2;
            widht2 = widht.length();
            for ( int space = 0; space + widht2 < 6 ; space++)
            {
               System.out.print( " ");
            }
            System.out.print( widht );
         }
         System.out.println();
      }
      
      // 3. Task 2
      System.out.println( "The product of the row & column number");
      System.out.println();
      
      for ( counter = 1; counter <= row; counter++ )
      {
         for ( counter2 = 1; counter2 <= column; counter2++ )
         {
            product = counter * counter2;
//            product2 = (int)Math.log10(product) + 1;
//            
//            for ( int space = 0; space + product2 < 6 ; space++)
//            {
//               System.out.print( " ");
//            }
            System.out.printf( "%3d", product );
         }
         System.out.println();
      }
      
      //4. Task 3
      System.out.println( "The cell number beginning from 0 and increasing left to right, top to bottom");
      System.out.println();
      
      for ( counter = 0; counter < row; counter++ )
      {
         for ( counter2 = 0; counter2 < column; counter2++ )
         {
            cellNumber = (counter * column) + counter2;
            if (cellNumber != 0 )
               cellNumber2 = (int)Math.log10(cellNumber) + 1;
            else
                cellNumber2 = 1;
            for ( int space = 0; space + cellNumber2 < 6 ; space++)
            {
               System.out.print( " " );
            }
            System.out.print( cellNumber  );
         }
         System.out.println();
      }
      
      //4. Task 4
      System.out.println( "The row number in the first column only, putting the String \"-\" into the other cells");
      System.out.println();
      
      for ( counter = 1; counter <= row; counter++ )
      {
         System.out.printf( "%5d", counter );
         for ( counter2 = 1; counter2 < column; counter2++ )
         {
           
            System.out.printf( "%5s", "-" );
            
         }
         System.out.println();
      }
      
      
      }
      
   }
   
