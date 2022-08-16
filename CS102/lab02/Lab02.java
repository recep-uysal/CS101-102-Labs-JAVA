import java.util.Scanner;
import cs1.SimpleURLReader;

/**
 * Test Program
 * @author Recep Uysal
 * @version 02.03.2020
 */ 
public class Lab02
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants

      // variables
      HTMLFilteredReader url;
      XHTMLFilteredReader url2;
      MySimpleURLReader url3;
      
      // program code
      System.out.println( "Start...");
      
      url = new HTMLFilteredReader( "http://www.cs.bilkent.edu.tr/~david/index.html");
      url2 = new XHTMLFilteredReader( "http://www.cs.bilkent.edu.tr/~david/index.html");
      url3 = new MySimpleURLReader( "http://www.cs.bilkent.edu.tr/~david/index.html");

      System.out.println( "----- MySimpleURLReader getURL() -----");
      System.out.println( "");
      System.out.println( url3.getURL());
      System.out.println( "");
      
      System.out.println( "----- MySimpleURLReader getName() -----");
      System.out.println( "");
      System.out.println( url3.getName());
      System.out.println( "");
      
      System.out.println( "----- MySimpleURLReader getPageContents() -----");
      System.out.println( "");
      System.out.println( url3.getPageContents());
      System.out.println( "");
      
      System.out.println( "----- HTMLFilteredReader getPageContents() -----");
      System.out.println( "");
      System.out.println( url.getPageContents());
      System.out.println( "");
      
      System.out.println( "----- HTMLFilteredReader getUnfilteredPageContents() -----");
      System.out.println( "");
      System.out.println( url.getUnfilteredPageContents());
      System.out.println( "");
      
      System.out.println( "----- XHTMLFilteredReader getLinks() -----");
      System.out.println( "");
      for(int k = 0; k < url2.getLinks().size(); k++)
         System.out.println( url2.getLinks().get(k));
   }
}