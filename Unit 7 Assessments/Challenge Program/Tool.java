
/**
 * Write a description of class Tool here.
 *
 * @author K. Laurie
 * @version 4/8/2020
 */
public class Tool implements Product, Comparable<Tool>
{
    private String name;
    private double cost;
    
    public Tool(String name, double cost)
    {
        this.name = name;
        this.cost = cost;
    }
    
    /**
     * @return name of tool
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @return cost of tool
     */
    public double getCost()
    {
        return cost;
    }
    
    /**
     * compare cost of tools
     * 
     * @return -1 if if object is more, 0 if equal, and 1 if objecy is less
     */
    public int compareTo(Tool obj)
    {
       if(cost < obj.cost)
       return -1;
       
       else if(cost > obj.cost)
       return 1;
       
       else
       return 0;
    }
}
