package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {

    @Test
    void testReverseArray_singleElementArray() {
        ReverseArray reverseArray = new ReverseArray();
        int[] array = {1};
        int[] expected = {1};
        assertArrayEquals(expected, reverseArray.reverseArray(array));
    }

    @Test
    void testReverseArray_multipleElementsArray() {
        ReverseArray reverseArray = new ReverseArray();
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        assertArrayEquals(expected, reverseArray.reverseArray(array));
    }

    @Test
    void testReverseArray_emptyArray() {
        ReverseArray reverseArray = new ReverseArray();
        int[] array = {};
        int[] expected = {};
        assertArrayEquals(expected, reverseArray.reverseArray(array));
    }

    @Test
    void testReverseArray_evenNumberOfElements() {
        ReverseArray reverseArray = new ReverseArray();
        int[] array = {1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1};
        assertArrayEquals(expected, reverseArray.reverseArray(array));
    }

    @Test
    void testReverseArray_largeArray() {
        ReverseArray reverseArray = new ReverseArray();
        int size = 1000;
        int[] array = new int[size];
        int[] expected = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
            expected[size - 1 - i] = i + 1;
        }
        assertArrayEquals(expected, reverseArray.reverseArray(array));
    }
}