
/**
 * Use string methods to replace phrases with abbreviations of a text message
 *
 * @Kaitlyn Laurie
 * @10/13/2019
 */
public class TextMessageV1
{

    public static void main(String[] args)
    {
      String message =  "i don't know if i will be right back or not because " +
                        "right now i am laughing out loud.";
      int messageLength = message.length();
      
      //Print original message and character length
      System.out.println("Original Message: \n " + message + "\n message length: " + 
             messageLength + " characters");
      
      //Phrase replacements
      String newMessage = message.replace("i don't know", "404");
      newMessage = newMessage.replace("will", "wl");
      newMessage = newMessage.replace("be right back", "BRB");
      newMessage = newMessage.replace("because", "cuz");
      newMessage = newMessage.replace("laughing out loud", "LOL");
      
      int newMessageLength = newMessage.length();
      
      //print new message and character length
      System.out.print("New Message: \n " + newMessage + "\n message length: " + 
                        newMessageLength + " characters");
    }
}
