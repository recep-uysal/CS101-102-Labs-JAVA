import cs1.SimpleURLReader;
/**
 * MySimpleURLReader Class
 * @author Recep Uysal
 * @version 02.03.2020
 */ 
public class MySimpleURLReader extends SimpleURLReader 
{
   // properties
   String url;
   
   // constructors
   public MySimpleURLReader( String url )
   {
      super( url);
      this.url = url;
   }
   // methods
   
   public String getURL()
   {
      return url;
   }
   
   public String getName()
   {
      int index;
      
      index = 0;
      
      for( int k = url.length() - 1; k > 0; k--)
      {
         if( url.charAt(k) == '/')
         {
            index = k;
            k = -1;
         }
      }
      
     return ( url.substring(index + 1));
   }
   
   @Override
   public String getPageContents()
   {
      return (super.getPageContents().substring(4));
   }
}