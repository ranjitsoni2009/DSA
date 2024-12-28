package arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RotateArrayClockWiseSolution1Test {

    @Test
    void testRotateArrayClockWise_singleRotation() {
        RotateArrayClockWiseSolution1 rotateArrayClockWise = new RotateArrayClockWiseSolution1();
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {5, 1, 2, 3, 4};
        assertArrayEquals(expected, rotateArrayClockWise.rotateArrayClockWise(array, 1));
    }

    @Test
    void testRotateArrayClockWise_multipleRotations() {
        RotateArrayClockWiseSolution1 rotateArrayClockWise = new RotateArrayClockWiseSolution1();
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {4, 5, 1, 2, 3};
        assertArrayEquals(expected, rotateArrayClockWise.rotateArrayClockWise(array, 2));
    }

    @Test
    void testRotateArrayClockWise_noRotation() {
        RotateArrayClockWiseSolution1 rotateArrayClockWise = new RotateArrayClockWiseSolution1();
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, rotateArrayClockWise.rotateArrayClockWise(array, 0));
    }

    @Test
    void testRotateArrayClockWise_rotationEqualToLength() {
        RotateArrayClockWiseSolution1 rotateArrayClockWise = new RotateArrayClockWiseSolution1();
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, rotateArrayClockWise.rotateArrayClockWise(array, 5));
    }

    @Test
    void testRotateArrayClockWise_rotationGreaterThanLength() {
        RotateArrayClockWiseSolution1 rotateArrayClockWise = new RotateArrayClockWiseSolution1();
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {4, 5, 1, 2, 3};
        assertArrayEquals(expected, rotateArrayClockWise.rotateArrayClockWise(array, 7));
    }

    @Test
    void testRotateArrayClockWise_emptyArray() {
        RotateArrayClockWiseSolution1 rotateArrayClockWise = new RotateArrayClockWiseSolution1();
        int[] array = {};
        int[] expected = {};
        assertArrayEquals(expected, rotateArrayClockWise.rotateArrayClockWise(array, 3));
    }

    @Test
    void testRotateArrayClockWise_nullArray() {
        RotateArrayClockWiseSolution1 rotateArrayClockWise = new RotateArrayClockWiseSolution1();
        assertArrayEquals(null, rotateArrayClockWise.rotateArrayClockWise(null, 3));
    }

    @Test
    void testRotateArrayClockWise_largeNumberOfRotations() {
        RotateArrayClockWiseSolution1 rotateArrayClockWise = new RotateArrayClockWiseSolution1();
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {3, 4, 5, 1, 2};
        assertArrayEquals(expected, rotateArrayClockWise.rotateArrayClockWise(array, 13));
    }

    @Test
    void testRotateArrayClockWise_singleElementArray() {
        RotateArrayClockWiseSolution1 rotateArrayClockWise = new RotateArrayClockWiseSolution1();
        int[] array = {1};
        int[] expected = {1};
        assertArrayEquals(expected, rotateArrayClockWise.rotateArrayClockWise(array, 3));
    }


    @Test
    void testRotateArrayClockWise_largeArray() {
        RotateArrayClockWiseSolution1 rotateArrayClockWise = new RotateArrayClockWiseSolution1();
        int size = 10000000;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        int[] expected = new int[size];
        for (int i = 0; i < size; i++) {
            expected[(i + 1000) % size] = i + 1;
        }
        assertArrayEquals(expected, rotateArrayClockWise.rotateArrayClockWise(array, 1000));
    }
}