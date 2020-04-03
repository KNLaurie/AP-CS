/**
 *A program to determine if a user has correctly chosen a randomly selected
 *three digit number. 
 * 
 * @author Kaitlyn Laurie
 * @version 11/8/2019
 */
import java.util.Random; 
import java.util.Scanner;
public class Lottery
{
    public static void main(String[] args)
    {
        //declare and initialized variables and objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        String lotteryNum = "";
        String userGuess = "";
        int winnings = 0;
        
        //Generate a 3-digit "lottery" number composed of random numbers
        for(int counter=0; counter<3; counter++)
        {
            String num = Integer.toString(rand.nextInt(9));
            lotteryNum = lotteryNum + num;
        }
        
        //Input: Ask user to guess 3 digit number
        System.out.println("Guess each lottery number!");
        
        for(int counter=0; counter<3; counter++)
        {
            System.out.println("Choose a betwenn 0-9 for number " + counter);
            String userNum = in.next();
            userGuess = userGuess + userNum;
        }
        
        if(userGuess.charAt(0) == lotteryNum.charAt(0) && userGuess.charAt(1) == lotteryNum.charAt(1))
        System.out.println("Winner: " + lotteryNum + "\nCongratulations, the front pair matched!");
        else if(userGuess.charAt(2) == lotteryNum.charAt(2) && userGuess.charAt(1) == lotteryNum.charAt(1))
        System.out.println("Winner: " + lotteryNum + "\nCongratulations, the end pair matched!");
        else if(userGuess == lotteryNum)
        System.out.print("Winner: " + lotteryNum + "\nCongrats you're a genius who guessed em' all!");
        else
        System.out.println("Winner: " + lotteryNum + "\n You lose");

        
        
        
        

        
    } //end main
}//end class Lottery