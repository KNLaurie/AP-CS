
/**
 * Analyze frequency of characters in text file to decode cipher
 *
 * @author K. Laurie
 * @version 3/25/2020
 */

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
public class FrequencyAnalysis
{
    //Initialize instance variables
    public static final char[] ALPHABET = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                        'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                        'u', 'v', 'w', 'x', 'y', 'z'};
    
    private int[] cipherFrequencyCount = new int[26];              
    private int[] plainFrequencyCount = new int[26]; 
    private double[] avgCipherFrequency = new double[26];
    private double[] avgPlainFrequency = new double[26];
    private char[] key = new char[26];

    FrequencyAnalysis(String file1, String file2) throws IOException
    {
        //Set all frequencies to zero
        cipherFrequencyCount = countFrequency(file1);
        plainFrequencyCount = countFrequency(file2);

        
        avgCipherFrequency = avgFrequency("cipherFreq.txt", cipherFrequencyCount);
        avgPlainFrequency = avgFrequency("PlainFreq.txt", plainFrequencyCount);
        
        
    }
    
    /**
     * find frequency of characters in text file
     * 
     * @param  filename  name of text file  
     */
    public int[] countFrequency(String fileName) throws IOException
    {
        String token;
        int index;
        int[] frequencyCount = new int[26];
        
        for(int i=0; i<26; i++)
        frequencyCount[i] = 0;
         
        File inFile = new File(fileName);
        Scanner text = new Scanner(inFile);
        
        while(text.hasNext())
        {
            token = (text.nextLine()).toLowerCase();
             
            //cycle through letters in token
            for(int i=0; i<token.length(); i++)
            {   
                index = find(ALPHABET, token.charAt(i));
                
                if(index != -1)
                frequencyCount[index]++;
               
            }
            
        }
        text.close();
        
        return frequencyCount;
    }
    
    /**
     * Calculate average frequency of characters and write to file
     * 
     * @param fileName name of file that will hold frequency data
     */
    public double[] avgFrequency(String fileName, int[] count) throws IOException
    {
        int total = 0;
        double[] avgFrequency = new double[26]; 
        //add sum of frequencies
        for(int i=0; i<ALPHABET.length; i++)
            total += count[i];
        
        //calculate average frequency of each character
        for(int i=0; i<ALPHABET.length; i++)
        avgFrequency[i] = (count[i] / (double)total) * 100.00;
         
        //create and write to file holding frequency data
        File inFile = new File(fileName);
        FileWriter writer = new FileWriter(fileName);
        PrintWriter pWriter = new PrintWriter(writer);
        
        for(int i=0; i<avgFrequency.length; i++)
        pWriter.printf("%.3f\n", avgFrequency[i]);
        
        writer.close();
        
        return avgFrequency;
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
    
    /**
     * work to decrypt cipher and find key
     */
    public String decrypt(String filename) throws IOException
    {
        double difference = (double)(Integer.MAX_VALUE);
        char letter = 'a';   
        for(int i=0; i<26; i++)
        {
            for(int x=0; x<26; x++)
            {
                if(Math.abs(avgPlainFrequency[i] - avgCipherFrequency[x]) < difference)
                {
                    letter = ALPHABET[x];
                    difference = Math.abs(avgPlainFrequency[i] - avgCipherFrequency[x]);
                }                
            }
            
            key[i] = letter;
            difference = (double)(Integer.MAX_VALUE);
        }
        key[0] = 'k';
        key[1] = 'm';
        key[2] = 'g';
        key[5] = 'o';
        key[6] = 't';
        key[8] = 'a';
        key[11] = 's';
        key[12] = 'n';
        key[13] = 'w';
        key[14] = 'y';
        key[15] = 'b';
        key[16] = 'c';
        key[17] = 'x';
        key[21] = 'p';
        key[22] = 'o';
        key[23] = 'd';
        key[24] = 'r';
        key[25] = 'u';
        //decode message
        String output = "";
        String token;
        File in = new File(filename);
        Scanner inFile = new Scanner(in);
        
        while(inFile.hasNext())
        {
            token = (inFile.nextLine()).toLowerCase();
            for(int i=0; i<token.length(); i++)
            {
                if(token.charAt(i) == ' ')
                output += " ";
                
                else if(find(key, token.charAt(i)) == -1)
                output += "?";
                
                else
                output += ALPHABET[find(key, token.charAt(i))];
                
            }
        }
        
        return output;
    }
    /**
     * get average frequency array
     */
    public double[] getAvgFreq()
    {
        return avgCipherFrequency;
    }
    
    /**
     * get cipher key
     */
    public char[] getKey()
    {
        return key;
    }
}