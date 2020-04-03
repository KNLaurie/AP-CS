
/**
 * Write a description of class MorseCode here.
 *
 * @author K. Laurie
 * @version 3/24/2020
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class MorseCode
{
    /**
     * convert english to morse code
     *
     * @param  m    english message
     * @return    m converted to morse code
     */
    public static String converter(String m) throws IOException
    {
        char[] englishAlpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                        'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                        'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5',
                        '6', '7', '8', '9', '0', ' '};
                        
        String[] morseAlpha = new String[27];
        File morse = new File("morseCode.txt");
        Scanner in = new Scanner(morse);
        
        for(int i=0; i<27; i++)
        morseAlpha[i] = in.next();
        
        
        String output = "";
        
        for(int i = 0; i < m.length(); i++) 
        output += morseAlpha[find(englishAlpha, m.charAt(i))];
            
        return output;        
    }
    
    // Function to find the index of an element in an array
    public static int find(char[] a, int target)
    {
    	for (int i = 0; i < a.length; i++)
    		if (a[i] == target)
    			return i;
    
    	return -1;
    }
}
