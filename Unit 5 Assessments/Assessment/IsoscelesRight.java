
/**
 *create and isosceles triangle
 *
 * @author K. Laurie
 * @version 3/13/2020
 */
public class IsoscelesRight extends Triangle
{
    // instance variables - replace the example below with your own
    private double sides;

    /**
     * Constructor for objects of class IsoscelesRight
     */
    public IsoscelesRight(double sides)
    {
        super(sides, sides, Math.sqrt((Math.pow(sides, 2) + Math.pow(sides, 2))));
        
    }

}
