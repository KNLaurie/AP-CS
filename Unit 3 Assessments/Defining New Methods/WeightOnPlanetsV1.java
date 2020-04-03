
/**
 * a program that calculates your weight on each planet in the solar
 * system. 
 *
 * @author K. Laurie
 * @version 12/16/2019
 */

public class WeightOnPlanetsV1
{
    public static void main(String[] args)
    {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        double[] masses = {(3.285 * Math.pow(10, 23)), (4.867 * Math.pow(10, 24)), (5.972 * Math.pow(10, 24)),(6.39 *Math.pow(10, 23)),(1.898 * Math.pow(10, 27)), (5.683 * Math.pow(10, 26)), (8.681 * Math.pow(10, 25)), (1.024 * Math.pow(10, 26))}; 
        double[] diameters = {3031.9, 7520.8, 7919.5, 4212.3,86881, 72367, 31518, 30599};
        double[] surfaceGravities = new double[8];
        double[] weights = new double[8];
        double radius;

        double G = 6.67408 * Math.pow(10, -11);
        
        int earthWeight = 46720;    //in grams
        
        for(int i = 0; i < 8; i++)
        {
            radius = (diameters[i] * 1609) / 2; //convert to meters and half
            surfaceGravities[i] = (G * masses[i])/ Math.pow(radius, 2);

            weights[i] = (earthWeight * surfaceGravities[i]) / 454;
            
        }
        
        System.out.println("\t\t\tMy Weight on the Planets\n");
        System.out.printf("%20s%20s%20s\n", "Planet", "Gravity", "Weight (lbs.)\n");
        
        for(int i=0; i<8; i++)
        {
            System.out.printf("%20s%20.2f%20.2f\n", planets[i], surfaceGravities[i], weights[i]);
      
        }
    }
}
