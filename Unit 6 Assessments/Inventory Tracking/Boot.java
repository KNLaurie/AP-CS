
/**
 * Define boot footwear
 *
 * @author K. Laurie
 * @version 3/18/2020
 */
public class Boot extends Footwear
{

    /**
     * Constructor for objects of class Boots
     */
    public Boot(String style, String SKU, double size)
    {
        super(style, SKU, size);
    }

    /**
     * An example of a method - get boot type
     *
     * @return    boot type as string
     */
    public String getType()
    {
        return "Boot";
    }
}
