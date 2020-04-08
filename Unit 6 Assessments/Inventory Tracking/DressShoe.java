
/**
 * Define dress shoes
 *
 * @author K. Laurie
 * @version 3/18/2020
 */
public class DressShoe extends Shoe
{


    /**
     * Constructor for objects of class DressShoes
     */
    public DressShoe(String style, String SKU, double size)
    {
        super(style, SKU, size);
    }

    /**
     * An example of a method - get dress shoe type
     *
     * @return    dress shoe type as string
     */
    public String getType()
    {
        return "Dress Shoe";
    }
}
