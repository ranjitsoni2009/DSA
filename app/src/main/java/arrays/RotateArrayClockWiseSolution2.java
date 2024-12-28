package arrays;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;

/**
 * Problem Statement :- Write a program to rotate Array clockwise based on given numberofRotation.
 *      Clockwise rotation means, every element from start index will move to its right side by numberOfRotation 
 *      and in the same manner element from last index would be added at the start of end.
 *      For Example :- let's say there is array = [1,2,3,4,5] and numberOfRotation = 2 then resultant array would be [4,5,1,2,3]
 * <p>
 * Example:
 *      Input: array = [1, 2, 3, 4, 5], numberOfRotation = 2
 *      Output: [4, 5, 1, 2, 3]
 * <p>
 * Note:- This is optimized solution, RotateArrayClockWiseSolution1 is brute force solution.
 */
public class RotateArrayClockWiseSolution2 {

    /**
     * Observation :- from Brute Force Approach - RotateArrayClockWiseSolution1.java
     *    let's take example of array = [1,2,3,4,5] and numberOfRotation = 2
     *    For Rotation 1, array would be [5,1,2,3,4]
     *    For Rotation 2, array would be [4,5,1,2,3]
     *    If we observe the array after rotation 2, then we can see that array is combination of two array [4,5] and [1,2,3]
     *    where [4,5] is reverse of number of elements equal to numberOfRotation i.e. [5,4] and [1,2,3] is reverse of [3,2,1]
     *    so if you see array [5,4] and [3,2,1] combined make reverse of original array [1,2,3,4,5].
     *    Full explanation is given in below logic based on above observation.
     *      1. If we reverse the array then we can achieve the same result.
     *      2. For Example :- let's say there is array = [1,2,3,4,5] and numberOfRotation = 2 then final resultant array would be [5,4,3,2,1]
     *      3. Now reverse the array from 0 to numberOfRotation-1, then array would be [4,5,3,2,1]
     *      4. Now reverse the array from numberOfRotation to array.length-1, then array would be [4,5,1,2,3]
     * <p>
     * Logic Explanation:-
     * 1. Reverse the array from 0 to array.length-1
     * 2. Reverse the array from 0 to numberOfRotation-1
     * 3. Reverse the array from numberOfRotation to array.length-1
     * <p>
     * Time Complexity:-
     * 1. Reversing the array from 0 to array.length-1 will take O(N) time
     * 2. Reversing the array from 0 to numberOfRotation-1 will take O(numberOfRotation) time
     * 3. Reversing the array from numberOfRotation to array.length-1 will take O(N-numberOfRotation) time
     * 4. Therefore, the time complexity is O(N)
     * <p>
     * Space Complexity:-
     * 1. The space complexity is O(1) as we are using a constant amount of extra space.
     * <p>
     * 
     * @param arrayList The array to be rotated.
     * @param numberOfRotation The number of rotations to be performed.
     * @return The rotated array.
     */
    public ArrayList<Integer> rotateArrayListClockwise(ArrayList<Integer> arrayList, int numberOfRotation) {
        if (CollectionUtils.isEmpty(arrayList)) {
            return arrayList;
        }

        if (numberOfRotation >= arrayList.size()) {
            numberOfRotation = numberOfRotation % arrayList.size();
        }

        if (numberOfRotation > 0) {
            reverseArrayList(arrayList, 0, arrayList.size()-1);
            reverseArrayList(arrayList, 0, numberOfRotation-1);
            reverseArrayList(arrayList, numberOfRotation, arrayList.size()-1);
        }

        return arrayList;
    }

    /**
     * @description reverseArrayList function will reverse the arraylist from startIndex to endIndex
     * @param arrayList The array to be reversed.  
     * @param startIndex start index of the array to be reversed.
     * @param endIndex end index of the array to be reversed.
     */
    private void reverseArrayList(ArrayList<Integer> arrayList, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            int temp = arrayList.get(startIndex);
            arrayList.set(startIndex, arrayList.get(endIndex));
            arrayList.set(endIndex, temp);
            ++startIndex;
            --endIndex;
        }
    }
}
