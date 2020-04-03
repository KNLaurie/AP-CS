/**
 * Create a box
 * 
 * @author K. Laurie
 * @version 3/18/2020
 */
public class Box2 extends Rectangle2
{
	// instance variables 
	private int height;

	/**
	 * Constructor for objects of class box
	 */
	public Box2(int l, int w, int h)
	{
		// call superclass
		super(l, w);
	    // initialise instance variables
		height = h;
	}

	// return the height
	public int getHeight()
	{
		return height;
	}
	
	public String toString()
	{
	    return "The box's dimensions " + getLength() + " X " + getWidth() + " X " + height;
	}
	
	public String equals(Box2 x)
	{
	if(getHeight()!=x.getHeight() || getLength()!=x.getLength() || getWidth() != x.getWidth())   
	return toString() + " which is not the same size as " + x.toString();

	else
	return toString() + " which is the same size as " + x.toString();
	}
}