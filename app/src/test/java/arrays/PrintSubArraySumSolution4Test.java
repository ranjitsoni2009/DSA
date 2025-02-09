package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrintSubArraySumSolution4Test {

    @Test
    public void testGetSubArraySum_NormalCase() {
        PrintSubArraySumSolution4 solution = new PrintSubArraySumSolution4();
        int[] array = {1, 2, 3};
        long result = solution.getSubArraySum(array);
        assertEquals(20, result);
    }

    @Test
    public void testGetSubArraySum_SingleElement() {
        PrintSubArraySumSolution4 solution = new PrintSubArraySumSolution4();
        int[] array = {5};
        long result = solution.getSubArraySum(array);
        assertEquals(5, result);
    }

    @Test
    public void testGetSubArraySum_AllSameElements() {
        PrintSubArraySumSolution4 solution = new PrintSubArraySumSolution4();
        int[] array = {2, 2, 2, 2};
        long result = solution.getSubArraySum(array);
        assertEquals(40, result);
    }

    @Test
    public void testGetSubArraySum_EmptyArray() {
        PrintSubArraySumSolution4 solution = new PrintSubArraySumSolution4();
        int[] array = {};
        long result = solution.getSubArraySum(array);
        assertEquals(0, result);
    }

    @Test
    public void testGetSubArraySum_NegativeElements() {
        PrintSubArraySumSolution4 solution = new PrintSubArraySumSolution4();
        int[] array = {-1, -2, -3};
        long result = solution.getSubArraySum(array);
        assertEquals(-20, result);
    }
}