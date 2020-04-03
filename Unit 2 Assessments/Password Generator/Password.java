
/**
 * Generate a strong password
 *
 * @author Kaitlyn Laurie
 * @version 11/20/2019
 */
import java.util.Scanner;
import java.util.Random;
public class Password
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        //initialize variables
        int strengthLevel;
        int passLength;
        int counter = 1;
        String password;
        
        //print selection menu
        System.out.println("\t\t\tPassword Generation Menu");
        System.out.println("************************************************");
        System.out.println("*\t[1] Lowercase letters");
        System.out.println("*\t[2] Lowercase letters & Uppercase Letters");
        System.out.println("*\t[3] Lowercase, Uppercase, and Numbers");
        System.out.println("*\t[4] Lowercase, Uppercase, Numbers, and Punctuation");
        System.out.println("*\t[5] Quit");
        
        System.out.print("Enter Selection (1-5): ");
        strengthLevel = in.nextInt();
        
        System.out.print("Password Length (7-14): ");
        passLength = in.nextInt();
        
        if(strengthLevel == 1)
        {
            password = String.valueOf((char)(rand.nextInt(123) + 97));
            while(counter < passLength)
            {
              password += String.valueOf((char)(rand.nextInt(123) + 97));
              counter++;
            }
        }
        else if(strengthLevel == 2)
        {
            int range = rand.nextInt(10);
            if(range<5)
            password = String.valueOf((char)(rand.nextInt(91) + 65));
            else
            password = String.valueOf((char)(rand.nextInt(123) + 97));
            
            while(counter < passLength)
            {
              range = rand.nextInt(10);
              if(range<5)
              password = String.valueOf((char)(rand.nextInt(91) + 65));
              else
              password = String.valueOf((char)(rand.nextInt(123) + 97));
              counter++;
            }
        }
        else if(strengthLevel == 3)
        {
            int range = rand.nextInt(13);
            if(range<5)
            password = String.valueOf((char)(rand.nextInt(91) + 65));
            else if(range<10)
            password = String.valueOf((char)(rand.nextInt(123) + 97));
            else
            password = String.valueOf((char)(rand.nextInt(57) + 48));
            while(counter < passLength)
            {
              range += rand.nextInt(13);
              if(range<5)
              password = String.valueOf((char)(rand.nextInt(91) + 65));
              else if(range<10)
              password += String.valueOf((char)(rand.nextInt(123) + 97));
              else
              password += String.valueOf((char)(rand.nextInt(57) + 48));
              counter++;
            }
        }  
        else if(strengthLevel == 4)
        {
            password = String.valueOf((char)(rand.nextInt(127) + 48));
            while(counter < passLength)
            {
              password += String.valueOf((char)(rand.nextInt(127) + 48));
              counter++;
            }
        }
        else
        {
            password = "none";
        }
        
       System.out.println("Password: " + password);
    }    
    
    
}
