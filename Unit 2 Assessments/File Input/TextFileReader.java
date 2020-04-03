
/**
 *  A program to calculate the probability that a family with two children
 *  will consist of two boys, a boy and a girl, or two girls. 
 *
 * @author Kaitlyn Laurie
 * @version 11/6/2019
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class TextFileReader
{
   public static void main(String[] args) throws IOException
   {
      int GG = 0;
      int BB = 0;
      int BG = 0;
      int counter = 0;
      
      String token = "";
      File fileName = new File("test1.txt");
      Scanner inFile = new Scanner(fileName);
      while (inFile.hasNext())
      {
         token = inFile.next( );
         System.out.println (token);
         counter ++;

         if(token == "GG")
         GG++;
         else if(token == "BB")
         BB++;
         else
         BG++;
      }
      inFile.close();
      double girlsRatio = (GG / counter) * 100;
      double boysRatio = (BB / counter) * 100;
      double bothRatio = (BG / counter) * 100;
      
      System.out.println("\n\n\nGG percentage: " + girlsRatio + "%");
      System.out.println("BB percentage: " + boysRatio + "%");
      System.out.println("Both percentage: " + bothRatio + "%");
    }//end of main method
}//end of class 
