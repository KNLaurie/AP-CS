
/**
 *Test Tool, Product, and Product's subclasses
 *
 * @author K. Laurie
 * @version 4/8/2020
 */
import java.util.List;
import java.util.ArrayList;
public class InventoryDemo
{
    public static void main(String[] args)
    {
        List<Product> p = new ArrayList<Product>();
        
        p.add(new Car("Jaguar", 1000000.00));
        p.add(new Car("Neon", 17000.00));
        p.add(new Tool("JigSaw", 149.18));
        p.add(new Car("Jaguar", 110000.00));
        p.add(new Car("Neon", 17500.00));
        p.add(new Car("Neon", 17875.32));
        p.add(new Truck("RAM", 35700.00));
        p.add(new Tool("Circular Saw", 200.00));
        p.add(new Tool("Circular Saw", 150.00));
        
        takeInventory(p, "Jaguar");
        takeInventory(p, "Neon");
        takeInventory(p, "JigSaw");
        takeInventory(p, "RAM");
        takeInventory(p, "Circular Saw");
        
        Tool saw1 = new Tool("saw", 100.00);
        Tool saw2 = new Tool("saw", 200.00);
        
        int compare = saw1.compareTo(saw2);
        
        System.out.println("Cost of Saw 1 = " + saw1.getCost() + " \nCost of Saw 2 = " + saw2.getCost());
        
        if(compare == -1)
        System.out.println("The second saw is more expensive");
        
        else if(compare == 1)
        System.out.println("The first saw is more expensive");
        
        else
        System.out.println("The saws cost the same amount");
        
        
    }
    
    /**
     * print item name, quantity, and total cost
     * 
     * @parameter l list to iterate through
     * @parameter   name   name of pruduct to take invenotry of
     */
    public static void takeInventory(List<Product> l, String name)
    {
        int quantity = 0;
        double cost = 0.0;
        
        for(int i=0; i<l.size(); i++)
        {
            if(l.get(i).getName() == name)
            {
                quantity += 1;
                cost += l.get(i).getCost();
            }
        }
        
        System.out.printf("%s: Quantity = %s, Total Cost = %f \n", name, quantity, cost);
    }
}
