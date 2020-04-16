
/**
 * Java assignment
 *
 * @author K. Laurie
 * @version 4/6/2020
 */
public class MyJava2 extends Homework2
{
    /**
     * Constructor for objects of class MyJava
     */
    public MyJava2()
    {
        // initialise instance variables
        super();
    }

    public void createAssignment(int p)
    {
        setRead(p);
        setType("Java");
    }
    
    public String toString()
    {
        return "Type: " + getType() + "\nPages to Read: " + getRead();
    }
    
        public void doReading()
    {
        setRead(getRead() - 2);
    }
}
