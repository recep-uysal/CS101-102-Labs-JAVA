import java.util.ArrayList;
import java.util.Scanner;
import cs1.SimpleURLReader;

/**
 * Test Program with Menu
 * @author Recep Uysal
 * @version 02.03.2020
 */ 
public class Lab02e
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      int option;
      String url;
      ArrayList<MySimpleURLReader> collection;
      
      //program code
      collection = new ArrayList<>();
      
      do{
         
         System.out.println( "1.Enter URL of the poem");
         System.out.println( "2.List all poems in the collection");
         System.out.println( "3.Quit");
         option = scan.nextInt();
         
         if( option == 1)
         {
            System.out.println( "Please enter the URL");
            url = scan.nextLine();
            url = scan.nextLine();
            
            if( url.substring(url.length()-3, url.length()).equals("txt"))
            {
               MySimpleURLReader reader = new MySimpleURLReader(url);
               collection.add(reader);
            }
            else if( url.substring(url.length()-3, url.length()).equals("htm") || url.substring(url.length()-3, url.length()).equals("tml"))
            {
               XHTMLFilteredReader reader = new XHTMLFilteredReader(url);
               collection.add(reader);
            }
            
         }
         
         if( option == 2)
         {
            int index; 
            
            do{
               
               for( int k = 0; k < collection.size(); k++ ){
                  System.out.println( (k) + ". " + collection.get(k).getName() );
               }
               
               System.out.print("Enter the index of the poem: ");
               index = scan.nextInt();
               
               if( index < collection.size() )
                  System.out.println(collection.get(index).getPageContents());
               
            }while( index != collection.size() );
         }
      
      } while( option != 3);
      
      System.out.println( "GOOD BYE...");
   }
}