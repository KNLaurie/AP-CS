
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
        science.createAssignment(6);
        english.createAssignment(6);
        java.createAssignment(1);
        
        homework.add(math);
        homework.add(science);
        homework.add(english);
        homework.add(java);
        
        for(int i=0; i<4; i++)
        {
            System.out.println("\n" + homework.get(i) + "\n");
            
            for(int x=0; x<4; x++)
            {
                if(x != i)
                {
                    if(homework.get(i).compareTo(homework.get(x)) != 0)
                    System.out.printf("The homework for %s has a %s page difference with %s \n", homework.get(i).getType(), homework.get(x).getType(), homework.get(i).compareTo(homework.get(x))); 
                
                    else
                    System.out.printf("The homework for %s and %s are the same number of pages\n", homework.get(i).getType(), homework.get(x).getType());
                }
            }
        }
        
    }
}
