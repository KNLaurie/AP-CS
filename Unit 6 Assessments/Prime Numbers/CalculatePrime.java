
/**
 *Calculate prime numbers up to given number
 *
 * @author K. Laurie
 * @version 3/25/2020
 */
import java.util.ArrayList;
public class CalculatePrime
{
    //instance variables
    private ArrayList<Integer> primeNumbers;
    private int max, numOfPrime;
    
    CalculatePrime(int max)
    {
        this.max = max;
        primeNumbers = calculate(this.max);
        numOfPrime = numOfPrime();
    }
    
    /**
     * calculate prime numbers from 0 - max
     * 
     * @param max  maximum number in array list
     * @return     array list of prime numbers from 0 - max
     */
    public ArrayList<Integer> calculate(int max)
    {
        boolean prime;
        ArrayList<Integer> primes = new ArrayList<Integer>();
        
        for(int i=2; i<=max; i++)
        {
            prime = true; //reset prime marker
            
            //cycle through possible factors of number
            for(int x=2; x<i; x++)
            {
                if(i%x == 0)
                prime = false;
            }
            
            if(prime)
            primes.add(i);
        }
        
        return primes;
    }
    
    /**
     * Calculate number of prime numbers
     * 
     * @return count of prime numbers in primeNumbers
     */
    public int numOfPrime()
    {
        int counter = 0;
        
        for(int i=0; i<primeNumbers.size(); i++)
        counter++;
        
        return counter;
    }
    
    /**
     * get prime number array list
     * 
     * @return prime numbers of object
     */
    public ArrayList<Integer> getPrime()
    {
        return primeNumbers;
    }
    
    /**
     * get prime number array list
     * 
     * @return prime numbers of object
     */
    public Integer getCount()
    {
        return numOfPrime;
    }
    
}
