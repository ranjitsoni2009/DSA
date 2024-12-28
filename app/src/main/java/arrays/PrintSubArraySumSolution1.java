package arrays;

/**
 * Approach :- Brute Force
 * Problem Statement - Print the sum of all subArray for the given array.
 * Example :- let's say there is array [1,2,3], where index would be from 0 to arrayLength-1.
 * so possible subArray and their sum would be [0,0] and 1, [0,1] and 3, [0,2] and , [1,1], [1,2], [2,2]
 *   ________________
 *  | subArray | Sum |
 *   ----------------
 *  | [0,0]    | 1   | 
 *  | [0,1]    | 3   | 
 *  | [0,2]    | 6   |
 *  | [1,1]    | 2   |
 *  | [1,2]    | 5   |
 *  | [2,2]    | 3   | 
 *   ----------------
 * <p>
 * Note:- This is brute force solution., printSubArraySumSolution2 is better solution.
 */
public class PrintSubArraySumSolution1 {

    /**
     * Observation :- 
     *  In array, each index is start index of its subArray, that means we have to consider each index one by one to get its subArray i.e. startIndex '0' to endIndex 'arrayLength-1'
     *  so first loop will go from 0 to arrayLength-1
     *  now for all subArray for index 0 :: [startIndex, endIndex] = [0,0], [0,1], [0,2]
     *  now for all subArray for index 1 :: [startIndex, endIndex] = [1,1], [1,2]
     *  now for all subArray for index 2 :: [startIndex, endIndex] = [2,2]
     * <p>
     * Logic Explanation :-
     *  Outer loop [line no.-25] will iterate for each like 0,1,2.....arrayLenght-1
     *  Inner loop [line no.-26] will generate all subArray's start & end index for each index in array
     *      for example :- startIndex = 0  then all subArray would [0,0], [0,1], [0,2] where startIndex is constant and endIndex in increasing
     *      Passing startIndex and endIndex to print sum of all element to printSubArraySum function
     * <p>
     * Time Complexity :- Let's say Array length denoted by 'N'
     *  Outer loop will execute from 0 to N-1, then loop will execute N times --------------------------------------------------------------> Time Complexity is 'N'
     *  Inner loop will execute N(N+1)/2, explained below ----------------------------------------------------------------------------------> Time Complexity is 'N'
     *      For Index 0, loop will execute N times and will pass start and endIndex like [0,0], [0,1]...[0, N-1] to printSubArraySum
     *      For Index 1, loop will execute N-1 times and will pass start and endIndex like [1,1], [1,2]...[1, N-1] to printSubArraySum
     *      .
     *      .
     *      For Index N-1, look will execute 1 times and will pass start and endIndex like [N-1,N-1] to printSubArraySum
     *      so Inner loop executing 1, 2,...N times which is natural number and sum of natural number is 'N(N+1)/2'
     *  printSubArraySum execute loop based in start to end index --------------------------------------------------------------------------> Time Complexity is 'N(N+1)/2'
     *  Since These are nested loop then N*N*(N+1)/2 --> (N^3)/2 + N^2/2
     *  As per Big Oh rules, remove lower terms and Constant coefficient
     *  then Time Complexity :: O(N^3)
     * <p>
     * Space Complexity :-
     *  Input and Output are not considered for calculation
     *  startIndex, endIndex and sum are extra integer variable, which will take constant space irrespective of input
     *  then Space Complexity :: O(1)
     * @param array The array for which subArray sum needs to be calculated.
     */
    public void printSubArrayElementSum(int[] array) {
        for (int startIndex = 0; startIndex <= array.length-1; ++startIndex) {     
            for (int endIndex = startIndex; endIndex <= array.length-1; ++endIndex) { 
                printSubArraySum(startIndex, endIndex, array);
            }
        }
    }

    /**
     * @description printSubArraySum function will print sum of all the element from startIndex to endIndex from array
     * @param startIndex start index of array
     * @param endIndex end index of array
     * @param array The array for which subArray sum needs to be calculated.
     */
    private void printSubArraySum(int startIndex, int endIndex, int[] array) {
        int sum = 0 ;
        for (int index = startIndex; index <= endIndex; ++index) {
            sum += array[index];
        }
        System.out.printf("Sum of subArray [%d, %d] is %d\n", startIndex, endIndex, sum);
    }
}