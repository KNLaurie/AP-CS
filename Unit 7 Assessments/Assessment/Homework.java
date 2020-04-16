
/**
 * Write a description of class Homework here.
 *
 * @author K. Laurie
 * @version 4/2/2020
 */
public abstract class Homework
{
    // instance variables - replace the example below with your own
    private int pagesRead;
    private String typeHomework;

    /**
     * Constructor for objects of class Homework
     */
    public Homework()
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
}
