                                                 
/**
 * program that calculates the amount of carbon dioxide emitted for
each gallon of gas consumed. 
 *
 * @author K. Laurie
 * @version 1/14/2020
 */
public class CO2FootprintV1
{
    // instance variables - replace the example below with your own
    double galUsed, tonsCO2, poundsCO2;

    /**
     * Constructor for objects of class CO2FootprintV1
     */
    public CO2FootprintV1(double gal)
    {
        // initialise instance variables
        galUsed = gal;
        tonsCO2 = 0.0;
        poundsCO2 = 0.0;
    }
    
    /**
     * method to calculate CO2 emitted in tons
     * @param galUsed gallons used
     */
    public void calcTons()
    {
        tonsCO2 = galUsed * (8.78 * Math.pow(10, -3));
    }
    
    /**
     * method to convert tons of CO2 emitted to pounds and assign to poundsCO2
     *@param tonsCO2 tons of CO2 emitted
       */
    
    public void convertTonstoPounds()
    {
        poundsCO2 = tonsCO2 * 2000;
    }
    
    /**
     * Accessor method to return tonsCO2
     * @param tonsCO2 CO2 emitted in tons
     * @return CO2 emitted in tons
     */
    
    public double getTonsCO2()
    {
        return tonsCO2;
    }
    
    /**
     * Accessor method to return CO2 emitted in pounds
     * @param poundsCO2 CO2 emitted in pounds
     * @return CO2 emitted in pounds
     */
    
    public double getPoundsCO2()
    {
        return poundsCO2;
    }
    
}
