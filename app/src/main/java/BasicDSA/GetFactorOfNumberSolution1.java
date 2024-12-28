package DSA.BasicDSA;

/**
 * Problem Statement :- Find number of factors for given number
 * Definition of Factors :- All the number between 1 to given number, which divides the number and remainder is 0, then that number is factor of given number.
 *  For Example :- Let's say Given Number is 6 then factor of 6 would 1, 2, 3 and 6 because when 6 divided by these number, remainder would always be 0. 
 *  
 * Note:- This is Brute Force Solution.
 * Time Complexity :: O(N)
 * Space Complexity :: O(1)
 */
public class GetFactorOfNumberSolution1 {
    
    /**
     * Logic Explanation :- Iterating loop for index -> 1 to given input number and checking for value of each index if number%index == 0, if it true then increase the factorCount.
     * @param number
     * @return
     */
    public int findFactors(int number) {
        int factorCount = 0;
        for (int index = 1; index <= number; ++index) {
            if (number % index == 0) {
                ++factorCount;
            }
        }

        return factorCount;
    }
}
