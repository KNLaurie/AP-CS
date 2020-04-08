
/**
 * Class Representing Any Kind of Footwear
 *
 * @author K. Laurie
 * @version 3/18/2020
 */
public class Footwear
{
    // instance variables - replace the example below with your own
    private String myStyle, mySKU;
    private double mySize;
    
    /**
     * Constructor for objects of class Footwear
     */
    public Footwear(String style, String  SKU, double size)
    {
        // initialise instance variables
        myStyle = style;
        mySKU = SKU;
        mySize = size;
    }

    /**
     * Accessor method for footwear style
     *
     * @return style of footwear
     */
    public String getStyle()
    {
     return myStyle;   
    }
    
    /**
     * Accessor method for SKU
     *
     * @return SKU number  
     */
    public String getSKU()
    {
     return mySKU;   
    }
    
    /**
     * Accessor method for footwear size
     *
     * @return   size of footwear
     */
    public double getSize()
    {
     return mySize;   
    }
    
    /**
     * accessor method for type of footwear
     * 
     * @return unspecified if base class
     */
    public String getType()
    {
        return "unspecified";
    }
    
    /**
     * print shoe size in user friendly way
     * 
     * @return size of shoe with 1/2 instead of .5
     */
    public String printSize()
    {
        if(mySize % 1 !=0)
        return (int)mySize + "\u00bd";
        
        else
        return Double.toString(mySize);
    }
    
    /**
     * get item information
     * 
     * @return get type and size at once
     */
    public String toString()
    {
        return getType() + "(size " + printSize() + ")";
    }
}
