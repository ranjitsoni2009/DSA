package arrays;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;

/**
 * Approach :- Optimized Approach using reverse array
 * Problem Statement :- Write a program to rotate Array anti-clockwise based on given numberOfRotation.
 *   Anti-Clockwise rotation means, every element from start index will move to its left side by numberOfRotation
 *   and in the same manner element from first index would be added at the end of array.
 *   For Example :- let's say there is array = [1,2,3,4,5] and numberOfRotation = 2 then resultant array would be [3,4,5,1,2]
 * <p>
 * Note:- This is optimized solution, RotateArrayAntiClockwiseSolution1 is brute force solution.
 */
public class RotateArrayAntiClockwiseSolution2 {

    /**
     * This method is used to rotate the array anti-clockwise based on given numberOfRotation.
     * <p>
     *     Logic Explanation:
     *     1. If the number of rotations is greater than the length of the array, reduce it by taking modulo with the array length.
     *     2. Reverse the array.
     *     3. Reverse the array from 0 to arrayList.size()-1.
     *     4. Reverse the array from 0 to arrayList.size()-numberOfRotation-1.
     *     5. Reverse the array from arrayList.size()-numberOfRotation to arrayList.size()-1.
     *
     * <p>
     *     Time Complexity:
     *     The time complexity is O(N) where N is the size of the array.
     *     The reverseArray method is called three times which takes O(N) time.
     *     Therefore, the time complexity is O(N).
     * <p>
     *     Space complexity:
     *     As we are using a constant amount of extra space, so space complexity is O(1).
     *
     * @param arrayList The array to be rotated.
     * @param numberOfRotation The number of rotations to be performed.
     * @return The rotated array.
     */
    public ArrayList<Integer> rotateArrayAntiClockwise(ArrayList<Integer> arrayList, int numberOfRotation) {
        if (CollectionUtils.isEmpty(arrayList)) {
            return arrayList;
        }

        if (numberOfRotation >= arrayList.size()) {
            numberOfRotation = numberOfRotation % arrayList.size();
        }

        if (numberOfRotation > 0) {
            reverseArray(arrayList, 0, arrayList.size()-1);
            reverseArray(arrayList, 0, arrayList.size()-numberOfRotation-1);
            reverseArray(arrayList, arrayList.size()-numberOfRotation, arrayList.size()-1);
        }

        return arrayList;
    }

    /**
     * This method is used to reverse the array from startIndex to endIndex.
     * @param arrayList The array to be reversed.
     * @param startIndex The start index of the array.
     * @param endIndex The end index of the array.
     */
    private void reverseArray(ArrayList<Integer> arrayList, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = arrayList.get(startIndex);
            arrayList.set(startIndex, arrayList.get(endIndex));
            arrayList.set(endIndex, temp);
            ++startIndex;
            --endIndex;
        }
    }
}
