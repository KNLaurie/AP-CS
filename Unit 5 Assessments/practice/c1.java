
/**
 * Write a description of class c1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class c1
{
    public static double x(int x)
    {
        double num = 10;
        double n = 0;
        for(int i=0; i<=x; i++)
        {
            n +=num;
            System.out.println("num" + num );
            System.out.println("n" + n );
            num = num * 2;

        }
        return n/5280;
    }
    
    public static void main(String[] args)
    {
        System.out.println(x(14));
    }
}
