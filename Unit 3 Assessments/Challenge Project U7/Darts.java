
/**
 *  a program to calculate the value of pi by simulating
 *  throwing darts at a dartboard
 *
 * @author K. Laurie
 * @version 12/17/2019
 */
import java.util.Scanner;
public class Darts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many darts should be thrown: ");
        int darts = in.nextInt();
        
        System.out.print("How many trials should be conducted: ");
        int trials = in.nextInt();
        
        double[] pi = new double[trials];
        double x;
        double y;
        int hitCounter = 0;
        
        for(int i=0 ; i<trials; i++)
        {
            for(int n=0; n<darts; n++)
            {
                y = Math.random();
                x = Math.random();
                if(Math.pow(x, 2) + Math.pow(y, 2) <= 1)
                {
                    hitCounter += 1;
                }
            }
            
            pi[i] = 4.0 * (double)hitCounter / (double)darts;
            hitCounter = 0;
            
            System.out.printf("Trial [%d]: pi = %.5f\n", i, pi[i]);  
        }
        
        
        
    }
}
