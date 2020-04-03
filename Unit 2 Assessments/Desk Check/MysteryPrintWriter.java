
/**
 * The purpose of this program is to demonstrate how to write information to
 * a text file on the hard disk.
 * 
 * @author KAitlyn Laurie
 * @version 11/20/2019
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
class MysteryPrintWriter
{
   public static void main (String [ ] args) throws IOException
   {
      //construct an object called outFile to allow access to output methods of the PrintWriter class  
      PrintWriter outFile = new PrintWriter(new File("deskcheck.txt"));   

      for (int loop = 1; loop <= 15; loop++)    
      {
          outFile.println("TESTING");

        }//end of for loop
      outFile.close ( );    //close the file when finished 
      
   }//end of main method
}//end of class 
