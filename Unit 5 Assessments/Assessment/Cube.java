
/**
 * Create a cube
 *
 * @author K. Laurie
 * @version 3/13/2020
 */
public class Cube extends Box2
{
    /**
     * Constructor for objects of class Cube
     */
    public Cube(int length)
    {
        super(length, length, length);
        
    }
    
    public String toString()
    {
	    return "The cubes dimensions are " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}
