package cs102.ds;
import junit.framework.TestCase;

/**
 * List Test Class
 * @author Recep Uysal
 * @version 11.05.2020
 */ 
public class ListTest extends TestCase 
{
   // proporties
   List list;
   List list2;
   
   // test size method
   public void testsize() 
   {
      list = new List();
      list.addToHead( "aaa" );
      list.addToHead( "bbb" );
      list.addToHead( "ccc" );
      list.addToHead( "ddd" );
      
      assertEquals( 4, list.size() );
   }
   
   // test removeFromHead method
   public void testremoveFromHead() 
   {
      list = new List();
      list.addToTail( "aaa" );
      list.addToTail( "bbb" );
      list.addToTail( "ccc" );
      list.addToTail( "ddd" );
      
      assertEquals( "aaa", list.removeFromHead() );
   }
   
   // test isEmpty method
   public void testisEmpty() 
   {
      list = new List();
      list2 = new List();
      list2.addToTail( "abcd" );
      
      assertEquals( true, list.isEmpty() );
      assertEquals( false, list2.isEmpty() );
   }
   
   // test getData method
   public void testgetData() 
   {
      list = new List();
      list.addToTail( "aaa" );
      list.addToTail( "bbb" );
      list.addToTail( "ccc" );
      list.addToTail( "ddd" );
      
      assertEquals( "aaa", list.getData(0) );
      assertEquals( "bbb", list.getData(1) );
      assertEquals( "ccc", list.getData(2) );
      assertEquals( "ddd", list.getData(3) );
   }
   
   // test contains method
   public void testcontains() 
   {
      list = new List();
      list.addToTail( "aaa" );
      list.addToTail( "bbb" );
      list.addToTail( "ccc" );
      list.addToTail( "ddd" );
      
      assertEquals( true, list.contains( "aaa") );
      assertEquals( false, list.contains("b") );
   }
   
   // test isOrdered method
   public void testisOrdered() 
   {
      list = new List();
      list.addToTail( "aaa" );
      list.addToTail( "bbb" );
      list.addToTail( "ccc" );
      list.addToTail( "ddd" );
      
      list2 = new List();
      list2.addToTail( "nnn" );
      list2.addToTail( "aaa" );
      list2.addToTail( "kkkk" );
      
      assertEquals( true, list.isOrdered() );
      assertEquals( false, list2.isOrdered() );
   }
   
   // test createFromString method
   public void testcreateFromString() 
   {
      list = new List();
      list = list.createFromString( "abc" );
      
      assertEquals( "a", list.getData(0) );
      assertEquals( "b", list.getData(1) );
      assertEquals( "c", list.getData(2) );
   }
   
   // test createFrom method
   public void testcreateFrom() 
   {
      list = new List();
      String[] words;
      
      words = new String[3];
      words[0] = "aaa";
      words[1] = "bbb";
      words[2] = "ccc";
      
      list = list.createFrom( words );
      
      assertEquals( "aaa", list.getData(0) );
      assertEquals( "bbb", list.getData(1) );
      assertEquals( "ccc", list.getData(2) );
   }
   
   // test merger method
   public void testmerger() 
   {
      String[] array1 = {"A", "D", "C"};
      String[] array2 = {"K", "B", "A", "C", "R"};
      
      List a = new List();
      List b = new List();
      list = new List();
      
      a = a.createFrom( array1 );
      b = b.createFrom( array2 );
      list = list.merger( a, b );
      
      assertEquals( "D", list.getData(0) );
      assertEquals( "K", list.getData(1) );
      assertEquals( "B", list.getData(2) );
      assertEquals( "R", list.getData(3) );
   }
}
