
/**
 * Create English assignment
 *
 * @author K. Laurie
 * @version 4/6/2020
 */
public class MyEnglish2 extends Homework2
{
    /**
     * Constructor for objects of class MyEnglish2
     */
    public MyEnglish2()
    {
        // initialise instance variables
        super();
    }

    public void createAssignment(int p)
    {
        setRead(p);
        setType("English");
    }
    
    public String toString()
    {
        return "Type: " + getType() + "\nPages to read: " + getRead();
    }
    
    public void doReading()
    {
        setRead(getRead() - 2);
    }
}
