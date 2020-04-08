
/**
 * Write a description of class FrequencyAnalysisTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.IOException;
public class FrequencyAnalysisTester
{
    public static void main(String[] args) throws IOException
    {
        FrequencyAnalysis text = new FrequencyAnalysis("ciphertext.txt", "plaintext.txt");
        System.out.println("Cipher Text Analysis: ");
        
        for(int i=0; i<26; i++)
        System.out.printf("%s : %.2f\n", text.ALPHABET[i], text.getAvgFreq()[i]);
        
        String message = text.decrypt("secretmessage.txt");
        System.out.println("Key");
        System.out.println("Plain : Cipher");
        
        for(int i=0; i<26; i++)
        System.out.printf("%s %s : %s\n", i, text.ALPHABET[i], text.getKey()[i]);
        
        System.out.print("Secret Message: " + message);
    }
}
