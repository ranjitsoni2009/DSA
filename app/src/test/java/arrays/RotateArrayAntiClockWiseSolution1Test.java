package arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RotateArrayAntiClockWiseSolution1Test {

    @Test
    void testRotateArrayAntiClockWise_singleRotation() {
        RotateArrayAntiClockWiseSolution1 rotateArrayAntiClockWise = new RotateArrayAntiClockWiseSolution1();
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {2, 3, 4, 5, 1};
        assertArrayEquals(expected, rotateArrayAntiClockWise.rotateArrayAntiClockWise(array, 1));
    }

    @Test
    void testRotateArrayAntiClockWise_multipleRotations() {
        RotateArrayAntiClockWiseSolution1 rotateArrayAntiClockWise = new RotateArrayAntiClockWiseSolution1();
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {3, 4, 5, 1, 2};
        assertArrayEquals(expected, rotateArrayAntiClockWise.rotateArrayAntiClockWise(array, 2));
    }

    @Test
    void testRotateArrayAntiClockWise_noRotation() {
        RotateArrayAntiClockWiseSolution1 rotateArrayAntiClockWise = new RotateArrayAntiClockWiseSolution1();
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, rotateArrayAntiClockWise.rotateArrayAntiClockWise(array, 0));
    }

    @Test
    void testRotateArrayAntiClockWise_rotationEqualToLength() {
        RotateArrayAntiClockWiseSolution1 rotateArrayAntiClockWise = new RotateArrayAntiClockWiseSolution1();
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, rotateArrayAntiClockWise.rotateArrayAntiClockWise(array, 5));
    }

    @Test
    void testRotateArrayAntiClockWise_rotationGreaterThanLength() {
        RotateArrayAntiClockWiseSolution1 rotateArrayAntiClockWise = new RotateArrayAntiClockWiseSolution1();
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {3, 4, 5, 1, 2};
        assertArrayEquals(expected, rotateArrayAntiClockWise.rotateArrayAntiClockWise(array, 7));
    }

    @Test
    void testRotateArrayAntiClockWise_emptyArray() {
        RotateArrayAntiClockWiseSolution1 rotateArrayAntiClockWise = new RotateArrayAntiClockWiseSolution1();
        int[] array = {};
        int[] expected = {};
        assertArrayEquals(expected, rotateArrayAntiClockWise.rotateArrayAntiClockWise(array, 3));
    }

    @Test
    void testRotateArrayAntiClockWise_nullArray() {
        RotateArrayAntiClockWiseSolution1 rotateArrayAntiClockWise = new RotateArrayAntiClockWiseSolution1();
        int[] array = null;
        int[] expected = null;
        assertArrayEquals(expected, rotateArrayAntiClockWise.rotateArrayAntiClockWise(array, 3));
    }

    @Test
    void testRotateArrayAntiClockWise_largeNumberOfRotations() {
        RotateArrayAntiClockWiseSolution1 rotateArrayAntiClockWise = new RotateArrayAntiClockWiseSolution1();
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {4, 5, 1, 2, 3};
        assertArrayEquals(expected, rotateArrayAntiClockWise.rotateArrayAntiClockWise(array, 13));
    }

    @Test
    void testRotateArrayAntiClockWise_singleElementArray() {
        RotateArrayAntiClockWiseSolution1 rotateArrayAntiClockWise = new RotateArrayAntiClockWiseSolution1();
        int[] array = {1};
        int[] expected = {1};
        assertArrayEquals(expected, rotateArrayAntiClockWise.rotateArrayAntiClockWise(array, 3));
    }

    @Test
    void testRotateArrayAntiClockWise_largeArray() {
        RotateArrayAntiClockWiseSolution1 rotateArrayAntiClockWise = new RotateArrayAntiClockWiseSolution1();
        int size = 1000000;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        int[] expected = new int[size];
        for (int i = 0; i < size; i++) {
            expected[i] = (i + 100) % size + 1;
        }
        assertArrayEquals(expected, rotateArrayAntiClockWise.rotateArrayAntiClockWise(array, 100));
    }
}