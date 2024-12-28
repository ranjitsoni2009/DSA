package DSA.BasicDSA;

/**
 * Problem Statement :- Find number of factors for given number
 * Definition of Factors :- All the number between 1 to given number, which divides the number and remainder is 0, then that number is factor of given number.
 *  For Example :- Let's say Given Number is 6 then factor of 6 would 1, 2, 3 and 6 because when 6 divided by these number, remainder would always be 0. 
 *  
 * Note:- This is Optiimized Solution.
 * Time Complexity :: O(sqrt(N))
 * Space Complexity :: O(1)
 */
public class GetFactorOfNumberSolution2 {
    
    /**
     * Logic Explanation from CountFactorOfNumberSolution1.java [Brute Force Approach]:- 
     *      Iterating loop for index -> 1 to given input number and checking for value of each index if number%index == 0, if it true then increase the factorCount.
     * Observation  :- 
     *      let's observe the first solution and take Number 16 as input 
     *       ---------------------
     *      | index | N/index     |
     *       ---------------------
     *      |   1   |      16     |        
     *      |   2   |      8      |
     *      |   4   |      4      | -- Repeating after this
     *      |   8   |      2      |
     *      |   16  |      1      |
     *      ----------------------
     *      
     *      From above obseravtion, we can see, after index 4, sequence is repeating, that means, 
     *          for index 1 --> 1 and 16 are factors, that means 2 Factor for index 1
     *          for index 2 --> 2 and 8 are factors, that means 2 Factor for index 2
     *          for index 4 --> 4 and 4 are factors, that means 1 Factor for index 4
     *          Sp total number of factor for 16 would be 2+2+1 = 5
     * 
     *  
     * Logic Explanation from Optimized Approach based on above observation:-
     *      Here condition in loop is index <= Number/index --> index^2 <= Number --> index <= Sqrt(Number)
     *      it means loop iteration would be Sqrt(Number) times which is far less than N times of Brute Force Approach. 
     * @param number
     * @return
     */
    public int findFactors(int number) {
        int factorCount = 0;
        for (int index = 1; index <= (number/index); ++index) {
            if (number % index == 0) {
                if (index == (number/index)) {
                    ++factorCount;
                } else {
                    factorCount = factorCount + 2;
                }
            }
        }

        return factorCount;
    }
}