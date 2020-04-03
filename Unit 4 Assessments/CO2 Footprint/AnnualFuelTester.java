
/**
 * Write a program to project your annual fuel usage based on at least three
  fill ups of your car (or your family car). 
 *
 * @author K. Laurie
 * @version 12/28/2019
 */

public class AnnualFuelTester
{
    public static void main(String[] args)
        {
            int[] sMiles = {12168, 12452, 12710};
            int[] eMiles = {12452, 12710, 12998};
            int[] days = {1, 4, 8};
            
            double[] galUsed = {11.4, 10.8, 11.3};
            double[] pricePerGallon = {2.98, 2.76, 2.92};
            
            AnnualFuelUse car1 = new AnnualFuelUse(sMiles, eMiles, galUsed, pricePerGallon, "17 Mazda", days);
            AnnualFuelUse car2 = new AnnualFuelUse(sMiles, eMiles, galUsed, pricePerGallon, "20 Volkswagen", days);        
            AnnualFuelUse car3 = new AnnualFuelUse(sMiles, eMiles, galUsed, pricePerGallon, "89 BMW", days);
            
            //put car classes into an array
            AnnualFuelUse[] cars = {car1, car2, car3};
            
            //print headings
            System.out.println("\t\t\t\t\tGas Mileage Calculations");
            
            for(int c = 0; c < 3; c++)
            {
                for(int i = 0; i < 3; i++)
                {
                    cars[c].calcDistance(i);
                    cars[c].calcMPG(i);
                    cars[c].calcGPM(i);
                    cars[c].calcCost(i);
        
                    cars[c].distValueTest(i);
                    cars[c].mpgValueTest(i);
                    cars[c].priceValueTest(i);
                }
                
                cars[c].printData();
            }
        }
}

