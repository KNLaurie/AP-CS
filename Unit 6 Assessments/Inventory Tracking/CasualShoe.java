
/**
 * Define Casual shoe
 *
 * @author K. Laurie
 * @version 3/18/2020
 */
public class CasualShoe extends Shoe
{


    /**
     * Constructor for objects of class CasualShoe
     */
    public CasualShoe(String style, String SKU, double size)
    {
        super(style, SKU, size);
    }

    /**
     * An example of a method - get casual shoe type
     *
     * @return    casual shoe type as string
     */
    public String getType()
    {
        return "Casual Shoe";
    }
}
