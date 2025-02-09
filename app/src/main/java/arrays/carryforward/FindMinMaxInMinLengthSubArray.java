package arrays.carryforward;

/**
 * Created by Ranjit Soni on 08-02-2025.
 * Author: ranjitsoni2009@gmail.com
 * <p>
 *     Problem Statement : Write function to find minimum length of sub array which contains both min and max element of the array.
 *     Constraints: The array contains only integers.
 *       The length of the array is between 1 and 10^5.
 *       -10^9 <= array[i] <= 10^9
 *       The array can contain duplicate elements.
 *     Approach: Carry Forward Technique
 */
public class FindMinMaxInMinLengthSubArray {

    /**
     * This method is used to find the minimum length of sub array which contains both min and max element of the array.
     * <p>
     *   Logic Explanation:
     *     1. Find the min and max element of the array.
     *     2. Iterate over the array and find the index of min and max element.
     *     if min element found then store the index in latestMinIndex and checking if latestMaxIndex known
     *     then calculating length and checking for minimum length.
     *     if max element found then store the index in latestMaxIndex and checking if latestMinIndex known
     *     then calculating length and checking for minimum length.
     *     4. Return the minimum length of sub array.
     *   Time Complexity:
     *     The time complexity is O(N) where N is the length of the array.
     *     Let's say N is the length of the array.
     *     The findMinLengthSubArray method will take O(N) time.
     *     So, the time complexity is O(N).
     *     As per Big Oh rules, remove lower terms and Constant coefficient
     *     then Time Complexity :: O(N)
     *   Space Complexity:
     *     The space complexity is O(1) where N is the length of the array.
     * @param array The array for which minimum length of sub array needs to be calculated.
     * @return The minimum length of sub array which contains both min and max element of the array.
     */
    int findMinLengthSubArray(int[] array) {
        int n = array.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int latestMinIndex = -1;
        int latestMaxIndex = -1;

        for (int j : array) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        int minLength = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                if (latestMaxIndex != -1) {
                    minLength = Math.min(minLength, i - latestMaxIndex + 1);
                }
                latestMinIndex = i;
            }

            if (array[i] == max) {
                if (latestMinIndex != -1) {
                    minLength = Math.min(minLength, i - latestMinIndex + 1);

                }
                latestMaxIndex = i;
            }
        }
        return minLength;
    }
}
