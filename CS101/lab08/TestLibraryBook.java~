import java.util.Scanner;
/**
 * Library Test Program
 * @author Recep Uysal
 * @version 28.11.2019
 */ 

public class TestLibraryBook
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
     
      // variables
      LibraryBook book1;
      LibraryBook book2;
      
      // program code
      
      // Create books
      book1 = new LibraryBook( "Çalýkuþu", "Reþat Nuri Güntekin");
      book2 = new LibraryBook( "Suç ve Ceza", "Dostoyevski");
      
      // Show books' information
      System.out.println( book1.toString());
      System.out.println( book2.toString());
      System.out.println();
      
      // Loan book
      book1.toLoan( "22.12.2019");
      book2.toLoan( "02.01.2020");
      System.out.println( book1);
      System.out.println( book2);
      System.out.println();
      
      // Return book
      book1.bookReturned();
      System.out.println( book1);
      System.out.println( book2);
      System.out.println();
      
      // Loan books again
      book1.toLoan( "28.02.2019");
      book2.toLoan( "02.01.2020");
      System.out.println( book1);
      System.out.println( book2);
      System.out.println();
      
      // Show the times loaned before
      System.out.println( "Times loaned is " + book1.getTimesLoaned());
      System.out.println( "Times loaned is " + book2.getTimesLoaned());
      
      // onLoan method
      System.out.println();
      if ( book1.onLoan())
         System.out.println( "Book is loaned from someone else");
      else
         System.out.println( "Book is avaliable for loaning");
      
      if ( book2.onLoan())
         System.out.println( "Book is loaned from someone else");
      else
         System.out.println( "Book is avaliable for loaning");                         
   }
}