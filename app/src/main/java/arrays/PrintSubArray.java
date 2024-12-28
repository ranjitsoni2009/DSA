package arrays;

/**
 * Problem Statement - Print the element of all subArray for the given array.
 * Example :- let's say there is array [1,2,3], where index would be from 0 to arrayLength-1.
 * so possible subArray would be [0,0], [0,1], [0,2], [1,1], [1,2], [2,2]
 * <p>
 * Time Complexity  :: O(N^3)
 * Space Complexity :: O(1)
 */
public class PrintSubArray {

    /**
     * Observation :- 
     *  In array, each index is start index of its subArray, that means we have to consider each index one by one to get its subArray i.e. startIndex '0' to endIndex 'arrayLength-1'
     *  so first loop will go from 0 to arrayLength-1
     *  now for all subArray for index 0 :: [startIndex, endIndex] = [0,0], [0,1], [0,2]
     *  now for all subArray for index 1 :: [startIndex, endIndex] = [1,1], [1,2]
     *  now for all subArray for index 2 :: [startIndex, endIndex] = [2,2]
     * <p>
     * Logic Explanation :-
     *  Outer loop [line no.-25] will iterate for each like 0,1,2.....array.Length-1
     *  Inner loop [line no.-26] will generate all subArray's start & end index for each index in array
     *      for example :- startIndex = 0  then all subArray would [0,0], [0,1], [0,2] where startIndex is constant and endIndex in increasing
     *      Passing startIndex and endIndex tp print the element tp printSubArray function
     * <p>
     * Time Complexity :- Let's say Array length denoted by 'N'
     *  Outer loop will execute from 0 to N-1, then loop will execute N times
     *  Inner loop will execute N(N+1)/2, explained below
     *      For Index 0, loop will execute N times
     *      For Index 1, loop will execute N-1 times
     *      .
     *      .
     *      For Index N-1, look will execute 1 times
     *      so Inner loop executing 1, 2,...N times which is natural number and sum of natural number is 'N(N+1)/2'
     *  Since These are nested loop then N*N*(N+1)/2 --> (N^3)/2 + N^2/2
     *  As per Big Oh rules, remove lower terms and Constant coefficient
     *  then Time Complexity :: O(N^3)
     * <p>
     * Space Complexity :-
     *  Input and Output are not considered for calculation
     *  startIndex and endIndex are extra integer variable, which will take constant space irrespective of input
     *  then Space Complexity :: O(1)
     * @param array  The array for which subArray element needs to be calculated.
     */
    public void printSubArrayElement(int[] array) {
        for (int startIndex = 0; startIndex <= array.length-1; ++startIndex) {     
            for (int endIndex = startIndex; endIndex <= array.length-1; ++endIndex) {
                printSubArray(startIndex, endIndex, array);
            }
        }
    }

    /**
     * @description printSubArray function will print all the element from startIndex to endIndex from array
     * @param startIndex start index of the array
     * @param endIndex  end index of the array
     * @param array array for which subArray element needs to be printed.
     */
    private void printSubArray(int startIndex, int endIndex, int[] array) {

        String str = "";
        for (int index = startIndex; index <= endIndex; ++index) {
            str = str.concat(String.valueOf(array[index])).concat(",");
        }

        System.out.print("["+str.substring(0, str.length()-1)+"]\n");
    }
}