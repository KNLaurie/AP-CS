
/**
 * Math homework assignment
 *
 * @author K. Laurie
 * @version 4/6/2020
 */
public class MyMath2 extends Homework2
{
    /**
     * Constructor for objects of class MyMath
     */
    public MyMath2()
    {
        // initialise instance variables
        super();
    }

    public void createAssignment(int p)
    {
        setRead(p);
        setType("Math");
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
