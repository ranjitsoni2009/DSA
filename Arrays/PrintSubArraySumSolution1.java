package DSA.Arrays;

/**
 * Problem Statement - Print the sum of of all subarray for the given array.
 * Example :- let's say there is array [1,2,3], where index would be from 0 to arrayLength-1.
 * so possible subarray and their sum would be [0,0] and 1, [0,1] and 3, [0,2] and , [1,1], [1,2], [2,2]
 *   ________________
 *  | Subarray | Sum |
 *   ----------------
 *  | [0,0]    | 1   | 
 *  | [0,1]    | 3   | 
 *  | [0,2]    | 6   |
 *  | [1,1]    | 2   |
 *  | [1,2]    | 5   |
 *  | [2,2]    | 3   | 
 *   ----------------
 * 
 * Note:- This is brute force solution., PrintSubArraySumSolution2 is better solution.
 */
class PrintSubArraySumSolution1 {

    /**
     * Observation :- 
     *  In array, each index is start index of its subarray, that means we have to consider each index one by one to get its subarray i.e. startIndex '0' to endIndex 'arrayLength-1'
     *  so first loop will go from 0 to arrayLength-1
     *  now for all subarray for index 0 :: [startIndex, endIndex] = [0,0], [0,1], [0,2]
     *  now for all subarray for index 1 :: [startIndex, endIndex] = [1,1], [1,2]
     *  now for all subarray for index 2 :: [startIndex, endIndex] = [2,2]
     * 
     * Logic Explanation :-
     *  Outer loop [line no.-25] will iterate for each like 0,1,2.....arrayLenght-1
     *  Inner loop [line no.-26] will generate all subarray's start & end index for each index in array
     *      for example :- startIndex = 0  then all subarray would [0,0], [0,1], [0,2] where startIndex is constant and endIndex in increasing
     *      Passing startIndex and endIndex to print sum of all elemento to printSubArraySum function
     * 
     * Time Complexity :- Let's say Array length denoted by 'N'
     *  Outer loop will execute from 0 to N-1, then loop will execute N times --------------------------------------------------------------> Time Complexity is 'N'
     *  Inner loop will execute N(N+1)/2, explained below ----------------------------------------------------------------------------------> Time Complexity is 'N'
     *      For Index 0, loop will execute N times and will pass start and endIndex like [0,0], [0,1]...[0, N-1] to printSubArraySum
     *      For Index 1, loop will execute N-1 times and will pass start and endIndex like [1,1], [1,2]...[1, N-1] to printSubArraySum
     *      .
     *      .
     *      For Index N-1, look will execute 1 times and will pass start and endIndex like [N-1,N-1] to printSubArraySum
     *      so Inner loop executing 1, 2,...N times which is natural number and sum of natrual number is 'N(N+1)/2'
     *  printSubArraySum execute loop based in start to end index --------------------------------------------------------------------------> Time Complexity is 'N(N+1)/2'
     *  Since These are nested loop then N*N*(N+1)/2 --> (N^3)/2 + N^2/2
     *  As per Big Oh rules, remove lower terms and Constant cofficient
     *  then Time Complexity :: O(N^3)
     * 
     * Space Complexity :-
     *  Input and Output are not considered for calculation
     *  startIndex, endIndex and sum are extra integer variable, which will take constant space irrespective of input
     *  then Space Complexity :: O(1)
     * @param array
     */
    void printSubArrayElementSum(int[] array) {
        for (int startIndex = 0; startIndex <= array.length-1; ++startIndex) {     
            for (int endIndex = startIndex; endIndex <= array.length-1; ++endIndex) { 
                printSubArraySum(startIndex, endIndex, array);
            }
        }
    }

    /**
     * @description printSubArraySum function will print sum of all the element from startIndex to endIndex from array
     * @param startIndex
     * @param endIndex
     * @param array
     */
    void printSubArraySum(int startIndex, int endIndex, int[] array) {
        int sum = 0 ;
        for (int index = startIndex; index <= endIndex; ++index) {
            sum += array[index];
        }
        System.out.println(String.format("Sum of SubArray [%d, %d] is %d", startIndex, endIndex, sum));
    }
}