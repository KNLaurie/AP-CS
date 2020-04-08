
/**
 * Write a description of class CalculatePrimeTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class CalculatePrimeTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Up to how many number would you like to check if prime: ");
        int max = in.nextInt();
        
        CalculatePrime prime = new  CalculatePrime(max);
        
        System.out.println("Number of Prime Numbers: " + prime.getCount());
        System.out.print("Prime numbers: " + prime.getPrime());
        
    }
}
