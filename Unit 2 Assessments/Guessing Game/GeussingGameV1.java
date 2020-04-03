
/**
 * User guesses randomly generated number in under 10 guesses
 *
 * @author Kaitlyn Laurie
 * @version 11/1/2019
 */
import java.util.Scanner;
public class GeussingGameV1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        //Initialize variables
        int max = 100;
        int min = 1;
        int num = (int)(Math.random()*((max-min)*1))+min; //Generate int between given max/min
        int counter = 0;
        int maxGuesses = 10;
        
        System.out.println("Guess a number between 1-100 \nNumber of guesses remaining: " + (maxGuesses - counter));
        System.out.print("User Guess: ");
        int userGuess = in.nextInt();
        
        //start loop
        while(userGuess != num && counter < maxGuesses)
        {
            if(userGuess > num)
            {
                System.out.println("Too High!");
                counter++;
            }
            else
            {
                System.out.print("Too Low!");
                counter++;
            }
            
            System.out.print("Try again, guess a number between 1-100\nNumber of guesses remaining: " + (maxGuesses - counter));
            System.out.print("User Guess: ");
            userGuess = in.nextInt();
        }
        
        if(userGuess != num && counter == maxGuesses)
        {
            System.out.println("Sorry, you've run out of lives! Restart and try again!");
        }
        else
        {
            System.out.print("Congrats! You've guessed correctly!");
        }
    }
}
