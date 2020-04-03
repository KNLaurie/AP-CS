/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current 
 * exchange rate.
 * 
 *
 * @author Kaitlyn Laurie
 * @version 10/13/2019
 */
import java.util.Scanner;
public class CurrencyConversionV1
{   
    public static void main(String [ ] args)
    {
        double startingUsDollars = 2500.00;      // local variable for US Dollars
        double remainingUsDollars;                // local variable for US dollars remaining
        double pesosSpent;                       // local variable for Mexican pesos spent
        double totalPesos = 0;                   // local variable for total pesos
        double remainingPesos = 0;               // local variable for pesos remaining after purchases
        double dollarsSpentInMexico = 450.00;    // local variable for dollars spent in Mexico
        double yenSpent;                         // local variable for Japanese yen spent
        double totalYen = 0;                     // local variable for total yen
        double remainingYen = 0;                 // local variable for yen remaining after purchases
        double dollarsSpentInJapan = 824.00;     // local variable for dollars spent in Japan        
        double eurosSpent;                       // local variable for euros spent
        double totalEuros = 0;                   // local variable for total euros
        double remainingEuros = 0;               // local variable for euros remaining after purchases
        double dollarsSpentInFrance = 1100.00;   // local variable for dollars spent in France        
        
        //Ask user for currency conversions
        Scanner in = new Scanner(System.in);
        System.out.print("What is the current conversion of US dollars to pesos: ");
        double pesoConversion = in.nextDouble();
        
        System.out.print("What is the current conversion of pesos to yen currency: ");
        double yenConversion1 = in.nextDouble();
        System.out.print("What is the current conversion of US dollars to yen: ");
        double yenConversion2 = in.nextDouble();
        
        System.out.print("What is the current conversion of yen to euros: ");
        double euroConversion1 = in.nextDouble();
        System.out.print("What is the current conversion of US dollars to euros: ");
        double euroConversion2 = in.nextDouble();
        
        System.out.print("What is the current conversion of euros to US dollars: ");
        double dollarConversion = in.nextDouble();
        
        // purpose of program
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println();
        System.out.println("Mademoiselle Jaquard starts with " + startingUsDollars + 
                            " US dollars.");
        
        // convert US dollars to Mexican pesos
        totalPesos = startingUsDollars * pesoConversion;
        pesosSpent = dollarsSpentInMexico * pesoConversion;
        remainingPesos = totalPesos - pesosSpent;
        
        System.out.printf(" She started with %.2f and spent %.2f pesos in Mexico, she has %.2f pesos left.",
                            totalPesos, pesosSpent, remainingPesos);
        System.out.println();
       
        // convert Mexican pesos to Japanese yen
        totalYen = remainingPesos * yenConversion1;
        yenSpent = dollarsSpentInJapan * yenConversion2;
        remainingYen = totalYen - yenSpent;

        System.out.printf(" She started with %.2f and spent %.2f yen in Japan, she has %.2f yen left.",
                            totalYen, yenSpent, remainingYen);
        System.out.println();
        
        // convert Japanese yen to Euros
        totalEuros = remainingYen * euroConversion1;
        eurosSpent = dollarsSpentInFrance * euroConversion2;
        remainingEuros = totalEuros - eurosSpent;

        System.out.printf(" She started with %.2f and spent %.2f euros in France, she has %.2f euros left.",
                            totalEuros, eurosSpent, remainingEuros);
        System.out.println();
        
        // convert Euros to US Dollars
        remainingUsDollars = remainingEuros * dollarConversion;
        
        System.out.printf("Mademoiselle Jaquar now has %.2f US dollars left, after her trip.", remainingUsDollars);

            
    } // end of main method
} // end of class     
