package arrays;

/**
 * Created by Ranjit Soni on 28-12-2024.
 * Author: ranjitsoni2009@gmail.com
 * <p>
 *     Problem Statement - Write a function that returns the count of special indexes in the given arrayList.
 *          Given an arrayList of integers, a special index is an index of an arrayList where the sum of even-indexed
 *          elements is equal to the sum of odd-indexed elements after removing that index.
 *     Approach :- Prefix Sum
 */
public class SpecialIndexCountSolution2 {

    /**
     * This method is used to get the count of special indexes in the given array.
     * <p>
     *   Logic Explanation:
     *      1. Calculate the prefix sum of even-indexed elements and odd-indexed elements.
     *      2. Iterate over the array.
     *      3. For each 'index', calculate the sum of even-indexed elements by summing odd-indexed element before the index
     *      and sum of odd-indexed element after the index.
     *      4. Calculate the sum of odd-indexed elements by summing odd-indexed element before the index and sum of even-indexed element after the index.
     *      5. If the sum of even-indexed elements is equal to the sum of odd-indexed elements, increment the special index count.
     *      6. Return the special index count.
     *   Time Complexity:
     *      The time complexity is O(N) where N is the length of the array.
     *      Let's say N is the length of the array.
     *      The getPrefixSumOfEvenIndex & getPrefixSumOfOddIndex method will take O(N) time.
     *      The findSpecialIndexCount method will take O(N) time.
     *      then total time complexity is O(N) + O(N) = O(2N)
     *      As per Big Oh rules, remove lower terms and Constant coefficient
     *      then Time Complexity :: O(N)
     *      Space Complexity:
     *      Prefix sum array is used to store the prefix sum of even-indexed elements and odd-indexed elements.
     *      so space of prefix sum array for even-indexed elements is O(N) and odd-indexed elements is O(N).
     *      so total space complexity is O(N) + O(N) = O(2N)
     *      As per Big Oh rules, remove lower terms and Constant coefficient
     *      then Space Complexity :: O(N)
     *
     * @param array The array for which special index count needs to be calculated.
     * @return The count of special indexes in the given array.
     */
    int findSpecialIndexCount(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int n = array.length;
        int[] prefixSumEvenIndexArray = new int[n];
        int[] prefixSumOddIndexArray = new int[n];

        prefixSumEvenIndexArray[0] = array[0];
        prefixSumOddIndexArray[0] = 0;

        /* Prepare even and odd index prefix sum array */
        for (int i = 1; i < n; i++) {
            if ((i & 1) != 0) {
                prefixSumEvenIndexArray[i] = prefixSumEvenIndexArray[i-1];
                prefixSumOddIndexArray[i] = prefixSumOddIndexArray[i-1] + array[i];
            } else {
                prefixSumEvenIndexArray[i] = prefixSumEvenIndexArray[i-1] + array[i];
                prefixSumOddIndexArray[i] = prefixSumOddIndexArray[i-1];
            }
        }

        int specialIndexCount = 0;
        for (int i = 0; i < n; i++) {
            int sumOfEvenIndex = getPrefixSumOfEvenIndex(0, i-1, prefixSumEvenIndexArray) + getPrefixSumOfOddIndex(i+1, n-1, prefixSumOddIndexArray);
            int sumOfOddIndex = getPrefixSumOfOddIndex(0, i-1, prefixSumOddIndexArray) + getPrefixSumOfEvenIndex(i+1, n-1, prefixSumEvenIndexArray);
            if (sumOfEvenIndex == sumOfOddIndex) {
                specialIndexCount++;
            }
        }
        return specialIndexCount;
    }

    private int getPrefixSumOfOddIndex(int startIndex, int endIndex, int[] prefixSumOddIndexArray) {
        if (endIndex >= 0) {
            if (startIndex == 0) {
                return prefixSumOddIndexArray[endIndex];
            }
            return prefixSumOddIndexArray[endIndex] - prefixSumOddIndexArray[startIndex-1];
        }
        return 0;

    }

    private int getPrefixSumOfEvenIndex(int startIndex, int endIndex, int[] prefixSumEvenIndexArray) {
        if (endIndex >= 0) {
            if (startIndex == 0) {
                return prefixSumEvenIndexArray[endIndex];
            }
            return prefixSumEvenIndexArray[endIndex] - prefixSumEvenIndexArray[startIndex - 1];
        }
        return 0;
    }
}
