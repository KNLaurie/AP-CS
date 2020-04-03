
/**
 * Test circle class and subclasses
 *
 * @author K. Laurie
 * @version 3/16/2020
 */
public class TestPoly2
{
    public static void main(String[] args)
    {
        Circle[] shapes = new Circle[4];
        
        //set array objects
        shapes[0] = new Circle(1, 1, 1);
        shapes[1] = new Cylinder(2, 3, 4, 5);
        shapes[2] = new Oval(4, 5, 6, 7);
        shapes[3] = new OvalCylinder(8, 3, 6, 5, 7);
        
        TestPoly2 access = new TestPoly2();
        
        //print data
        for(int i = 0; i < shapes.length; i++)
        access.print(shapes[i]);
    }
    
    public void print(Circle x)
    {
        System.out.println("For " + x + " " +  x.center());
    }
}
