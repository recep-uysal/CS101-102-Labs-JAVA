import java.util.Scanner;

/**
 * Library Program
 * @author Recep Uysal
 * @version 05.12.2019
 */ 
public class LibraryTest
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);
      
      // variables
      Library library;
      LibraryBook book;
      String order;
      String order2;
      String bookTitle;
      String bookAuthour;

      // program code
      // Create a new Library Object
      library = new Library();
      
      // Print Menu With using do while
      do{
         System.out.println( "  In order to see all books in the library, enter \"Show\" " +
                            "\n In order to find a book, enter \"Find\" " +
                            "\n In order to add a book to library, enter \"Add\" " +
                            "\n In order to exit, enter \"Exit\" " ); 
         
         // Get message from user
         order = scan.nextLine();
         
         // Show books in the library
         if ( order.equals( "Show"))
            System.out.println( library);
         
         // Find a book from the library
         if ( order.equals( "Find") )
         {
            // Get the title
            System.out.println( "Please enter the book title");
            bookTitle = scan.nextLine();
            
            //Check the book is in library or not
            if ( library.findByTitle( bookTitle) == null)
               System.out.println( "There is not any book like that");
            else
            {
               book = library.findByTitle( bookTitle);
               
               // Print the Find Menu
               do{
                  System.out.println( "  In order to loan book, enter \"Loan\" " +
                                     "\n In order to remove a book, enter \"Remove\" " +
                                     "\n In order to return a book to library, enter \"Return\" " +
                                     "\n In order to exit, enter \"Back\" " ); 
                  
                  // Get message from user
                  order2 = scan.nextLine();
                  
                  // Loan the book
                  if ( order2.equals( "Loan"))
                  {  
                     System.out.println( "Please enter a date");
                     book.toLoan( scan.nextLine());
                  }
                  
                  // Remove book from library
                  if ( order2.equals( "Remove"))
                  {
                     library.remove( book);
                  }
                  
                  // Return book to the library
                  if ( order2.equals( "Return"))
                  {
                     if ( book.getDueDate() == "")
                        System.out.println( "The book has already been in the library.");
                     else
                        book.bookReturned();
                  }  
                     
               } while ( !order2.equals( "Back"));
            } 
         }
         
         // Add new book to the library
         if ( order.equals( "Add") )
         {
            // Get the title from user
            System.out.println( "Please enter the title of book");
            bookTitle = scan.nextLine();
            
            // Get the authour from the user
            System.out.println( "Please enter the authour of book");
            bookAuthour = scan.nextLine();
            
            library.add( bookTitle, bookAuthour);
         }
         
      // Exit from the program
      } while ( !order.equals( "Exit"));
      System.out.println( "Thank you for using the library program.");
   }
}