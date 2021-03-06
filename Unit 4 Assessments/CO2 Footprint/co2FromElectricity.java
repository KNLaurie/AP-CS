
/**
 * calculate your CO2 footprint based on the amount of electricity 
 * used in your home each year. 
 *
 * @author K. Laurie
 * @version 1/25/2020
 */

import java.util.ArrayList;

public class co2FromElectricity
{
    // instance variables - replace the example below with your own
    private ArrayList<Integer> kWh;
    private int months, numBulbs;
    private ArrayList<Double> monthlyPayment;
    double emmissionFactor, avgPayment, avgKWH, avgKWPrice, reduction, grossEmmission, netEmmission;

    /**
     * Constructor for objects of class co2FromElectricity
     */
    public co2FromElectricity(int numMonths, int bulbs)
    {
        // initialise instance variables
        kWh = new ArrayList<Integer>(numMonths);
        monthlyPayment = new ArrayList<Double>(numMonths);
       
        months = numMonths;
        emmissionFactor = 1.37;
        
        avgPayment = 0;
        avgKWH = 0;
        avgKWPrice = 0;
        
        grossEmmission = 0;
        netEmmission = 0;
        
        numBulbs = bulbs;
    }

    /**
     * Set monthly payments to array list
     *
     * @param payments: payment required each month
     */
    public void addPayments(double[] payments)
    {
        // put your code here
        for(int i =0; i < months; i++)
        monthlyPayment.add(payments[i]);
    }
    
     /**
     * Set monthly killowatt usage to array list
     *
     * @param killowatts: killwatt hour usage each month
     */
     public void addKillowatts(int[] killowatts)
     {
        // put your code here
        for(int i =0; i < months; i++)
        kWh.add(killowatts[i]);
     }
     
     /** calculate average monthly electricity bill and return value(no parameters)
      *
      *@return average monthly payment
      */
     public double calcAvgPayment()
     {
         double totalPayments = 0;
         
         for(int i = 0; i < months; i++)
         totalPayments += monthlyPayment.get(i);
         
         avgPayment = totalPayments / months;
         
         return avgPayment;
     }
     
     /** calculate average monthly killowatt usage(no parameters)
      *
      *@return average KWH
      */
     public void calcAvgKillowatts()
     {
         double totalKillowatts = 0;
         
         for(int i = 0; i < months; i++)
         totalKillowatts += kWh.get(i);
         
         avgKWH = totalKillowatts / months;
     }
     
     /**
      * calculate average price per killowatt and return value(no parameter)
      *
      *@return average price per killowat
      */
     public double calcPricePerKW()
     {
         avgKWPrice = avgPayment / avgKWH;
         
         return avgKWPrice;
        }
     
     /**
      * Calculate yearly CO2 emmissions from electricity (no parameters)
      * 
      * @return yearly electricity CO2 emmissions
      */
     public void calcEmmissions()
     {
         grossEmmission = (avgPayment / avgKWPrice) * emmissionFactor * months;
     }
     
     /**
      * calculate waste reduction from switching to 25 watt bulbs
      * @param number of lightbulbs
      * 
      */
     public void calcReduction()
     {
         reduction = numBulbs * 1.37 * 73;
         netEmmission = grossEmmission - reduction;
        }
}
