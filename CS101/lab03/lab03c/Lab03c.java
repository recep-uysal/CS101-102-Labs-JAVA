import java.util.Scanner;
import java.nio.file.*;  
import java.io.*;

/**
 * Employee Ýnformation Program
 * @author Recep Uysal
 * @version 24.10.2019
 */ 
public class Lab03c
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
      final String PHOTO = "<img src=\"einstein.jpg\">";
      final double TAXRATE = 0.15;
      final double TAXRATELOW = 0.05;
      final double TAXRATEHIGH = 0.25;
      
      // variables
      String name;
      int age;
      int grossSalary;
      double netSalary;
      String comments;
      double taxrate;
      
      // program code
      // 1. Enter Name   
      name = scan.nextLine();
      
      // 2. Enter Age
      age = scan.nextInt();
      if ( age<0 )
      {
         System.out.print( "Wrong Age" );
      }
      
      // 3.Enter Salary
      else
      {
         grossSalary = scan.nextInt();
         if ( grossSalary >= 10000 && grossSalary < 100 )
            System.out.print( "Wrong Salary" );
         else
         {   
            taxrate = 0;
            if ( grossSalary >= 1000 || grossSalary <= 5000 )
               taxrate = TAXRATE;
            if ( grossSalary < 1000 )
               taxrate = TAXRATELOW;
            if ( grossSalary > 5000)
               taxrate = TAXRATEHIGH;
            
            netSalary = (grossSalary - 100 ) * (1- taxrate);
            
            // 4. Enter Comment 
            comments = scan.nextLine();
            comments = scan.nextLine();
            
            // 5. Codes   
            System.out.print( DOCTYPE );
            System.out.print( HTML1 );
            System.out.print( HEAD1 );
            System.out.print( TITLE + name + "'s Home Page" + TITLE2 );
            System.out.print( HEAD2 );
            System.out.print( BODY1 );
            System.out.print( HR );
            
            if ( Files.exists( Paths.get("einstein.jpg") ) )
               System.out.print( PHOTO );
            
            System.out.print( HL + name + HL2);
            System.out.print( P + "Age: " + age + P2 );
            System.out.print( P + "Net Salary: " + netSalary + "  (" + taxrate + ") " + P2 );
            System.out.print( P + "Comments: " + comments + P2);
            System.out.print( HR );
            System.out.print( BODY2 );
            System.out.print( HTML2 );
         }
      }
   }
   
} // end class