
/**
 *Program of a guessing game prompting the user to guess the computers number
 *V2 includes choosing the range
 *
 * @author Kaitlyn Laurie
 * @version 11/5/2019
 */
import java.util.Scanner;
public class GuessingGameV2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        //Initialize variables
        int max;
        int min;
        int counter = 0;
        int maxGuesses = 10;
        
        //choose number range
        System.out.print("Choose max number range: ");
        max = in.nextInt();
        System.out.print("Choose nmin number range: ");
        min = in.nextInt();
        
        int num = (int)(Math.random()*((max-min)*1))+min; //Generate int between given max/min
        
        
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
            
            System.out.println("Try again, guess a number between 1-100\nNumber of guesses remaining: " + (maxGuesses - counter));
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
