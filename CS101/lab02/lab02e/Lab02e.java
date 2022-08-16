import java.util.Scanner;

/**
 * Employee Ýnformation Program
 * @author Recep Uysal
 * @version 17.10.2019
 */ 
public class Lab02e
{
   public static void main( String[] args)
   {
      Scanner scan = new Scanner( System.in);

      // constants
      final String DOCTYPE = "<!DOCTYPE html>";
      final String HTML1 = "<html>";
      final String HEAD1 = "<head>";
      final String TITLE = "<title>";
      final String TITLE2 = "</title>";
      final String HEAD2 = "</head>";
      final String BODY1 = "<body>";
      final String HR = "<hr>";
      final String HL = "<h1>";
      final String HL2 = "</h1>";
      final String P = "<p>";
      final String P2 = "</p>";
      final String BODY2 = "</body>";
      final String HTML2 = "</html>";
      
         
      

      // variables
      String name;
      int age;
      int salary;
      String comments;

      // program code
      // 1.WELCOME MESSAGE   
         //System.out.print( "Welcome to Employee Ýnformation Program" );
      // 2. ENTER NAME   
         //System.out.println( "Please enter your name " );
      name = scan.nextLine();
      // 3. ENTER AGE
         //System.out.println( "Please enter your age " );
      age = scan.nextInt();
      // 4. ENTER SALARY   
         //System.out.println( "Please enter your salary" );
      salary = scan.nextInt();
      // 5. ENTER COMMENTS   
         //System.out.println( "Please write comment" );
      comments = scan.nextLine();
      comments = scan.nextLine();
      
      System.out.print( DOCTYPE );
      System.out.print( HTML1 );
      System.out.print( HEAD1 );
      System.out.print( TITLE + name + "'s Home Page" + TITLE2 );
      System.out.print( HEAD2 );
      System.out.print( BODY1 );
      System.out.print( HR );
      System.out.print( HL + name + HL2);
      System.out.print( P + "Age: " + age + P2 );
      System.out.print( P + "Salary: " + salary + P2 );
      System.out.print( P + "Comments: " + comments + P2);
      System.out.print( HR );
      System.out.print( BODY2 );
      System.out.print( HTML2 );
      
   }

} // end class