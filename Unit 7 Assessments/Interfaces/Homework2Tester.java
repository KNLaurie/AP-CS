
/**
 * Tests homework class and subclasses
 *
 * @author K. Laurie
 * @version 4/6/2020
 */
import java.util.ArrayList;
public class Homework2Tester
{
    public static void main(String []args)
    {
        ArrayList<Homework2> homework = new ArrayList<Homework2>();
        
        Homework2 math = new MyMath2();
        Homework2 science = new MyScience2();
        Homework2 english = new MyEnglish2();
        Homework2 java = new MyJava2();
        
        math.createAssignment(4);
        science.createAssignment(5);
        english.createAssignment(6);
        java.createAssignment(1);
        
        homework.add(math);
        homework.add(science);
        homework.add(english);
        homework.add(java);
        
        for(int i=0; i<4; i++)
        {
            System.out.println("Before reading: \n" + homework.get(i) + "\n");
            homework.get(i).doReading();
            System.out.println("After reading: \n" + homework.get(i) + "\n");
        }
        
    }
}
