/**
 * A program to simulate tossing a pair of 11-sided dice and determine
 * the percentage of times each possible combination of the dice is rolled. 
 * 
 * @author Kaitlyn Laurie
 * @version 11/13/2019
 */
 
import java.util.Random;
import java.util.Scanner;
public class DiceProbability
{
    public static void main(String[] args)
    {
        //Declare and initialize variables and objects
        Scanner in = new Scanner(System.in);
        Random randNum = new Random();
        
        int match = 0; //Number of times sum of dice matches the current sum
        int die1, die2; //Random generated numbers
        int faces = 11;
    
        //initialize an array to make adding sum counts easier
        int sumCounts[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        
        //Input: ask user for number of rolls and number of sides on a die
        System.out.print("How many times will the dice be rolled? ");
        int rolls = in.nextInt();
       
        //Print heading for output table
        System.out.println("sum     counts      probability");
        //***************************************************************************************
        //Using nested loops, cycle through the possible sums of the dice.
        //Roll the dice the given number of times for each sum.
        //Count how many times the sum of the dice match the current sum being looked for.
        //***************************************************************************************
        for(int counter = 1; counter <= faces; counter++)
        {
          int face = counter;
          
          for(int counter2 = 1; counter2 <= faces; counter2++)
          {
              //loop through different combinations
              int sum = face + counter2;
              sumCounts[sum - 2] += 1;
              
           }
        }
        //Loop to increment through the possible sums of the dice 
        for(int counter = 0; counter < (faces * 2) -2; counter++)
        {
            System.out.println((counter + 2) + "        " + sumCounts[counter] + "      " + (sumCounts[counter] / (Math.pow(rolls, (faces * faces)))));     
        }
        //create sum counts for rolled die
        int sumCounts2[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        
        //Loop to throw dice given number of times
        
        for(int counter = 1; counter <= rolls; counter++)
        {
          die1 = randNum.nextInt(faces);
          die2 = randNum.nextInt(faces);
          int sum = die1 + die2;
          
          sumCounts2[sum] += 1;
              
        }

        System.out.println("");
        System.out.println("sum     counts      probability");
        //Loop to increment through the possible sums of the dice 
        
        for(int counter = 0; counter < (faces * 2) - 2; counter++)
        {
            System.out.println((counter + 2) + "        " + sumCounts2[counter] + "      " + (sumCounts2[counter] / (Math.pow(rolls, (faces * faces)))));      
        }
    } //end main
}//end class DiceProbability