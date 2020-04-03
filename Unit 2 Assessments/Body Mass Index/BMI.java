/**
 * Calculate BMI
 *
 * @author Kaitlyn
 * @version 10/29/2019
 */
import java.util.Scanner;
public class BMI
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        //Ask user for information
        System.out.print("Enter your name (first last): ");
        String name = in.next();
        name += in.nextLine();
        
        System.out.print("Height in feet and inches (e.g. 5 10): ");
        double heightFT = Double.parseDouble(in.next());
        double heightIN = Double.parseDouble(in.nextLine().substring(1));
        heightIN = heightIN  + heightFT * 12;
        
        System.out.print("Weight in pounds: ");
        double weight = in.nextDouble();
        
        //Convert to metric
        double weightKG = weight / 2.20;
        double heightM = heightIN / 39.37;
        double BMI = weightKG / Math.pow(heightM, 2);
        
        //Print human data
        System.out.println("\n\nBody Mass Index Calculator\n==========================");
        System.out.println("Name: " + name);
        System.out.println("Height (m): " + heightM);
        System.out.println("Weight (kg): " + weightKG);
        System.out.println("BMI: " + BMI);
        
        if(BMI < 18.5)
            System.out.println("Category: Under Weight");
        else if(BMI >= 18.5 && BMI <= 24.9)
            System.out.println("Category: Healthy Weight");
        else if(BMI > 25 && BMI <= 29.9)
            System.out.println("Category: Over Weight");
        else if(BMI >= 30 && BMI <= 34.9)
            System.out.println("Category: Obese(Class I)");
        else if(BMI >= 35 && BMI <= 39.9)
            System.out.println("Category: Severely Obese(Class II)");
        else if(BMI >= 40 && BMI <= 49.9)
            System.out.println("Category:  Morbidly Obese(Class III)");
        else
            System.out.println("Category: Morbidly Obese(Class IV)");
        
    }
}
