
/**
 *Calculate entire annual CO2 footprint
 *
 * @author K. Laurie
 * @version 1/27/2020
 */
public class CO2Footprint
{
    /**
     * print waste and waste reductions from all classes
     * 
     * @param car object from AnnualFuelUse class
     * 
     */
    public void calcAnnualWasteReport(AnnualFuelUse car, CO2FromWaste waste, co2FromElectricity bulb, double[] monthlyPayments, int[] kWh )
    {
        //get annual gallons report
        double annualFuel = car.calcProjGalUsed();
        
        CO2FootprintV1 carWaste = new CO2FootprintV1(annualFuel);
        
        carWaste.calcTons();
        carWaste.convertTonstoPounds();
        
        //get annual waste report
        waste.calcGrossWaste();
        waste.calcWasteReduction();
        waste.calcNetWaste();
        
        //get annual electricity report
                //set values
        bulb.addKillowatts(kWh);
        bulb.addPayments(monthlyPayments);
        
        //calculate averages
        bulb.calcAvgKillowatts();
        double avgPayment = bulb.calcAvgPayment();
        double avgKWPrice = bulb.calcPricePerKW();
        
        //calculate co2 emmissions
        bulb.calcEmmissions();
        bulb.calcReduction();

        //calculate total footprint
        double footprint = carWaste.poundsCO2 + waste.netWaste + bulb.netEmmission;
        
        //print data report
        System.out.printf("%10.2f%18.2f%14.2f%23.2f%21.2f%30.2f\n", carWaste.poundsCO2, bulb.grossEmmission, waste.grossWaste, waste.wasteReduction, bulb.reduction, footprint); 
     
    }
    
    /**
     * print data heading (no parameters)
     */
    public void printHead()
    {
        System.out.printf("%29s%49s\n", "Pounds of CO2", "Pounds of CO2");
        System.out.printf("%29s%49s\n\n", "Emmited from", "Reduced from");
        System.out.printf("%8s%21s%12s%26s%20s%30s\n", "Gas", "Electricity", "Waste", "Recycling", "New Bulbs", "CO2 FootPrint");
    }
}
