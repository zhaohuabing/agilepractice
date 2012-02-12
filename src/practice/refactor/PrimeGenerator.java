package practice.refactor;

/**
 * This class Generates prime numbers up to a user specified maximum.
 * the algorithm used is the Sieve of Eratosthenes.
 * <p>
 * Eratosthenes of Cyrene, b. c. 276 BC, Cyrene, Libya --
 * d. c. 194, Alexandria.  The first man to calculate the circumference
 * of the Earth.  Also known for working on calendars with leap
 * years and ran the library at Alexandria.
 * <p>
 * The algorithm is quite simple.  Given an array of integers starting
 * at 2.  Cross out all multiples of 2.  Find the next uncrossed
 * integer, and cross out all of its multiples.  Repeat until
 * you have passed the square root of the maximum value.
 * 
 * @author Robert C. Martin
 * @version 9 Dec 1999 rcm
 */

/**
 * Class declaration
 * 
 * 
 * @author Robert C. Martin
 * @version %I%, %G%
 */
public class PrimeGenerator
{
    private static boolean[] isPrime;
    private static int[] primes;

    /**
     * @param maxValue
     *            is the generation limit.
     */
    public static int[] generatePrimes(int maxValue)
    {
	if(maxValue<2)
	{
	    return new int[0];
	}

	else
	{	    
	    initializeArrayOfIntegers(maxValue);    
	    crossOutMultiples(maxValue);
	    putUncrossedIntegersIntoResult(maxValue);
	    return primes;
	} 
    }

    private static void putUncrossedIntegersIntoResult(int maxValue)
    {
	primes = new int[numberOfPrimes(maxValue)];

	// move the primes into the result
	for (int i = 0, j = 0; i < maxValue + 1; i++)
	{
	if (isPrime[i]) // if prime
	    primes[j++] = i;
	}
    }

    private static int numberOfPrimes(int maxValue)
    {
	int i;
	int count = 0;
	for (i = 0; i < maxValue + 1; i++)
	{
	if (isPrime[i])
	    count++; // bump count.
	}
	return count;
    }

    private static void crossOutMultiples(int maxValue)
    {
	// sieve
	/*
	 * int j; for (i = 2; i < Math.sqrt(s) + 1; i++) { for (j = 2 * i; j
	 * < s; j += i) f[j] = false; // multiple is not prime }
	 */

	// 不能理解平方根部分，我简化后的算法
	int i;
	int j;
	for (i = 2; i < maxValue + 1; i++)
	{
	// 用累加来表示可以被整除
	for (j = i; j < maxValue + 1;)
	{
	    j += i;
	    if (j < maxValue + 1)
	    {
		isPrime[j] = false; // multiple is not prime
	    }
	}
	}
    }

    private static void initializeArrayOfIntegers(int maxValue)
    {
	isPrime = new boolean[maxValue + 1];
	int i;

	// initialize array to true.
	for (i = 0; i < maxValue + 1; i++)
	{
	    isPrime[i] = true;
	}

	// get rid of known non-primes
	isPrime[0] = isPrime[1] = false;
    }

}
