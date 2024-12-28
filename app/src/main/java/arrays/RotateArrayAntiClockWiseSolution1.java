package arrays;

/**
 * Approach :- Brute Force
 * Problem Statement :- Write a program to rotate Array anti-clockwise based on given numberOfRotation.
 *    Anti-Clockwise rotation means, every element from start index will move to its left side by numberOfRotation
 *    and in the same manner element from first index would be added at the end of array.
 * <p>
 * Example :- let's say there is array = [1,2,3,4,5] and numberOfRotation = 2 then resultant array would be [3,4,5,1,2]
 */
public class RotateArrayAntiClockWiseSolution1 {

    /**
     * This method is used to rotate the array anti-clockwise based on given numberOfRotation.
     * <p>
     * Logic Explanation:
     * 1. If the number of rotations is greater than the length of the array, reduce it by taking modulo with the array length.
     * 2. For each rotation, store the first element in a temporary variable.
     * 3. Shift all elements to the left by one position.
     * 4. Place the temporary variable value at the end of the array.
     * 5. Repeat the above steps for the given number of rotations.
     *
     * <p>
     * Time Complexity:
     * The outer loop runs for 'numberOfRotation' times.
     * The inner loop runs for 'array.length' times.
     * Therefore, the time complexity is O(numberOfRotation * array.Length).
     * <p>
     * Space Complexity:
     * The space complexity is O(1) as we are using a constant amount of extra space.
     *
     * @param array The array to be rotated.
     * @param numberOfRotation The number of rotations to be performed.
     * @return The rotated array.
     */
    public int[] rotateArrayAntiClockWise(int[] array, int numberOfRotation) {
        if (array == null || array.length == 0) {
            return array;
        }

        if (numberOfRotation >= array.length) {
            numberOfRotation = numberOfRotation % array.length;
        }

        if (numberOfRotation > 0) {
            for (int j = 0; j < numberOfRotation; ++j) {
                int temp = array[0];
                for (int i = 1; i < array.length; ++i) {
                    array[i-1] = array[i];
                }
                array[array.length-1] = temp;
            }
        }

        return array;
    }
}
