
/**
 * Vehicle object
 *
 * @author K. Laurie
 * @version 4/8/2020
 */
public abstract class Vehicle implements Product
{
    private String name;
    private double cost;
    
    public Vehicle(String name, double cost)
    {
        this.name = name;
        this.cost = cost;
    }
    
    /**
     * @return name of vehicle
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @return cost of vehicle
     */
    public double getCost()
    {
        return cost;
    }
    
}
