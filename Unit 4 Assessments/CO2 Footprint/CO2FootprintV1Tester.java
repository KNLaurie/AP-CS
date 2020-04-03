
/**
 * This class tests CO2FootprintV1
 *
 * @author K. Laurie
 * @version 12/14/2020
 */
public class CO2FootprintV1Tester
{
    public static void main(String[] args)
    {
        //declaration variables
        double annualGal = 971.5;
        double CO2Tons, CO2Pounds;
        
        //Invoke default constructor
        CO2FootprintV1 car = new CO2FootprintV1(annualGal);
        
        //call methods
        car.calcTons();
        car.convertTonstoPounds();
        CO2Tons = car.getTonsCO2();
        CO2Pounds = car.getPoundsCO2();
        
        //print results
        System.out.println("\t\tCO2 Emissions");
        System.out.println("Gas in Gallons\tPounds from Gas\tTons from Gas");
        System.out.printf("%9.2f%19.2f%13.2f", annualGal, CO2Pounds, CO2Tons);
    }
}
