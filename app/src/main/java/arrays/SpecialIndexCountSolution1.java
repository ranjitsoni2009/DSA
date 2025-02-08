package arrays;

import java.util.ArrayList;

/**
 * Created by Ranjit Soni on 28-12-2024.
 * Author: ranjitsoni2009@gmail.com
 * <p>
 * Approach :- Brute Force
 * Problem Statement - Write a function that returns the count of special indexes in the given arrayList.
 * Given an arrayList of integers, a special index is an index of an arrayList where the sum of even-indexed elements is equal to the sum of odd-indexed elements.
 */
public class SpecialIndexCountSolution1 {

    /**
     * This method is used to get the count of special indexes in the given arrayList.
     * <p>
     *     Logic Explanation:
     *     1. Iterate over the arrayList.
     *     2. For each index, calculate the sum of even-indexed elements before and after the index.
     *     3. Calculate the sum of odd-indexed elements before and after the index.
     *     4. If the sum of even-indexed elements is equal to the sum of odd-indexed elements, increment the special index count.
     *     5. Return the special index count.
     * <p>
     *     Time Complexity:
     *      The time complexity is O(N^2) where N is the length of the arrayList.
     *      Let's say N is the length of the arrayList.
     *      The getEvenIndexSum method will take O(N) time.
     *      The getOddIndexSum method will take O(N) time.
     *      So, the time complexity is O(N^2).
     *      As per Big Oh rules, remove lower terms and Constant coefficient
     *      then Time Complexity :: O(N^2)
     * <p>
     *     Space Complexity:
     *      The space complexity is O(1) where N is the length of the arrayList.
     *
     * @param arrayList The arrayList for which special index count needs to be calculated.
     * @return The count of special indexes in the given arrayList.
     */
    public int getSpecialIndexCount(ArrayList<Integer> arrayList) {
        int specialIndexCount = 0;
        for (int index = 0; index < arrayList.size(); ++index) {
            int sumOfEvenIndexBeforeSpecialIndex = getEvenIndexSum(index-1, arrayList);
            int sumOfEvenIndexAfterSpecialIndex = getOddIndexSum(index+1, arrayList.size()-1 ,arrayList);
            int sumOfOddIndexBeforeSpecialIndex = getEvenIndexSum(index-1, arrayList);
            int sumOfOddIndexAfterSpecialIndex = getOddIndexSum(index+1, arrayList.size()-1 ,arrayList);

            int sumOfEvenIndex = sumOfEvenIndexBeforeSpecialIndex + sumOfEvenIndexAfterSpecialIndex;
            int sumOfOddIndex = sumOfOddIndexBeforeSpecialIndex + sumOfOddIndexAfterSpecialIndex;
            if (sumOfEvenIndex == sumOfOddIndex) {
                ++specialIndexCount;
            }
        }
        return specialIndexCount;
    }

    private int getEvenIndexSum(int endIndex, ArrayList<Integer> arrayList) {
        int sum = 0;
        if (0 <= endIndex) {
            for (int index = 0; index <= endIndex; ++index) {
                if (index % 2 == 0) {
                    sum += arrayList.get(index);
                }
            }
        }
        return sum;
    }

    private int getOddIndexSum(int startIndex, int endIndex, ArrayList<Integer> arrayList) {
        int sum = 0;
        if (startIndex <= endIndex) {
            for (int index = startIndex; index <= endIndex; ++index) {
                if (index % 2 != 0) {
                    sum += arrayList.get(index);
                }
            }
        }
        return sum;
    }
}
