
/**
 * warehouse activity
 *
 * @author K. Laurie
 * @version 3/18/2020
 */
import java.util.ArrayList;
public class Warehouse
{
    // instance variables - replace the example below with your own
    private int myBinMax;
    private ArrayList<Footwear> myCatalog;
    private ArrayList<Bin> myBins;

    /**
     * Constructor for objects of class Warehouse
     */
    public Warehouse(int binMax)
    {
        // initialise instance variables
        myBinMax = binMax;
        myCatalog = new ArrayList<Footwear>();
        myBins = new ArrayList<Bin>(5);
        
        for(int i=0; i<myBins.size(); i++)
        addBin(i);
        
    }
    
    /**
     * adds B(bin number) to warehouse
     * 
     */
    public void addBin(int binNum)
    {
        myBins.add(new Bin("B" + binNum));
    }
    
    /**
     * get warehouse bin information
     * 
     * return warehouse information
     */
    public String toString()
    {
        String info = "";
        
        for(Bin b : myBins)
            for(int i=0; i<b.getContents().size(); i++)
                info +=  TrackingTester.lookupFootwear(myCatalog, b.getContents().get(i).toString());

        return info;
    
    }
    
    /**
     * gather everything needed before recieving new order
     * 
     * param fw - Footwear object specification
     * param q - positive quantity of fw unit
     * 
     */
    public void receive(Footwear fw, int q)
    {
        boolean inCat = false;
        for(Footwear item : myCatalog)
        {
            if(item.getSKU() == fw.getSKU())
            inCat = true;
        }
        
        if(inCat == false)
        myCatalog.add(fw);
        
        int min = Integer.MAX_VALUE;
        Bin i = null;
        for(Bin bin : myBins)
        { 
            if(bin.totalQuantity() < min && bin.totalQuantity() < myBinMax)
            i = bin;
        }
        
        int addQ;
        
        if(i != null)
        {
            addQ = myBinMax - i.totalQuantity();
            
            if(addQ >= q)
            i.addItems(new BinItem(fw.getSKU(), q));
            else
            i.addItems(new BinItem(fw.getSKU(), myBinMax));
    }
}
}
