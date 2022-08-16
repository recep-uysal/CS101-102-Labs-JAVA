import java.util.ArrayList;

/**
 * Library Class
 * @author Recep Uysal
 * @version 05.12.2019
 */ 
public class Library
{
   // properties
   private ArrayList<LibraryBook> books;
   
   // constructors
   public Library()
   {
     books = new ArrayList<LibraryBook>();
   }
   
   // methods
   
   /**
    * this method shows the library is empty or not.
    * @return shows the library empty or not.
    */
   public boolean isEmpty()
   {
      return ( books.size() == 0);
   }
   
   /**
    * toString shows the books in the library
    * @return shows the books informations
    */
   public String toString()
   {
      String information;
      information = "";
      
      if ( isEmpty() )
      {
         information = ( "The library is empty!!");
      }
      else
      {
         for ( int counter = 0; counter < books.size(); counter++)
         {
               if ( books.get(counter).onLoan() == true )
                  information = information + ( books.get(counter).getTitle() + " Authour: " + books.get(counter).getAuthour()) + " The duedate: " + books.get(counter).getDueDate() + "\n";
               else
                  information = information + ( books.get(counter).getTitle() + " Authour: " + books.get(counter).getAuthour()) + "\n";
         }
      }
      return information;
   }
   
   /**
    * add methods add a book to the library
    * @param title is the title of the book
    * @param authour is the authour of the book
    */
   public void add( String title, String authour)
   {
      LibraryBook book;
      book = new LibraryBook( title, authour);
      books.add( book);
   }
   
   /**
    * remove method delete a book from library
    * @ param book is the book which we want to remove
    */
   public void remove(LibraryBook book)
   {
      int error;
      error = 0;
      
      for ( int index = 0; index < books.size(); index++)
      {
         if ( book.equals( books.get(index)))
            books.remove(index);
         error++;
      }
      
      if ( error == 0)
         System.out.println( "There is not any book like that.");
   }
   
   /**
    * this method finds a book with a given title
    * @param title is the title which we want to find
    * @return the book
    */
   public LibraryBook findByTitle( String title)
   {
      LibraryBook book;
      book = null;
      int error;
      error = 0;
      
      for ( int index = 0; index < books.size(); index++)
      {
         if ( title.equals(books.get(index).getTitle()))
            book = books.get(index);
         error++;
      }
      
      if ( error == 0)
         book = null;
      
      return book;
   }
}
