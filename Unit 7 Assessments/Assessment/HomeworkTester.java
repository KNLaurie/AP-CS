
/**
 * Tests homework class and subclasses
 *
 * @author K. Laurie
 * @version 4/2/2020
 */
import java.util.ArrayList;
public class HomeworkTester
{
    public static void main(String []args)
    {
        ArrayList homework = new ArrayList<Homework>();
        
        Homework math = new MyMath();
        Homework science = new MyScience();
        Homework english = new MyEnglish();
        Homework java = new MyJava();
        
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
            System.out.println(homework.get(i) + "\n");
        }
        
    }
}
