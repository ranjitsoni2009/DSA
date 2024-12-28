package arrays;

import org.apache.commons.collections4.CollectionUtils;

/**
 * Problem Statement :- Write a program to rotate Array clockwise based on given numberofRotation.
 *      Clockwise rotation means, every element from start index will move to its right side by numberOfRotation and in the same manner element from last index would be added at the start of end.
 *      For Example :- let's say there is array = [1,2,3,4,5] and numberofRotation = 1 then resultant array would be [5,1,2,3,4]
 * <p>
 * Example:
 *      Input: array = [1, 2, 3, 4, 5], numberOfRotation = 2
 *      Output: [4, 5, 1, 2, 3]
 */
public class RotateArrayClockWiseSolution1 {

    /**
     * This method is used to rotate the array clockwise based on given numberOfRotation.
     * Logic Explanation:
     *      1. If the number of rotations is greater than the length of the array, reduce it by taking modulo with the array length.
     *      2. For each rotation, store the last element in a temporary variable.
     *      3. Shift all elements to the right by one position.
     *      4. Place the temporary variable at the start of the array.
     *      5. Repeat the above steps for the given number of rotations.
     * <p>
     * Time Complexity:
     *      The outer loop runs for 'numberOfRotation' times.
     *      The inner loop runs for 'array.length' times.
     *      Therefore, the time complexity is O(numberOfRotation * array.length).
     * <p>
     * Space Complexity:
     *      The space complexity is O(1) as we are using a constant amount of extra space.
     * <p>
     * Note :- This is brute force solution, RotateArrayClockWiseOptimized is better solution.
     * 
     * @param array The array to be rotated.
     * @param numberOfRotation The number of rotations to be performed.
     * @return The rotated array.
     */
    public int[] rotateArrayClockWise(int[] array, int numberOfRotation) {

        if (array == null || array.length == 0) {
            return array;
        }

        if (numberOfRotation >= array.length) {
            numberOfRotation = numberOfRotation % array.length;
        }

        if (numberOfRotation > 0) {
            for (int j = 0; j < numberOfRotation; ++j) {
                int endIndex = array.length-1;
                int temp = array[endIndex];
                for (int i = endIndex-1; i >= 0; --i) {
                    array[i+1] = array[i];
                }
                array[0] = temp;    
            }
        }
        
        return array;
    }
}
