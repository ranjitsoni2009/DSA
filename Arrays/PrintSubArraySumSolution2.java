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
 * Note:- PrintSubArraySumSolution2 is better solution in terms of Time Complexity but not for space complexity, so PrintSubArraySumSolution3 is optimized solution in terms of 
 * Time and Space complexity both.
 */
public class PrintSubArraySumSolution2 {

    /**
     * Observation :- 
     *  In array, each index is start index of its subarray, that means we have to consider each index one by one to get its subarray i.e. startIndex '0' to endIndex 'arrayLength-1'
     *  so first loop will go from 0 to arrayLength-1
     *  now for all subarray for index 0 :: [startIndex, endIndex] = [0,0], [0,1], [0,2]
     *  now for all subarray for index 1 :: [startIndex, endIndex] = [1,1], [1,2]
     *  now for all subarray for index 2 :: [startIndex, endIndex] = [2,2]
     * 
     * Logic Explanation :-
     *  Generate PrefixSum Array
     *  let's say N = array.length, just for explanation
     *  Outer loop [line no.-25] will iterate for each index from '0' to 'N-1' 
     *  Inner loop [line no.-26] will iterate for each index from '0' to 'N-1' [i.e. N time]  
     *      for example :- startIndex = 0  then all subarray would [0,0], [0,1], [0,2] where startIndex is constant and endIndex in increasing
     *      Passing startIndex and endIndex to print sum of all elemento to printSubArraySum function
     * 
     * Time Complexity :- Let's say Array length denoted by 'N'
     *  Outer loop will execute from 0 to N-1, then loop will execute N times ------------------------------------> Time Complexity is 'N'
     *  Inner loop will execute from 0 to N-1 and execute constant time operation, explained below ---------------> Time Complexity is 'N'
     *      For Index 0, loop will execute N times
     *      For Index 1, loop will execute N-1 times
     *      .
     *      .
     *      For Index N-1, look will execute 1 times
     *      so from 0 to N-1, if you sum all number of itertaion, it will be N time
     *       
     *  Since These are nested loop then N*N --> N^2
     *  As per Big Oh rules, remove lower terms and Constant cofficient
     *  then Time Complexity :: O(N^2)
     * 
     * Space Complexity :-
     *  Input and Output are not considered for calculation
     *  N space is taken for prefix sum which is dependent on input array length
     *  startIndex, endIndex and sum are extra integer variable, which will take constant space irrespective of input
     *  then Space Complexity :: O(N)
     * @param array
     */
    void printSubArrayElementSum(int[] array) {

        /* get prefix sum - As a best practice existing assray should not be modified */
        int[] prefixSumArray = getPrefixSumArray(array);
        System.out.println(prefixSumArray);

        for (int startIndex = 0; startIndex <= prefixSumArray.length-1; ++startIndex) {     
            for (int endIndex = startIndex; endIndex <= prefixSumArray.length-1; ++endIndex) { 
                if (startIndex == 0) {
                    System.out.print(prefixSumArray[endIndex]+" ");
                } else {
                    System.out.print((prefixSumArray[endIndex] - prefixSumArray[startIndex-1])+" ");
                }
            }
        }
    }

    private int[] getPrefixSumArray(int[] array) {
        int[] prefixSumArray = new int[array.length];
        prefixSumArray[0] = array[0];
        for (int index = 1; index < array.length; ++index) {
            prefixSumArray[index] = array[index] + prefixSumArray[index-1];
        }

        return prefixSumArray;
    }
}