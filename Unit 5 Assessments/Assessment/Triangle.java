
/**
 * Create a triangle
 *
 * @author K. Laurie
 * @version 3/13/2020
 */
public class Triangle
{
    // instance variables - replace the example below with your own
    private double sideA, sideB, sideC;

    /**
     * Constructor for objects of class Triangle
     */
    public Triangle(double a, double b, double c)
    {
        // initialise instance variables
        sideA = a;
        sideB = b;
        sideC = c;
    }

    /**
     * get sideA
     * 
     * @return    side A
     */
    public double getSideA()
    {
        return sideA;
    }
    
    /**
     * get side B
     * 
     * @return    side B
     */
    public double getSideB()
    {
        return sideB;
    }
    
    /**
     * get sideC
     * 
     * @return    side C
     */
    public double getSideC()
    {
        return sideC;
    }
}
