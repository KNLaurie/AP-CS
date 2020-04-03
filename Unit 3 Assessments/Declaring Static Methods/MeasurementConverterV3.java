
/**
 * Write a description of class MeasurementConverterV2_Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MeasurementConverterV3

{
    //default constructor
    MeasurementConverterV3()
    {
    }
    //Purpose of program
    public static void printPurpose( )  //notice that this method is void, nothing is returned
    {
        System.out.println("This program converts to and from");
        System.out.println("English and metric units of measure.");
        System.out.println("=====================================");
    }
        
    //convert feet to miles
    //the ft parameter receives the value of the feet argument passed from main method. 
    public double FeetToMiles(double ft)
    {
        return ft / 5280;      
    } 
    
    //convert miles to feet
    public double MilesToFeet(double mi)
    {
        return mi * 5280;      
    } 
    
    //convert miles to kilometers
    public double MilesToKilometers(double mi)
    {
        return mi * 1.609;   
    } 
    
    //convert kilometers to miles
    public double KilometersToMiles(double km)
    {
        return km / 1.609;   
    } 
    
    //convert pounds to kilograms
    //method header to convert pounds to kilograms goes here
    public double PoundsToKilograms(double lbs)
    {
        return lbs * 0.454;  
    } 
    
    //convert kilograms to pounds
    public double KilogramsToPounds(double km)
    {
        return km * 2.205;
    } 
    
        public double LitersToGallons(double l)
    {
        return l / 3.785;
    } 
    
        public double GallonsToLiters(double gal)
    {
        return gal * 3.785;
    } 
    
    
        
    public void main(String[] args)
    {
        
        MeasurementConverterV3 convert = new MeasurementConverterV3();
        printPurpose();                                    //invoke the printPurpose() method
        double feet = 6230;
        double miles = convert.FeetToMiles(feet);            //invoke the convertFeetToMiles() static method and pass the feet variable as an argument
        System.out.printf("%8.1f ft. = %7.1f mi. %n", feet, miles);
        
        miles = 1.9;
        feet = convert.MilesToFeet(miles);
        System.out.printf("%8.1f mi. = %7.1f ft. %n", miles, feet);
        
        miles = 22.3;
        double kilometers = convert.MilesToKilometers(miles);
        System.out.printf("%8.1f mi. = %7.1f km. %n", miles, kilometers);
        
        kilometers = 1000.0;
        miles = convert.KilometersToMiles(kilometers);
        System.out.printf("%8.1f km. = %7.1f mi. %n", kilometers, miles);
        
        double pounds = 204;
        double kilograms = convert.PoundsToKilograms(pounds);
        System.out.printf("%8.1f kg. = %7.1f lbs. %n", kilograms, pounds);

       
        kilograms = 100;
        pounds = convert.KilogramsToPounds(kilograms);
        System.out.printf("%8.1f lbs. = %7.1f kg. %n", pounds, kilograms);
        
        double gallons = 3;
        double liters = convert.GallonsToLiters(gallons);
        System.out.printf("%8.1f gal. = %7.1f l. %n", gallons, liters);
        
        liters = 100;
        gallons = convert.LitersToGallons(liters);
        System.out.printf("%8.1f l. = %7.1f gal. %n", liters, gallons);
           
    }//end of main method
    
}//end of class

