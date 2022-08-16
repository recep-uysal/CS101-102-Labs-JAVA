/**
 * A simple Java class!
 */
public class IntBag 
{
   // properties
   private int [] bag;
   private int valid;

   // constructors
   public IntBag()
   {
      bag = new int[100];
   }
   
   public IntBag( int desiredValue)
   {
      valid = 0;
      bag = new int[desiredValue];
   }
   
   // methods
   public void add( int number)
   {
      if( valid < bag.length)
      {
         valid++;
         bag[valid] = number;
      }
      else
         System.out.println( "The array is full");
   }
   
   public void add ( int index, int number)
   {
      valid++;
      
      for ( int i = valid - 1; i >= index; i--)
      {
         bag[i + 1] = bag[i];
      }
      
      bag[index] = number;
   }
   
   public void remove( int index)
   {
      for( int i = index; i < valid - 1; i++)
      {
         bag[i] = bag[i + 1];
      }
      
      valid--;
   }
   
   public boolean contains( int number)
   {
      int check;
      
      check = 0;
      
      for( int k = 0; k < valid; k++)
      {
         if ( bag[k] == number)
            check++;
      }
      
      return (check == 0);
   }
   
   public String toString()
   {
      String values;
      
      values = "";
      
      for( int k = 0; k < valid; k++)
      {
         values = values + bag[k] + " ";
      }
      
      return values;
   }
   
   public int size()
   {
      return valid;
   }
   
   public int get( int index)
   {
      return bag[index];
   }
   
   public String findAll( int number)
   {
      String indexes;
      
      indexes = "";
      
      for ( int k = 0; k < valid; k++)
      {
         if ( bag[k] == number)
            indexes = indexes + k + " ";
      }
      
      return indexes;
   }
}