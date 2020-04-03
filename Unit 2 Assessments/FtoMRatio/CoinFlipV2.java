
/**
 * This program models the ratio of male to females in Ireland
 * 
 * @author Kaitlyn Laurie
 * @11/4/2019
 */
import java.util.Scanner;
public class CoinFlipV2
{
	public static void main(String[] args)
	{
	    int females = 0;
	    int males = 0;
	    int counter = 1;
	    double randNum = 0.0;
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("How many babies? ");
	    int flips = in.nextInt();
	    
	    while(counter <= flips)
	    {
	        randNum = Math.random();
	        System.out.print(counter + "\t" + randNum);
	        
	        if(randNum < .5)
	        {
	            females++;
	            System.out.println("\t female");
	        }
	        else
	        {
	            males++;
	            System.out.println("\t male");
	           }
	        counter++;      
	    }
	    System.out.println();
	    System.out.println("Number of Females = " + females);
	    System.out.println("Number of Males = " + males);
	    
	    
	    
	}
}
