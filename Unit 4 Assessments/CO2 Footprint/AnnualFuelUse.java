
/**
 * Write a program to project your annual fuel usage based on at least three
  fill ups of your car (or your family car). 
 *
 * @author Kaitlyn L.
 * @version 12/28/2019
 */
public class AnnualFuelUse
{
    //private variables
    private String carType;
    
    int[]eMiles, sMiles, days = new int[3];
    double[] galUsed, pricePerGallon = new double[3];
        
    int minDist = Integer.MAX_VALUE;
    int maxDist = Integer.MAX_VALUE;
        
    double minMPG = Double.MAX_VALUE;
    double maxMPG = Double.MIN_VALUE;
    double minPrice = Double.MAX_VALUE;
    double maxPrice = Double.MIN_VALUE;
    
    int[] distance = {0, 0, 0};
    double[] GPM = {0.0, 0.0, 0.0};
    double[] MPG = {0.0, 0.0, 0.0};
    double[] totalCost = {0.0, 0.0, 0.0};
    
    //default constructor
    AnnualFuelUse(int[] sMiless, int[]eMiless, double[] galsUsed, double[] pricePerGallons, String carTypes, int[] dayss)
    {
        sMiles = sMiless.clone();
        eMiles = eMiless.clone();
        days = dayss.clone();
        galUsed = galsUsed.clone();
        pricePerGallon = pricePerGallons.clone();
        
        String type = carTypes;

    }
    
    //calculate miles per gallon
    public void calcMPG(int i)
    {
       MPG[i] = distance[i] / galUsed[i]; 
    }
    
    //calculate distance
    public void calcDistance(int i)
    {
        distance[i] = eMiles[i] - sMiles[i];
    }
    
    //calculate GPM
    public void calcGPM(int i)
    {
        GPM[i] = galUsed[i] / distance[i];
    }
    
    //calculate costs
    public void calcCost(int i)
    {
        totalCost[i] = galUsed[i] * pricePerGallon[i];
    }
    
    //test max and min distance values
    public void distValueTest(int i)
    {
        if(distance[i] < minDist)
        minDist = distance[i];
        
        if(distance[i] > maxDist)
        maxDist = distance[i];
    }
    
    //test max and min mpg values
    public void mpgValueTest(int i)
    {
        if(MPG[i] < minMPG)
        minMPG = MPG[i];
        
        if(MPG[i] > maxMPG)
        maxMPG = MPG[i];
    }
    
    //test max and min prices
    public void priceValueTest(int i)
    {
        if(pricePerGallon[i] < minPrice)
        minPrice = pricePerGallon[i];
        
        if(pricePerGallon[i] > maxPrice)
        maxPrice = pricePerGallon[i];
    }
    
    //calculate and update all values 
    public void assignValues(int i) 
    {
        calcDistance(i);
        calcMPG(i);
        calcGPM(i);
        calcCost(i);
        
        distValueTest(i);
        mpgValueTest(i);
        priceValueTest(i);
    }
    
    
    public double calcProjGalUsed()
    {
        double totalGalUsed = galUsed[0] + galUsed[1] + galUsed[2];
        return (totalGalUsed / galUsed.length) * 364 + totalGalUsed;
    }
    
    public void printData()
    {
        System.out.println("\t\t\t\t\tGas Mileage Calculations");
        System.out.printf("\n\t%12s%17s%17s%17s%17s%17s%17s%17s%17s\n", "Days", "Type of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Miles/Gal", "Gallons/Mile", "Total Cost");
        
        for(int i = 0; i < 3; i++)
        {
           System.out.printf("%10s%15s%15s%15s%15s%15.1f%15.1f%15.3f%15.2f\n","Trip " + i, days[i], sMiles[i], eMiles[i], distance[i], galUsed[i], MPG[i], GPM[i], pricePerGallon[i], totalCost[i]);  
        
        }
        
        System.out.printf("Minimum:%90s%30.2f%15.2f\n", minDist, minPrice, minMPG);
        System.out.printf("Maximum:%90s%30.2f%15.2f\n", maxDist, maxPrice, maxMPG);
        
        int totalDays = days[0] + days[1] + days[2];
        int totalDist = distance[0] + distance[1] + distance[2];
        double totalGalUsed = galUsed[0] + galUsed[1] + galUsed[2];
        double totalCost2 = totalCost[0] + totalCost[1] + totalCost[2];
        
        double distProj = (totalDist / totalDays) * 364 + totalDist;
        double galUsedProj = (totalGalUsed / totalDays) * 364 + totalGalUsed;
        double galCostProj = (totalCost2 / totalDays) * 364 + totalCost2;
        
        System.out.printf("Totals:%62s%15.2f%45.2f\n", totalDist, totalGalUsed, totalCost2); 
        System.out.printf("Annuals:%62s%15.2f%45.2f", distProj, galUsedProj, galCostProj);
    }
}   
