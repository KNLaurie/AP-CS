
/**
 * a program to calculate the (x, y) 
 * coordinates of points on a circle of radius 1.0. 
 *
 * @author Kaitlyn Laurie
 * @version 12/12/2019
 */
public class PointsOnACircleV1
{
    public static void main(String[] args)
    {
        double radius = 1.0;
        double x;
        double sum = Math.pow(radius, 2);
        double y1;
        double y2;
        
        double counter = 1;
        
        System.out.println("Points on a Circle of Radius 1.0");
        System.out.printf("%5s%5s%15s%5s\n", "x1", "y1", "x1", "y2");
        System.out.println();
        
        while(counter >= -1.0)
        {
            x = counter;
            y1 = Math.sqrt(sum - Math.pow(x, 2));
            y2 = -y1;
            System.out.printf("%5.2f  %5.2f%15.2f  %5.2f\n", x, y1, x, y2);
            
            counter -= 0.1;
        }
        
        
    }
}
