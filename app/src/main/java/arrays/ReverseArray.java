package arrays;

/**
 * Problem Statement :- Write a function to reverse the array without using additional space.
 * Example :- let's say array = [1,2,3,4,5] then reverse it like [5,4,3,2,1]
 * 
 * Logic Explanation:
 *      1. Traverse the array from left to right and right to left in a single loop until the left index is less than the right index.
 *      2. Swap the elements at the left and right indices.
 *      3. Increment the left index and decrement the right index.
 * 
 * Time Complexity:
 *      The time complexity is O(N) where N is the length of the array.
 * 
 * Space Complexity:
 *      The space complexity is O(1) as we are not using any additional space.
 */
public class ReverseArray {
    
    /**
     * This method is used to reverse the array without using additional space.
     * 
     * @param array The array to be reversed.
     * @return The reversed array.
     */
    public int[] reverseArray(int[] array) {
        int i = 0, j = array.length-1;
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] =  temp;
            ++i;
            --j;
        }
        return array;
    }
}