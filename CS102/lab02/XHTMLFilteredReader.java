import java.util.ArrayList;
/**
 * XHTMLFilteredReader Class
 * @author Recep Uysal
 * @version 02.03.2020
 */ 
public class XHTMLFilteredReader extends HTMLFilteredReader {
   
   //proporties
   String url;
   
   //constructurs
   public XHTMLFilteredReader( String url)
   {
      super(url);
      this.url = url;
   }
   //methods
   public ArrayList<String> getLinks()
   {
      ArrayList<String> links;
      String html;
      
      links = new ArrayList<String>();
      html = "";
      
      for( int k = 0; k < super.getUnfilteredPageContents().length() - 4; k++)
      {
         if( super.getUnfilteredPageContents().substring( k, k + 4).equals( "href"))
         {
            k = k + 6;
            
            while( super.getUnfilteredPageContents().charAt(k) != '"')
            {
               html = html + super.getUnfilteredPageContents().charAt(k);
               k++;
            }
            links.add(html);
            html = "";
         }
      }
      
      return links;
   }
}