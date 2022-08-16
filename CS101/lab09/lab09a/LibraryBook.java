/**
 * LibraryBook Class
 * @author Recep Uysal
 * @version 28.11.2019
 */ 
public class LibraryBook
{
   // properties
   private int timesLoaned;
   private String title;
   private String authour;
   private String dueDate;
   
   // constructors
   public LibraryBook( String theTitle, String theAuthour)
   {
      title = theTitle;
      authour = theAuthour;
      dueDate = "";
      timesLoaned = 0;
   }
   
   public LibraryBook( LibraryBook book)
   {
      title = book.title;
      authour = book.authour;
   }
   
   // methods
   
   /**
    * toString method shows a books title, authour, duedate and how many times loaned before.
    * @return information gives the informations about book.
    */
   public String toString()
   {
      String information;
      
      if ( dueDate == " ")
         information = ( "Title of the book is " + title + ", authour of the book is " + authour + " the book is in avaliable " + " and this book loaned " + timesLoaned + " times.");
      else
         information = ( "Title of the book is " + title + ", authour of the book is " + authour + " the duedate is " + dueDate + " and this book loaned " + timesLoaned + " times.");
      
      return information;
   }
   
   /**
    * getTimesLoaned method shows how many times a book loaned.
    * @return timesLoaned prints how many times a book loaned.
    */
   public int getTimesLoaned()
   {
      return  timesLoaned;
   }
   
   /**
    * toLoan method shows book is avaliable or not and if it is avaliable, you can loan it.
    * param dueDate is duedate that we have to bring book back.
    */
   public void toLoan ( String dueDate )
   {
      if ( onLoan() )
         System.out.println( "The book is loaned to someone else.");
      else
      {
         timesLoaned++;
         this.dueDate = dueDate;
      }
   }
   
   /**
    * bookReturned reset duedate.
    * @return dueDate makes book avaliable
    */
   public String bookReturned()
   {
      return dueDate = " ";
   }
   
   /**
    * onLoan method shows book is avaliable or not.
    * @return book is avaliable or not.
    */
   public boolean onLoan()
   {
      return (dueDate != "");
   }
   
   /**
    * equals method compare 2 different references
    * @param book is the book which we want to compare
    * @return they are same references or not.
    */
   public boolean equals(LibraryBook book)
   {
      return ( book.title == this.title && book.authour == this.authour);
   }
   
   /**
    * this method compare 2 different books titles.
    * @param book is the book which we want to compare its title
    * @return they are same titles or not.
    */
   public boolean hasSameTitle(LibraryBook book)
   {
      return ( book.title == this.title);
   }
   
   /**
    * this method compare 2 different books authours.
    * @param book is the book which we want to compare its authour
    * @return they are same authours or not.
    */
   public boolean hasSameAuthour(LibraryBook book)
   {
      return ( book.authour == this.authour);
   }
   
    /**
    * this method shows the title of book.
    * @return the title.
    */
   public String getTitle()
   {
      return title;
   }
   
   /**
    * this method shows the authour of book.
    * @return the authour.
    */
   public String getAuthour()
   {
      return authour;
   }
   
   /**
    * this method shows the duedate of book.
    * @return the duedate.
    */
   public String getDueDate()
   {
      return dueDate;
   }
   
}