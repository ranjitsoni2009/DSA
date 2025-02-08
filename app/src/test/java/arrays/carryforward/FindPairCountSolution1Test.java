package arrays.carryforward;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.opentest4j.AssertionFailedError;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class FindPairCountSolution1Test {

    @Test
    public void testGetPairCount_NoPairs() {
        FindPairCountSolution1 solution = new FindPairCountSolution1();
        char[] array = {'a', 'b', 'c', 'd'};
        int result = solution.getPairCount(array, 'x', 'y');
        assertEquals(0, result);
    }

    @Test
    public void testGetPairCount_WithPairs() {
        FindPairCountSolution1 solution = new FindPairCountSolution1();
        char[] array = {'a', 'b', 'a', 'b', 'a', 'b'};
        int result = solution.getPairCount(array, 'a', 'b');
        assertEquals(6, result);
    }

    @Test
    public void testGetPairCount_AllPairs() {
        FindPairCountSolution1 solution = new FindPairCountSolution1();
        char[] array = {'a', 'b', 'a', 'b', 'a', 'b'};
        int result = solution.getPairCount(array, 'a', 'b');
        assertEquals(6, result);
    }

    @Test
    public void testGetPairCount_SingleElement() {
        FindPairCountSolution1 solution = new FindPairCountSolution1();
        char[] array = {'a'};
        int result = solution.getPairCount(array, 'a', 'b');
        assertEquals(0, result);
    }

    @Test
    public void testGetPairCount_EmptyArray() {
        FindPairCountSolution1 solution = new FindPairCountSolution1();
        char[] array = {};
        int result = solution.getPairCount(array, 'a', 'b');
        assertEquals(0, result);
    }
}