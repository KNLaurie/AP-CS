
/**
 * Test different triangle classes
 *
 * @author K. Laurie
 * @version 3/13/2020
 */
public class TestTriangles
{
    public static void main(String[] args)
    {
        Triangle one = new Triangle(3.3, 5.0, 6.0);
        Equilateral two = new Equilateral(6.6);
        IsoscelesRight three = new IsoscelesRight(1.5);
        
        //Print data
        System.out.printf("Triangle has sides A = %.2f, B = %.2f, C = %.2f\n", one.getSideA(), one.getSideB(), one.getSideC());
        System.out.printf("Equilateral Triangle has sides A = %.2f, B = %.2f, C = %.2f\n", two.getSideA(), two.getSideB(), two.getSideC());
        System.out.printf("Isosceles Right Triangle has sides A = %.2f, B = %.2f, C = %.2f\n", three.getSideA(), three.getSideB(), three.getSideC());
    }
}
