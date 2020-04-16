
/**
 * Science assignment
 *
 * @author K. Laurie
 * @version 4/2/2020
 */
public class MyScience extends Homework
{
    /**
     * Constructor for objects of class MyScience
     */
    public MyScience()
    {
        // initialise instance variables
        super();
    }

    public void createAssignment(int p)
    {
        setRead(p);
        setType("Science");
    }
    
    public String toString()
    {
        return "Type: " + getType() + "\nPages to read: " + getRead();
    }
}
