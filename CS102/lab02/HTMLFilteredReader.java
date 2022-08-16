/**
 * HTMLFilteredReader Class
 * @author Recep Uysal
 * @version 02.03.2020
 */ 
public class HTMLFilteredReader extends MySimpleURLReader {
   
   //proporties
   String url;

   //constructurs
   public HTMLFilteredReader( String url )
   {
      super( url );
   }
   
   //methods
   @Override
   public String getPageContents()
   {
      String text;
      String value;
      int index;
      int index2;
      
      text = getUnfilteredPageContents();
      value = "";
      index = 0;
      index2 = 0;
      
      for( int k = 0; k < getUnfilteredPageContents().length(); k++)
      {
         if( text.charAt(k) == '>')
            index = k;
         else if ( text.charAt(k) == '<')
         {
            index2 = k;
            if( index != index2)
               value = value + text.substring(index + 1, index2);
         }
      }
      value = value.replaceAll( "&nbsp;", "");
       return value;
   }
   
   public String getUnfilteredPageContents()
   {
      return ( super.getPageContents());
   }
}