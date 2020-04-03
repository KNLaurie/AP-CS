
/**
 * Test CO2Footprint class
 *
 * @author K. Laurie
 * @version 1/27/2020
 */
import java.util.ArrayList;
public class CO2FootprintTester
{
    public void main()
    {
        //initialize variables needed to calculate CO2
        int[] sMiles = {12168, 12452, 12710};
        int[] eMiles = {12452, 12710, 12998};
        int[] days = {1, 4, 8};
            
        double[] galUsed = {11.4, 10.8, 11.3};
        double[] pricePerGallon = {2.98, 2.76, 2.92};
        
        int[] kWh = {1876, 1651, 1322, 1037, 1108, 1240,  1355, 1218, 1665, 2266, 2484, 2133};
        double[] monthlyPayments  = {222, 222, 73.02, 234.69, 236.31, 236.31, 235.59, 236.31, 236.31, 236.31,236.31, 236.31};
        
        //CO2 footprint tester
        CO2Footprint tester = new CO2Footprint();
        tester.printHead();
        
        //create fuel arraylist
        ArrayList<AnnualFuelUse> fuel = new ArrayList<AnnualFuelUse>();
        
        for(int i = 0; i < 5; i++)
        fuel.add(i, new AnnualFuelUse(sMiles, eMiles, galUsed, pricePerGallon, "89 BMW", days));
        
        //create waste array list
        ArrayList<CO2FromWaste> CO2Waste= new ArrayList<CO2FromWaste>();
        
        //initialize each household and set values
        CO2Waste.add(0, new CO2FromWaste(3, true, false, true, false));
        CO2Waste.add(1, new CO2FromWaste(3, false, false, true, true));
        CO2Waste.add(2, new CO2FromWaste(4, true, false, true, true));
        CO2Waste.add(3, new CO2FromWaste(7, true, false, false, false));
        CO2Waste.add(4, new CO2FromWaste(6, true, false, true, false));
        
        //create electricity array list
        ArrayList<co2FromElectricity> bulbs = new ArrayList<co2FromElectricity>();
        
        for(int i = 0; i < 5; i++)
        bulbs.add(i, new co2FromElectricity(monthlyPayments.length, (int)(Math.random() * ((15 - 1) + 1)) + 1));

        //print all data reports
        for(int i = 0; i < 5; i++)
        {
            tester.calcAnnualWasteReport(fuel.get(i), CO2Waste.get(i), bulbs.get(i), monthlyPayments, kWh);      
        }
        
    }
}
