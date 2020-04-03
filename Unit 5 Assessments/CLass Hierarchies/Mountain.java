
/**
 * Create a mountain terrain
 *
 * @author K. Laurie
 * @version 3/13/2020
 */
public class Mountain extends Terrain
{
    // instance variables - replace the example below with your own
    private int numMountains;

    /**
     * Constructor for objects of class Mountain
     */
    public Mountain(int l, int w, int m)
    {
        super(l, w);
        // initialise instance variables
        numMountains = m;
    }
    
    /**
     * get the number of mountains
     * 
     * @return number of mountains
     */
    public String getMountains()
    {
        return "has " + numMountains + " mountains";
    }
}
