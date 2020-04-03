
/**
 *  Modify the CarV5 class to instantiate multiple objects. 
 *
 * @author Kaitlyn L.
 * @version 12/27/2019
 */
public class CarsV7
{
    //private variables
    private String carType;
    private int[] eMiles, sMiles = new int[3];
    private double[] galUsed, pricePerGallon = new double[3];
    
    //default constructor
    CarsV7(int[] sMiles, int[]eMiles, double[] galUsed, double[] pricePerGallon)
    {
        sMiles = sMiles.clone();
        eMiles = eMiles.clone();
        
        galUsed = galUsed.clone();
        pricePerGallon = pricePerGallon.clone();
        
    }
    
    //calculate miles per gallon
    public double calcMPG(double miles, double gallons)
    {
       return miles / gallons; 
    }
    
    public int calcDistance(int sMiles, int eMiles)
    {
        return eMiles - sMiles;
    }
    
    public double calcGPM(double miles, double gallons)
    {
        return gallons / miles;
    }
    
    public double totalCost(double galUsed, double pricePerGallon)
    {
        return galUsed * pricePerGallon;
    }
    
    public static void main(String[] args)
    {
        int[] sMiles1 = {12168, 12452, 12710};
        int[] eMiles1 = {12452, 12710, 12998};
        int[] dist1 = new int[sMiles1.length];
        
        double[] galUsed1 = {11.4, 10.8, 11.3};
        double[] pricePerGallon1 = {2.98, 2.76, 2.92};
        
        double[] MPG1 = new double[sMiles1.length];
        double[] GPM1 = new double[sMiles1.length];
        double[] totalCost1 = new double[sMiles1.length];
        
        String carType1 = "17 Mazda";
        
        CarsV7 car1 = new CarsV7(sMiles1, eMiles1, galUsed1, pricePerGallon1);
        
        //print headings
        System.out.println("\t\t\t\t\tGas Mileage Calculations");
        System.out.printf("\n%15s%15s%15s%15s%15s%15s\n", "Type of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Miles/Gal");
        for(int i = 0; i < sMiles1.length; i++)
        {
            dist1[i] = car1.calcDistance(sMiles1[i], eMiles1[i]);
            MPG1[i] = car1.calcMPG(dist1[i], galUsed1[i]);
            GPM1[i] = car1.calcGPM(dist1[i], galUsed1[i]);
            totalCost1[i] = car1.totalCost(galUsed1[i], pricePerGallon1[i]);
            
            //print info
            System.out.printf("%15s%15s%15s%15s%15.1f%15.1f%15.1f%15.2f\n", carType1, sMiles1[i], eMiles1[i], dist1[i], galUsed1[i], MPG1[i], GPM1[i], totalCost1[i]);
        }
        
        
    }
}
