package arrays.carryforward;

/**
 * Created by Ranjit Soni on 08-02-2025.
 * Author: ranjitsoni2009@gmail.com
 * <p>
 *     Problem Statement : Write function to find the count of given pairs in the given array.
 *     Constraints: The array contains only lowercase English alphabets.
 *            The length of the array is between 1 and 10^5.
 *            The array can contain duplicate characters.
 *            The array can be empty. In that case, return 0.
 *            The first character of the pair is different from the second character of the pair.
 *     Approach: Carry Forward Technique
 *     The Carry Forward Technique is used to solve the problem by carrying forward the information from the previous iteration.
 */
public class FindPairCountSolution2 {

    /**
     * This method is used to get the count of given pairs in the given array.
     * <p>
     *    Logic Explanation:
     *      1. Iterate over the array and get the first character of the pair
     *      2. once first character found then increment the count of first character.
     *      3. If next element found, then add the count of first character to the pair count.
     *      4. Return the pair count.
     *    Time Complexity:
     *      The time complexity is O(N) where N is the length of the array.
     *      Let's say N is the length of the array.
     *      The getPairCount method will take O(N) time.
     *      So, the time complexity is O(N).
     *      As per Big Oh rules, remove lower terms and Constant coefficient
     *      then Time Complexity :: O(N)
     *    Space Complexity:
     *      The space complexity is O(1) where N is the length of the array.
     * @param array The array for which pair count needs to be calculated.
     * @param firstChar The first character of the pair.
     * @param secondChar The second character of the pair.
     * @return The count of given pairs in the given array.
     */

    int getPairCount(char[] array, char firstChar, char secondChar) {
        int pairCount = 0;
        int numberOfFirstChar = 0;
        for (char c : array) {
            if (c == firstChar) {
                numberOfFirstChar++;
            } else if (c == secondChar) {
                pairCount += numberOfFirstChar;
            }
        }
        return pairCount;
    }
}
