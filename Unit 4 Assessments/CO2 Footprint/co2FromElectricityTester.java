
/**
 *Test CO@ from electricity class
 *
 * @author K. Laurie
 * @version 11/25/2020
 */
public class co2FromElectricityTester
{
    public void main()
    {
        int[] kWh = {1876, 1651, 1322, 1037, 1108, 1240,  1355, 1218, 1665, 2266, 2484, 2133};
        double[] monthlyPayments  = {222, 222, 73.02, 234.69, 236.31, 236.31, 235.59, 236.31, 236.31, 236.31,236.31, 236.31};
        
        int months = 12;
        
        co2FromElectricity tester= new co2FromElectricity(months, 11);
        
        //set values
        tester.addKillowatts(kWh);
        tester.addPayments(monthlyPayments);
        
        //calculate averages
        tester.calcAvgKillowatts();
        double avgPayment = tester.calcAvgPayment();
        double avgKWPrice = tester.calcPricePerKW();
        
        //calculate co2 emmissions
        tester.calcEmmissions();
        
        //print results
        System.out.printf("Average Monthly Electricity Bill: %.2f\n", avgPayment);
        System.out.printf("Average Monthly Electricity Price: %.2f\n", avgKWPrice);
        System.out.printf("Annual CO2 Emmissions from Electricity Usage: %.2f", tester.grossEmmission);
        
        
        
        
    }
}
