
/**
 * Write a description of class LaurieCipherTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class LaurieCipherTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Cipher Alphabet: " + LaurieCipher.CIPHER_ALPHABET);
        
        System.out.print("Enter message to encrypt: ");
        String message = in.nextLine();
 
        message = LaurieCipher.encrypt(message);
        System.out.println(message);
         
        System.out.print("Decryption: ");
        System.out.print(LaurieCipher.decrypt(message));
    }
}
