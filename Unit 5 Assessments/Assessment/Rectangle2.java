
/**
 * create a rectangle
 * 
 * @author K. Laurie
 * @version 3/18/2020
 */
public class Rectangle2
{
	// instance variables 
	private int length;
	private int width;

	/**
	 * Constructor for objects of class rectangle
	 */
	public Rectangle2(int l, int w)
	{
		// initialise instance variables
		length = l;
		width = w;
	}

	// return the height
	public int getLength()
	{
		return length;
	}
	public int getWidth()
	{
	    return width;
	}
	
	public String toString()
	{
	    return "This rectangle is " + length + " X " + width;
	   }
	public String equals(Rectangle2 x)
	{
	if(getLength()!=x.getLength() || getWidth() != x.getWidth())   
	return toString() + " which is not the same size as " + x.toString();

	else
	return toString() + " which is the same size as " + x.toString();
	}
}