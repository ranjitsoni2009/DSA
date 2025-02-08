package arrays.carryforward;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindMinMaxInMinLengthSubArrayTest {

    @Test
    public void testFindMinLengthSubArray_NormalCase() {
        FindMinMaxInMinLengthSubArray solution = new FindMinMaxInMinLengthSubArray();
        int[] array = {1, 3, 2, 1, 4, 5, 1, 6, 2, 1, 7};
        int result = solution.findMinLengthSubArray(array);
        assertEquals(2, result);
    }

    @Test
    public void testFindMinLengthSubArray_SingleElement() {
        FindMinMaxInMinLengthSubArray solution = new FindMinMaxInMinLengthSubArray();
        int[] array = {1};
        int result = solution.findMinLengthSubArray(array);
        assertEquals(1, result);
    }

    @Test
    public void testFindMinLengthSubArray_AllSameElements() {
        FindMinMaxInMinLengthSubArray solution = new FindMinMaxInMinLengthSubArray();
        int[] array = {1, 1, 1, 1, 1};
        int result = solution.findMinLengthSubArray(array);
        assertEquals(1, result);
    }

    @Test
    public void testFindMinLengthSubArray_MinAndMaxAtEnds() {
        FindMinMaxInMinLengthSubArray solution = new FindMinMaxInMinLengthSubArray();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = solution.findMinLengthSubArray(array);
        assertEquals(10, result);
    }

    @Test
    public void testFindMinLengthSubArray_EmptyArray() {
        FindMinMaxInMinLengthSubArray solution = new FindMinMaxInMinLengthSubArray();
        int[] array = {};
        int result = solution.findMinLengthSubArray(array);
        assertEquals(0, result);
    }
}