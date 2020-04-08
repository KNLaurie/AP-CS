
/**
 * Collection of items in bin
 *
 * @author K. Laurie
 * @version 3/18/2020
 */
public class BinItem
{
    // instance variables - replace the example below with your own
    private String mySKU;
    private int myQuantity;

    /**
     * Constructor for objects of class BinItem
     */
    public BinItem(String SKU, int quantity)
    {
        mySKU = SKU;
        myQuantity = quantity;
    }

    /**
     * An accessor method - get SKU number
     *
     * @return    SKU Number
     */
    public String getSKU()
    {
        return mySKU;
    }
    
    /**
     * An accessor method - get quantity
     *
     * @return    quantity
     */
    public int getQuantity()
    {
        return myQuantity;
    }
    
    /**
     * get bin information in human friendly way
     * 
     * @return sku number and quantity together
     */
    public String toString()
    {
        return "SKU " + mySKU + ": " + myQuantity;
    }
}
