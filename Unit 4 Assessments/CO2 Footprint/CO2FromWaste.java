
/**
 * Calculate waste reduction from recylcling in a household
 *
 * @author K. Laurie
 * @version 1/25/2020
 */
public class CO2FromWaste
{
    // instance variables - replace the example below with your own
    int numPeople;
    double grossWaste, wasteReduction, netWaste;
    boolean paper, plastic, glass, cans;

    /**
     * Constructor for objects of class CO2FromWaste
     */
    public CO2FromWaste(int peopleNum, boolean paperr, boolean plasticc, boolean glasss, boolean canss)
    {
        // initialise instance variables
        grossWaste = 0;
        wasteReduction = 0;
        netWaste = 0;
        
        numPeople = peopleNum;
        
        paper = paperr;
        plastic = plasticc;
        glass = glasss;
        cans = canss;
    }

    /**
     * calculate aveage waste of a household based off of the number of people before reductions
     *
     */
    public void calcGrossWaste()
    {
        grossWaste = numPeople * 1018;
    }
    
    /** 
     *calculate the waste reduction based of recylcing habits of household
     *
     */
    public void calcWasteReduction()
    {
        if(paper ==  true)
        wasteReduction += 184 * numPeople;
        
        if(plastic == true)
        wasteReduction += 25.6 * numPeople;
        
        if(glass == true)
        wasteReduction += 46.6 * numPeople;
        
        if(cans == true)
        wasteReduction += 165.8 * numPeople;
    }
    
    /**
     * calculate net waste of household
     * 
     */
    public void calcNetWaste()
    {
        netWaste = grossWaste - wasteReduction;
    }
    

}
