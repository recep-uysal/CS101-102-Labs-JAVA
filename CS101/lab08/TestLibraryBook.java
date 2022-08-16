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
      LibraryBook book3;
      LibraryBook book4;
      LibraryBook book5;
      
      // program code
      
      // Create books
      book1 = new LibraryBook( "Çalýkuþu", "Reþat Nuri Güntekin");
      book2 = new LibraryBook( "Suç ve Ceza", "Dostoyevski");
      book3 = new LibraryBook( "Robinson Crouse", "Daniel Defoe"); 
      book4 = book2;
      
      //Compare 2 LibraryBook objects
      
      // Task a Compare two references to a single object
      System.out.println();
      
      System.out.println( book2 == book4);
      System.out.println( book2.equals(book4));
      
      // Task b Compare two references to two individual objects with different properties
      System.out.println();
      
      System.out.println( book1 == book3);
      System.out.println( book1.equals(book3));
      
      // Task c Compare two references to two individual objects with identical relevant properties.
      System.out.println();
      book5 = new LibraryBook( book3);
      
      System.out.println( book5 == book3);
      System.out.println( book3.equals(book5));
      
      // Check hasSameTitle
      System.out.println();
      
      System.out.println(book5.hasSameTitle(book3));
      System.out.println(book5.hasSameTitle(book2));
      
      // Check hasSameAuthour
      System.out.println();
      
      System.out.println(book5.hasSameAuthour(book3));
      System.out.println(book5.hasSameAuthour(book2));
   }
}