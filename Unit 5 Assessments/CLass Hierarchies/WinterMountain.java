
/**
 * create a winter mountain terrain
 *
 * @author K. Laurie
 * @version 3/13/2020
 */
public class WinterMountain extends Mountain
{
    // instance variables - replace the example below with your own
    private double temp;

    /**
     * Constructor for objects of class WinterMountain
     */
    public WinterMountain(int l, int w, int m, double t)
    {
        //call super
        super(l, w, m);
        // initialise instance variables
        temp = t;
    }

    /**
     * get temperature
     *
     * @return    temperature
     */
    public String getTemp()
    {
        return "has temperature " + temp;
    }
}
