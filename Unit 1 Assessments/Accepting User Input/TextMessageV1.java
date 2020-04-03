/**
 * Use string methods to replace phrases with abbreviations of a text message
 * Now accepting user input to create message
 *
 * @Kaitlyn Laurie
 * @10/13/2019
 */
import java.util.Scanner;

public class TextMessageV1
{

    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);   //initialize Scanner
      
      System.out.print("Enter message to convert: ");
      String message =  in.next();
      message += in.nextLine();              //Set message to full input
      
      int messageLength = message.length();
      
      //Print original message and character length
      System.out.println("Original Message: \n " + message + "\n message length: " + 
             messageLength + " characters");
      
      //Phrase replacements
      String newMessage = message.replace("i don't know", "404");
      newMessage = newMessage.replaceAll("will", "wl");
      newMessage = newMessage.replaceAll("be right back", "BRB");
      newMessage = newMessage.replaceAll("because", "cuz");
      newMessage = newMessage.replaceAll("laughing out loud", "LOL");
      
      int newMessageLength = newMessage.length();
      
      //print new message and character length
      System.out.print("New Message: \n " + newMessage + "\n message length: " + 
                        newMessageLength + " characters");
    }
}
