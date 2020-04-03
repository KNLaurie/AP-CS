
/**
 *  Modify the CarV5 class to instantiate multiple objects. 
 *
 * @author Kaitlyn L.
 * @version 12/27/2019
 */
public class CarsV7Tester
{
    //private variables
    private String carType;
    private int[] eMiles, sMiles = new int[3];
    private double[] galUsed, pricePerGallon = new double[3];
    
    //default constructor
    CarsV7Tester(int[] sMiles, int[]eMiles, double[] galUsed, double[] pricePerGallon)
    {
        sMiles = sMiles.clone();
        eMiles = eMiles.clone();
        
        galUsed = galUsed.clone();
        pricePerGallon = pricePerGallon.clone();
        
        String type = carType;
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
        //Car 1
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
        
        //car 2
        int[] sMiles2 = {12168, 12452, 12710};
        int[] eMiles2 = {12452, 12710, 12998};
        int[] dist2 = new int[sMiles2.length];
        
        double[] galUsed2 = {10.14, 9.21, 10.29};
        double[] pricePerGallon2 = {2.98, 2.76, 2.92};
        
        double[] MPG2 = new double[sMiles2.length];
        double[] GPM2 = new double[sMiles2.length];
        double[] totalCost2 = new double[sMiles2.length];
        
        String carType2 = "20 Volkswagen";
        
        CarsV7Tester car2 = new CarsV7Tester(sMiles2, eMiles2, galUsed2, pricePerGallon2);
        
        //car 3
        int[] sMiles3 = {12168, 12452, 12710};
        int[] eMiles3 = {12452, 12710, 12998};
        int[] dist3 = new int[sMiles2.length];
        
        double[] galUsed3 = {15.78, 14.33, 16};
        double[] pricePerGallon3 = {2.98, 2.76, 2.92};
        
        double[] MPG3 = new double[sMiles2.length];
        double[] GPM3 = new double[sMiles2.length];
        double[] totalCost3 = new double[sMiles2.length];
        
        String carType3 = "89 BMW";
        
        CarsV7Tester car3 = new CarsV7Tester(sMiles3, eMiles3, galUsed3, pricePerGallon3);
        
        //print headings
        System.out.println("\t\t\t\t\tGas Mileage Calculations");
        System.out.printf("\n\t%17s%15s%15s%15s%15s%15s%15s%15s\n", "Type of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Miles/Gal", "Gallons/Mile", "Total Cost");
        
        //car 1 data
        for(int i = 0; i < sMiles3.length; i++)
        {
            dist1[i] = car1.calcDistance(sMiles1[i], eMiles1[i]);
            MPG1[i] = car1.calcMPG(dist1[i], galUsed1[i]);
            GPM1[i] = car1.calcGPM(dist1[i], galUsed1[i]);
            totalCost1[i] = car1.totalCost(galUsed1[i], pricePerGallon1[i]);
            
            //print info
            System.out.printf("%10s%15s%15s%15s%15s%15.1f%15.1f%15.3f%15.2f\n","Trip " + (i + 1) + ":", carType1, sMiles1[i], eMiles1[i], dist1[i], galUsed1[i], MPG1[i], GPM1[i], totalCost1[i]);
        }
        
        //car 2 data
        for(int i = 0; i < sMiles3.length; i++)
        {
            dist2[i] = car2.calcDistance(sMiles2[i], eMiles2[i]);
            MPG2[i] = car2.calcMPG(dist2[i], galUsed2[i]);
            GPM2[i] = car2.calcGPM(dist2[i], galUsed2[i]);
            totalCost2[i] = car2.totalCost(galUsed2[i], pricePerGallon2[i]);
            
            //print info
            System.out.printf("%10s%15s%15s%15s%15s%15.1f%15.1f%15.3f%15.2f\n","Trip " + (i + 1) + ":", carType2, sMiles2[i], eMiles2[i], dist2[i], galUsed2[i], MPG2[i], GPM2[i], totalCost2[i]);
        }
        
        //car 3 data
        for(int i = 0; i < sMiles3.length; i++)
        {
            dist3[i] = car3.calcDistance(sMiles3[i], eMiles3[i]);
            MPG3[i] = car3.calcMPG(dist3[i], galUsed3[i]);
            GPM3[i] = car3.calcGPM(dist3[i], galUsed3[i]);
            totalCost3[i] = car3.totalCost(galUsed3[i], pricePerGallon3[i]);
            
            //print info
            System.out.printf("%10s%15s%15s%15s%15s%15.1f%15.1f%15.3f%15.2f\n","Trip " + (i + 1) + ":", carType3, sMiles3[i], eMiles3[i], dist3[i], galUsed3[i], MPG3[i], GPM3[i], totalCost3[i]);
        }
    }
}
