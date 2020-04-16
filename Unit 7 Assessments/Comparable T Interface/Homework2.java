
/**
 * Write a description of class Homework2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Homework2 implements Processing, Comparable<Homework2>
{
    // instance variables - replace the example below with your own
    private int pagesRead;
    private String typeHomework;

    /**
     * Constructor for objects of class Homework
     */
    public Homework2()
    {
        // initialise instance variables
        pagesRead = 0;
        typeHomework = "none";
    }

    /**
     * Set number of pages to read
     *
     * @param  read   number of pages read
     */
    public void setRead(int read)
    {
        pagesRead = read;
    }
    
    /**
     * get the number of pages to read
     * 
     * @return number of pages read
     */
    public int getRead()
    {
        return pagesRead;
    }
    
    /**
     * Set type of homework
     *
     * @param  type  string containing homework type
     */
    public void setType(String type)
    {
        typeHomework = type;
    }  
   
    /**
     * get the type of homework
     * 
     * @return type of homework
     */
    public String getType()
    {
        return typeHomework;
    }    
    
    public abstract void createAssignment(int p);
    
    public int compareTo(Homework2 obj)
    {
        return pagesRead - obj.pagesRead;
    }
}
