package DSA.Arrays.TestCases;

import DSA.Arrays.ReverseArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;


public class ReverseArrayTest {

    @Test
    public void testReverseArrayWithOddNumberOfElements() {
        ReverseArray reverseArray = new ReverseArray();
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        assertArrayEquals(expected, reverseArray.reverseArray(input));
    }

    @Test
    public void testReverseArrayWithEvenNumberOfElements() {
        ReverseArray reverseArray = new ReverseArray();
        int[] input = {1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1};
        assertArrayEquals(expected, reverseArray.reverseArray(input));
    }

    @Test
    public void testReverseArrayWithSingleElement() {
        ReverseArray reverseArray = new ReverseArray();
        int[] input = {1};
        int[] expected = {1};
        assertArrayEquals(expected, reverseArray.reverseArray(input));
    }

    @Test
    public void testReverseArrayWithEmptyArray() {
        ReverseArray reverseArray = new ReverseArray();
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, reverseArray.reverseArray(input));
    }

    @Test
    public void testReverseArrayWithNegativeNumbers() {
        ReverseArray reverseArray = new ReverseArray();
        int[] input = {-1, -2, -3, -4, -5};
        int[] expected = {-5, -4, -3, -2, -1};
        assertArrayEquals(expected, reverseArray.reverseArray(input));
    }
}