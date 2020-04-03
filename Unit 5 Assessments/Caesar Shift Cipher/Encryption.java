
/**
 *A program to encode a message using the Caesar Shift Cipher
 *
 * @author K. Laurie
 * @version 3/25/2020
 */
public class Encryption
{
    // instance variables
    private static final char[] ALPHABET = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                        'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                        'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5',
                        '6', '7', '8', '9', '0', ' '};



    /**
     *Encrypt message using Caesar Cipher
     *
     * @param  in     English meassage
     * @param  shift  How many positions letters in message will be shifted to the right
     * @return        Encrypted version of in
     */
    public static String encrypt(String in, int shift)
    {
        //initialize output variable
        String output = "";
        int index = 0;
        
        for(int i=0; i<in.length(); i++)
        {
            index = find(ALPHABET, in.charAt(i));
            
            if(index + shift > 0 && index + shift < 26)
            output += ALPHABET[index+shift];
            
            else
            output += ALPHABET[(index+shift)-26];
        }
        
        return output;
    }

    /**
     * find index of character
     * 
     * @param   a        array to search for match
     * @param   target   item to find index of in array
     * @return  index of target in a
     */
    public static int find(char[] a, int target)
    {
    	for (int i = 0; i < a.length; i++)
    		if (a[i] == target)
    			return i;
    
    	return -1;
    }
}
