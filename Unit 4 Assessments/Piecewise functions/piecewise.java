
/**
 * Write a description of class piecewise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class piecewise
{
    public int fof(int x) 
    {
        if(x <= 17)
        return -10;
        else
        {
            return fof(x - 12) + 2;
        }
    }
    public void main()
    {
        System.out.println(fof(42));
    }
}
