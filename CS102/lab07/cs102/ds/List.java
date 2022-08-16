package cs102.ds;

/**
 * List Class
 * @author Recep Uysal
 * @version 11.05.2020
 */ 
public class List
{
   // properties
   Node head;
   
   // constructors
   public List()
   {
      head = null;
   }
   
   // methods
   /*
    * addToHead method adds item into head of the list
    * @param item is the item we want to add
    */
   public void addToHead( String item)
   {
      // if the list is not empty
      if( !isEmpty() )
      {
         Node newNode;
         newNode = new Node( item, head );
         head = newNode;
      }
      // if the list empty
      else
      {
         head = new Node( item, null );
      }
   }
   
   /*
    * addToTail method adds item into tail of the list
    * @param item is the item we want to add
    */
   public void addToTail( String item)
   {
      // create and initialise a node
      Node node;
      node = head;
      
      // if the list is empty
      if( isEmpty() )
      {
         head = new Node( item, null );
      }
      else
      {
         // find tail
         while( node.next != null )
            node = node.next;
         
         // add after the tail
         node.next = new Node( item, null );
      }
   }
   
   /*
    * removeFromHead method removes the head element of a list
    * @return returns to the head element which is removed
    */
   public String  removeFromHead()
   {
      // if the list is empty
      if( isEmpty() )
      {
         return( "The list is empty." );
      }
      else
      {
         // create and initialise a node
         Node node;
         node = head;
         //change the head
         
         head = head.next;
         return node.data;
      }
   }
   
   /*
    * isEmpty method checks if a list is empty or not
    * @param index is the index we want to find its element
    * @return returns true, if the list is empty
    */
   public boolean isEmpty()
   {
      return ( head == null );
   }
   
   /*
    * getData method finds the data with given index
    * @param index is the index we want to find
    * @return the data of the element
    */
   public String getData( int index)
   {
      // create and initialise a node and a int
      Node node;
      int number;
      node = head;
      number = 0;
      
      // if the list is empty
      if( isEmpty() )
         return( "The list is empty." );
      else
      {
         // try to find the index
         while( number < index && head.next != null )
         {
            node = node.next;
            number++;
         }
         
         // if it finds to index
         if( number == index )
            // return value;
            return node.data;
         else 
            return null;
      }
   }
   
   /*
    * print method prints the elements in the list
    */
   public void print()                    // iterative method
   {
      // create and initialise a string
      String elements;
      elements = "";
      
      // if the list is not empty
      if( isEmpty() )
         System.out.println( "The list is empty." );
      else
      {
         // print the first element
         elements = elements + head.data + " ";
         // print others
         while( head.next != null )
         {
            head = head.next;
            elements = elements + head.data + " ";
         }
      }
      System.out.println( elements );
   }
   
   /*
    * printRevers method prints the elements in the list reversely
    */
   public void printReverse()
   {
      // create and initialise a string
      String elements;
      elements = "";
      
      // if the list is not empty
      if( isEmpty() )
         System.out.println( "The list is empty." );
      else
      {
         // stopping case
         if( head.next != null )
         {
            elements = elements + head.data + " ";
            head = head.next;
            //recursion
            printReverse();
            
         }
         else
            elements = elements + head.data + " ";
      }
      System.out.println( elements );
   }
   
   /*
    * contains method checks a list contains a target value
    * @param target is the value we want to find
    * @return returns true, if the list include the target
    */
   public boolean contains( String target)
   {
      // create and initialise a node
      Node node;
      node = head;
      
      // check the list is empty
      if( isEmpty() )
         return false;
      
      // check the first element is the target
      if( node.data == target )
         return true;
      else
      {
         //check others
         while( node.next != null )
         {
            node = node.next;
            if( node.data == target )
               return true;
         }
      }
      return false;
   }
   
   /*
    * isOrdered method checks a list is ordered
    * @return returns true, if the list is ordered
    */
   public boolean isOrdered()
   {
      // create and initialise a node
      Node node;
      node = head;
      
      // check the list is empty
      if( isEmpty() )
         return false;
      else
      {
         // check all elements are ordered or not
         while( node.next != null )
         {
            if( node.data.compareTo( node.next.data ) >  0 )
               return false;
            
            node = node.next;
         }
         return true;
      }
   }
   
   /*
    * size method gives the size of a list
    * @return size is the size of a list
    */
   public int size()
   {
      // create and initialise a node and a int
      int size;
      Node node;
      size = 1;
      node = head;
      if( isEmpty() )
         size = 0;
      else
      {
         // increase the size until it reaches the end
         while( node.next != null )
         {
            node = node.next;
            size++;
         }
      }
      return size;
   }
   
   /*
    * createFrom method creates a list from a given array
    * @param array is the array of values
    * @return list is the new list
    */
   public List createFrom( String[] array)
   {
      // create and initialise a list
      List list;
      list = new List();
      
      // add array elements into list
      for( int k = 0; k < array.length; k++ )
         list.addToTail( array[k] );
      
      return list;
   }
   
   /*
    * createFromString method creates a list from a string object
    * @param word is the string object
    * @return list is the new list
    */
   public List createFromString( String word)
   {
      // create and initialise a list
      List list;
      list = new List();
      
      // add characters of the word into list
      for( int k = 0; k < word.length(); k++ )
         list.addToTail( word.charAt(k) + "" );
      
      return list;
   }
   
   /*
    * merger method creates a list from 2 lists elements which are not in the 2 list
    * @param a is the first list
    * @param b is the second list
    * @return list is the new list
    */
   public List merger( List a, List b)
   {
      // create and initialise a list and a int
      List list;
      int error;
      list = new List();
      error = 0;
      
      // check the first lists elements
      for( int k = 0; k < a.size(); k++)
      {
         error = 0;
         
         // if a element is in the second list, increase error
         if( b.contains( a.getData(k) ) )
            error++;
         
         // if a element is not in the second list, add it into new list
         if( error == 0 )
            list.addToTail( a.getData(k) );
      }
      
      // check the second lists elements
      for( int k = 0; k < b.size(); k++)
      {
         error = 0;
         
         // if a element is in the firs list, increase error
         if( a.contains( b.getData(k) ) )
            error++;
         
         // if a element is not in the first list, add it into new list
         if( error == 0 )
            list.addToTail( b.getData(k) );
      }
      return list;
   }
   
   // inner Node class
   private class Node 
   {
      // proporties
      String data;
      Node next;
      
      // constructors
      public Node( String data, Node next) 
      {
         this.data = data;
         this.next = next;
      }
      
      // methods
      /*
       * toString method creates a string version of the list
       * @return list is the string version of the list
       */
      public String toString()
      {
         // create a string and a node
         String list;
         Node node;
         list = "";
         node = head;
         
         // add values into string until it reaches to the end
         while( node != null )
         {
            list = list + node.data + " ";
            node = node.next;
         }
         return list;
      }
      
      /*
       * next method finds the next element of a list
       * @param n is the value we want to find the next element 
       * @return the next value
       */
      private Node next( Node n )
      {
         // find the n
         while( head != n )
            head = head.next;
         return head.next;
      }
      
      /*
       * previous method finds the previous element of a list
       * @param n is the element we want to find the previous element 
       * @return the previous value
       */
      private Node previous( Node n )
      {
         // stopping case
         if( head.next == n )
            return head;
         else
         {
            head = head.next;
            // recursion
            return previous( n );
         }
      }
      
      /*
       * tail method finds the last element of a list
       * @return the last value
       */
      private Node tail()
      {
         // create and initialise a node
         Node node;
         node = head;
         
         // find the last
         while( node != null )
            node = node.next;
         return node;
      }
   } // end class Node
}