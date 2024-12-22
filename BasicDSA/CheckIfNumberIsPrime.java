package DSA.BasicDSA;

/**
 * Problem Statememt :- Need to check if input number is prime or not.
 * Definition of Prime Number :-  If any given number have exactly 2 factors then this number is prime number.
 * 
 */
public class CheckIfNumberIsPrime {
   
    /**
     * Observation :- 
     *      As per the definition, Prime number depends on number of factors for the given number so here to identify, if number is prime or not, need to find number of factors.
     *      We have already discuss solution Brute Force and optimized solution for finding Factors.
     * So here we will use Optimized solution to find number of factor and decide, number is Prime or Not. 
     * @param number
     * @return
     */
    public boolean isPrime(int number) {
        GetFactorOfNumberSolution2 factorOfNumberSolution2 = new GetFactorOfNumberSolution2();
        int numberOfFactors = factorOfNumberSolution2.findFactors(number);
        if (numberOfFactors == 2) {
            return true;
        }
        return false;
    }
}
