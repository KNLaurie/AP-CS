
/**
 * One bin in the warehouse
 *
 * @author K. Laurie
 * @version 3/18/2020
 */
import java.util.ArrayList;
public class Bin
{
    // instance variables - replace the example below with your own
    private String myName;
    private ArrayList<BinItem> myContents;

    /**
     * Constructor for objects of class Bin
     */
    public Bin(String name)
    {
        myName = name;
        myContents = new ArrayList<BinItem>();
    }
    
    /**
     * Accessor method - name of bin
     * 
     * return name of bin
     */
    public String getName()
    {
        return "Bin " + myName;
    }
    
    /**
     * Accessor method - arraylist of contents
     * 
     * return contents of bin
     */
    public ArrayList getContents()
    {
        return myContents;
    }
    
    /**
     * Add contents to bin
     *
     * @param  item - type of shoe with sku and quantity
     */
    public void addItems(BinItem item)
    {
        if(myContents != null)
            for(BinItem i : myContents)
            {
                if(i.getSKU() == item.getSKU())
                {
                item = new BinItem(item.getSKU(), i.getQuantity() + item.getQuantity());  
                myContents.remove(i);
                }
            }   
        myContents.add(item);
    }
    
    /**
     * get Bin information
     * 
     * return bin information in human friendly way
     */
    public String toString()
    {
        String info = getName() + "\n";
        
        if(myContents != null)
            for(int i=0; i<myContents.size(); i++)
            info += myContents.get(i) + "\n";
        
        return info;
    }
    
    /**
     * Remove items from bin in warehouse
     *
     * @param  i non-negative integer less than number of bin items in bin
     */
    public void remove(int i)
    {
        myContents.remove(i);
    }
    
    /**
     * get total quatities of all bin items
     * 
     * return   sum total quantities of all bin items
     */
    public int totalQuantity()
    {
        int sum = 0;
        
        if(myContents != null)
            for(int i=0; i<myContents.size(); i++)
            sum += myContents.get(i).getQuantity();
        
        return sum;
    }
}
