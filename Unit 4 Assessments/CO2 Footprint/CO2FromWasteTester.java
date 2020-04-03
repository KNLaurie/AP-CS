
/**
 * Test CO2FromWaste and put data for multiple households in one array list
 *
 * @author K. Laurie
 * @version 1/25/2020
 */

import java.util.ArrayList;
public class CO2FromWasteTester
{
    public void main()
    {
        ArrayList<CO2FromWaste> CO2Waste= new ArrayList<CO2FromWaste>(6);
        
        //initialize each household and set values
        CO2Waste.add(0, new CO2FromWaste(3, true, false, true, false));
        CO2Waste.add(1, new CO2FromWaste(3, false, false, true, true));
        CO2Waste.add(2, new CO2FromWaste(4, true, false, true, true));
        CO2Waste.add(3, new CO2FromWaste(7, true, false, false, false));
        CO2Waste.add(4, new CO2FromWaste(6, true, false, true, false));
        CO2Waste.add(5, new CO2FromWaste(2, true, true, true, true));
        
        //calculate waste values for each household
        for(int i = 0; i < CO2Waste.size(); i++)
        {
            CO2Waste.get(i).calcGrossWaste();
            CO2Waste.get(i).calcWasteReduction();
            CO2Waste.get(i).calcNetWaste();
        }
        
        //print results
        
        System.out.printf("%55s%51s\n", "Household Waste Recycled", "Pounds of CO2");
        System.out.printf("%7s  |%10s  |%9s  |%9s  |%9s  |%7s  |%18s  |%11s  | %17s  |\n", "Index", "People", "Paper", "Plastic", "Glass", "Cans", "Gross Emmission", "Reduction", "Net Emmission");
        
        for(int i = 0; i < CO2Waste.size(); i++)
        {
         System.out.printf("|%4s  %10s  %12s  %10s  %10s  %10s  %13.2f  %15.2f  %18.2f     |\n", i, CO2Waste.get(i).numPeople, CO2Waste.get(i).paper, CO2Waste.get(i).plastic, CO2Waste.get(i).glass, CO2Waste.get(i).cans, CO2Waste.get(i).grossWaste, CO2Waste.get(i).wasteReduction, CO2Waste.get(i).netWaste);     
        }
    }
}
