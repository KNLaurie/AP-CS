
/**
 * Program determines if you are in target range of your exercise heart rate
 *
 * @author Kaitlyn Laurie
 * @version 10/21/2019
 */
import java.util.Scanner;

public class TargetZone
{
    public static void main(String[] args)
    {
     Scanner in = new Scanner(System.in);
     
     System.out.print("What is your resting heart rate: ");
     int restingHR = in.nextInt();                          //ask user for RHR
     
     System.out.print("What is you current age: ");         //get user's age
     int age = in.nextInt();
     
     //maximum heart rate
     int maximumHR = 220 - age ;
     
     //heart rate reserve
     int heartRateReserve = maximumHR - restingHR;
     
     //lower end of heart rate reserve
     double lowerEnd = 0.5 * heartRateReserve + restingHR;
     
     //upper end of heart rate reserve
     double upperEnd = 0.85 * heartRateReserve + restingHR;
     
     System.out.print("What is you heart rate while exercising: ");
     int exerciseHR = in.nextInt();                         //get user's exercise HR
     
     //Determine if exercise HR is in target range
     boolean inTargetRange = exerciseHR < upperEnd;
     inTargetRange = exerciseHR > lowerEnd;
     
     //initialize output message if not in target range
     String message = "You are not in target range.\nYour target range is between " + (int)lowerEnd + " and " + (int)upperEnd;
     
     //change meassage if you are in target range
     if(inTargetRange)
        message = "Congratulations, you are in target range!\nYour target range is between " + (int)lowerEnd + " and " + (int)upperEnd;
     
     System.out.print(message);
     
    }
}