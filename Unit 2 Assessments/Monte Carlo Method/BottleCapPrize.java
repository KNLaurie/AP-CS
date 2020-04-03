
/**
 *a program that uses the Monte Carlo sampling method to estimate
 *the average number of bottles of e-Boost someone would have to drink to
 *win a prize. There is a 1 in 5 chance that a bottle cap will have a prize.
 *
 * 
 * @author Kaitlyn Laurie
 * @version 11/20/2015
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;
import java.util.Scanner;
class BottleCapPrize
{
   public static void main (String [ ] args) throws IOException
   { 
       Random randNum = new Random();
       Scanner in = new Scanner(System.in);
       
       int tries = 0;
       
      //Create a trial determining the probability of finding the cap
      for(int counter = 0; counter < 1; counter++)
      {
          boolean noCap = true;
          
          while(noCap)
          {
              double cap = randNum.nextDouble();
              
              if(cap <= 0.20)
              noCap = false;
              tries++;
            }
          
        }
      //construct an object called outFile to allow access to output methods of the PrintWriter class  
      PrintWriter outFile = new PrintWriter(new File("bottlecap.txt"));   
      
      outFile.println("Trial 1: " + tries + " tries");
      
      
      //Ask user for number of trials
      System.out.println("How many trials would you like to simulate: ");
      int trials = in.nextInt();
      
      //Simulate trials
      for(int counter = 0; counter < trials; counter++)
      {
          boolean noCap = true;
          tries = 0;
          while(noCap)
          {
              double cap = randNum.nextDouble();
              
              if(cap <= 0.20)
              noCap = false;
              tries++;
            }
          
          outFile.println("Trial " + (counter + 2) + ": " + tries + " tries");
           
        }
      outFile.close();
      
   }//end of main method
}//end of class 
