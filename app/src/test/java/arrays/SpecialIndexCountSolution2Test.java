package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpecialIndexCountSolution2Test {

    @Test
    public void testFindSpecialIndexCount_NormalCase() {
        SpecialIndexCountSolution2 solution = new SpecialIndexCountSolution2();
        int[] array = {2, 5, 1, 9, 6, 8};
        int result = solution.findSpecialIndexCount(array);
        assertEquals(1, result);
    }

    @Test
    public void testFindSpecialIndexCount_SingleElement() {
        SpecialIndexCountSolution2 solution = new SpecialIndexCountSolution2();
        int[] array = {1};
        int result = solution.findSpecialIndexCount(array);
        assertEquals(1, result);
    }

    @Test
    public void testFindSpecialIndexCount_AllSameElements() {
        SpecialIndexCountSolution2 solution = new SpecialIndexCountSolution2();
        int[] array = {2, 2, 2, 2, 2, 2};
        int result = solution.findSpecialIndexCount(array);
        assertEquals(0, result);
    }

    @Test
    public void testFindSpecialIndexCount_EmptyArray() {
        SpecialIndexCountSolution2 solution = new SpecialIndexCountSolution2();
        int[] array = {};
        int result = solution.findSpecialIndexCount(array);
        assertEquals(0, result);
    }

    @Test
    public void testFindSpecialIndexCount_NegativeElements() {
        SpecialIndexCountSolution2 solution = new SpecialIndexCountSolution2();
        int[] array = {-1, -2, -3, -4, -5, -6};
        int result = solution.findSpecialIndexCount(array);
        assertEquals(0, result);
    }
}