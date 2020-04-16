
/**
 * Java assignment
 *
 * @author K. Laurie
 * @version 4/2/2020
 */
public class MyJava extends Homework
{
    /**
     * Constructor for objects of class MyJava
     */
    public MyJava()
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
}
