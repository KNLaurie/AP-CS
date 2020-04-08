
/**
 * Encode/Decode message using randomly generated cipher alphabet
 *
 * @author K. Laurie
 * @version 3/25/2020
 */

import java.util.ArrayList;
public class LaurieCipher
{
    private static final char[] ALPHABET = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                        'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                        'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5',
                        '6', '7', '8', '9', '0'};
        
    public static final ArrayList<Character> CIPHER_ALPHABET = generateAlphabet();
    
    /**
     * generate cipher alphabet
     * 
     * @return   new cipher aalphabet
     */
    public static ArrayList<Character> generateAlphabet()
    {
        ArrayList<Character> alpha = new ArrayList<Character>();
        int letter;
        boolean inAlpha;
        
        for(int i=0; i<26; i++)
        {
            letter = (int)(Math.random() * 26);
            inAlpha = true;

            while(inAlpha)
            {
                letter = (int)(Math.random() * 26);
                
                if(find(alpha, ALPHABET[letter]) == -1)
                inAlpha = false;
                
            }
            
            alpha.add(ALPHABET[letter]);
        }
        return alpha;
    }
    
    
    /**
     *Encrypt message using Laurie Cipher
     *
     * @param  in     English meassage
     * @param  shift  How many positions letters in message will be shifted to the right
     * @return        Encrypted version of in
     */
    public static String encrypt(String in)
    {
        //initialize output variable
        String output = "";
        int index = 0;
        
        for(int i=0; i<in.length(); i++)
        {
            index = findAlpha(ALPHABET, in.charAt(i));
            
            if(in.charAt(i) == ' ')
            output += " ";
            
            else
            output += CIPHER_ALPHABET.get(index);
        }
        
        return output;
    }
    
    /**
     *Decrypt message using Laurie Cipher
     *
     * @param  in     Encrypted message
     * @param  shift  How many positions letters in message that were shifted to the right
     * @return        Decrypted version of in
     */
    public static String decrypt(String in)
    {
        //initialize output variable
        String output = "";
        int index;
        
        for(int i=0; i<in.length(); i++)
        {
            index = find(CIPHER_ALPHABET, in.charAt(i));
            
            if(in.charAt(i) == ' ')
            output += " ";
            
            else
            output += ALPHABET[index];
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
    public static int find(ArrayList<Character> a, int target)
    {
    	for (int i = 0; i < a.size(); i++)
    		if (a.get(i) == target)
    		        
    			return i;
    
    	return -1;
    }
    
    /**
     * find index of character
     * 
     * @param   a        array to search for match
     * @param   target   item to find index of in array
     * @return  index of target in a
     */
    public static int findAlpha(char[] a, int target)
    {
    	for (int i = 0; i < a.length; i++)
    		if (a[i] == target)
    		        
    			return i;
    
    	return -1;
    }
}
