
/**
 * Define shoe
 *
 * @author K. Laurie
 * @version 3/18/2020
 */
public class Shoe extends Footwear
{


    /**
     * Constructor for objects of class Shoe
     */
    public Shoe(String style, String SKU, double size)
    {
        super(style, SKU, size);
    }

    /**
     * An example of a method - get shoe type
     *
     * @return    shoe type as string
     */
    public String getType()
    {
        return "Shoe";
    }
}
