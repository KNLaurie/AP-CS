
/**
 * Test encryption and decryption of Caesar shif Cipher
 *
 * @author K. Laurie
 * @version 3/25/2020
 */
import java.util.Scanner;
public class CaesarShiftTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter message to encrypt: ");
        String message = in.nextLine();
        
        System.out.print("\nHow many letters would you like to shift by: ");
        int shift = in.nextInt();
        
        message = Encryption.encrypt(message, shift);
        System.out.println(message);
        
        System.out.print("Decryption: ");
        System.out.print(Decryption.decrypt(message, shift));
    }
}
