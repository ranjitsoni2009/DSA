package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseSubArrayTest {

    @Test
    void testReverseSubArray_singleElementArray() {
        ReverseSubArray reverseSubArray = new ReverseSubArray();
        int[] array = {1};
        int[] expected = {1};
        assertArrayEquals(expected, reverseSubArray.reverseArray(array, 0, 0));
    }

    @Test
    void testReverseSubArray_entireArray() {
        ReverseSubArray reverseSubArray = new ReverseSubArray();
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        assertArrayEquals(expected, reverseSubArray.reverseArray(array, 0, 4));
    }

    @Test
    void testReverseSubArray_partialArray() {
        ReverseSubArray reverseSubArray = new ReverseSubArray();
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 4, 3, 2, 5};
        assertArrayEquals(expected, reverseSubArray.reverseArray(array, 1, 3));
    }

    @Test
    void testReverseSubArray_emptyArray() {
        ReverseSubArray reverseSubArray = new ReverseSubArray();
        int[] array = {};
        int[] expected = {};
        assertArrayEquals(expected, reverseSubArray.reverseArray(array, 0, 0));
    }

    @Test
    void testReverseSubArray_evenNumberOfElements() {
        ReverseSubArray reverseSubArray = new ReverseSubArray();
        int[] array = {1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1};
        assertArrayEquals(expected, reverseSubArray.reverseArray(array, 0, 3));
    }

    @Test
    void testReverseSubArray_largeArray() {
        ReverseSubArray reverseSubArray = new ReverseSubArray();
        int size = 1000;
        int[] array = new int[size];
        int[] expected = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
            expected[size - 1 - i] = i + 1;
        }
        assertArrayEquals(expected, reverseSubArray.reverseArray(array, 0, size - 1));
    }
}