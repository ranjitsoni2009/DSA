package arrays;

public class ReverseSubArray {
    
    /**
     * Observation :-
     *      In order to reverse the array between given start and end index, nwe need to change the position of elemenet from star index with element at end index position and continue.
     * Logic :-
     *      Traverse array from left to right and right to left in single loop until left startIndex < endIndex
     * Time Complexity :- O(N) where N is length of array
     * Space Complexity :- O(1)
     * 
     * @param array The array to be reversed.
     * @return The reversed array.
     */
    public int[] reverseArray(int[] array, int startIndex, int endIndex) {
        
        while (startIndex < endIndex) {
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] =  temp;
            ++startIndex;
            --endIndex;
        }

        return array;
    }
}
