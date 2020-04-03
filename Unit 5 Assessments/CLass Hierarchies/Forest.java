
/**
 * Create a forest terrain
 *
 * @author K. Laurie
 * @version 3/13/2020
 */
public class Forest extends Terrain
{
    // instance variables - replace the example below with your own
    private int numTrees;

    /**
     * Constructor for objects of class Forest
     */
    public Forest(int l, int w, int t)
    {
        //call super
        super(l, w);
        // initialise instance variables
        numTrees = t;
    }

    /**
     * Get the number of trees in forest
     *
     * @return    number of trees
     */
    public String getTrees()
    {
        return "has " + numTrees + " trees";
    }
}
