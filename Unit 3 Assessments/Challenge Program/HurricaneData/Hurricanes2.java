/**
 * a program to calculate the average category, pressure, and
 * wind speed of all Atlantic Hurricanes which have occurred from 1980 -
 * 2006. Also tally the number of storms in each category.
 * 
 * @author K. Laurie
 * @version 12/4/2019
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class Hurricanes2
{
 public static void main(String[] args) throws IOException
 {
     Scanner in = new Scanner(System.in);
     
     String [] hurricanes = new String[59];
     String [] months = new String[59];
     int [] pressure = new int[59];
     int [] year = new int[59];
     int [] speed = new int[59];
     
     int maxSpeed = Integer.MIN_VALUE;
     int maxPressure = Integer.MIN_VALUE;
     int minSpeed = Integer.MAX_VALUE;
     int minPressure = Integer.MAX_VALUE;
     double avgSpeed = 0;
     double avgPressure = 0;
     
     File fileName = new File("hurcdata2.txt");
     Scanner inFile = new Scanner(fileName);

     for(int i=0; i<59; i++)
     {
         year[i] = inFile.nextInt();
         months[i] = inFile.next();
         pressure[i] = inFile.nextInt();
         speed[i] = inFile.nextInt();
         hurricanes[i] = inFile.next();

     }
     inFile.close();
     
 
     
     for(int i=0; i<59; i++)
     {
         if(maxSpeed < speed[i])
         maxSpeed = speed[i];
         
         if(maxPressure < pressure[i])
         maxPressure = pressure[i];
         
         if(minPressure > pressure[i])
         minPressure = pressure[i];
         
         if(minSpeed > speed[i])
         minSpeed = speed[i];
         
         avgSpeed += speed[i];
         avgPressure += pressure[i];
         
        }
        
        avgSpeed /= 59;
        avgPressure /= 59;
        
        PrintWriter outFile = new PrintWriter(new File("Summary.txt"));
        
        outFile.println("\t\tHurricanes 1980 - 2006");
        outFile.printf("%s %20s %15s %15s\n", "Date", "Pressure (mb)", "Wind Speed (knots)", "Hurricane");
        
        for(int i=0; i<59; i++)
        {
            outFile.printf("%d %3s%14d%14d%22s\n", year[i], months[i], pressure[i], speed[i], hurricanes[i]);
        }
        
        outFile.printf("Average%15f%15f\n", avgPressure, avgSpeed);
        outFile.printf("Minimum%15d%15d\n", minPressure, minSpeed);
        outFile.printf("Maximum%15d%15d\n", maxPressure, maxSpeed);
        
        
        outFile.close();
        
       



 }
} 