
/**
 * test morseCode class
 *
 * @author K. Laurie
 * @version  3/24/2020
 */
import java.util.Scanner;
import java.io.IOException;
public class morseTester
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        String message = in.nextLine();
         
        System.out.println(MorseCode.converter(message));
    }
}
