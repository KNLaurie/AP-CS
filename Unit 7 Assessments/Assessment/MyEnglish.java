
/**
 * Create English assignment
 *
 * @author K. Laurie
 * @version 4/2/2020
 */
public class MyEnglish extends Homework
{
    /**
     * Constructor for objects of class MyEnglish
     */
    public MyEnglish()
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
}
