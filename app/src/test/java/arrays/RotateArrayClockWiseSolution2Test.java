package arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RotateArrayClockWiseSolution2Test {

    @Test
    void testRotateArrayListClockwise_singleRotation() {
        RotateArrayClockWiseSolution2 rotateArrayClockWise = new RotateArrayClockWiseSolution2();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(5, 1, 2, 3, 4));
        assertEquals(expected, rotateArrayClockWise.rotateArrayListClockwise(arrayList, 1));
    }

    @Test
    void testRotateArrayListClockwise_multipleRotations() {
        RotateArrayClockWiseSolution2 rotateArrayClockWise = new RotateArrayClockWiseSolution2();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4, 5, 1, 2, 3));
        assertEquals(expected, rotateArrayClockWise.rotateArrayListClockwise(arrayList, 2));
    }

    @Test
    void testRotateArrayListClockwise_noRotation() {
        RotateArrayClockWiseSolution2 rotateArrayClockWise = new RotateArrayClockWiseSolution2();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expected, rotateArrayClockWise.rotateArrayListClockwise(arrayList, 0));
    }

    @Test
    void testRotateArrayListClockwise_rotationEqualToLength() {
        RotateArrayClockWiseSolution2 rotateArrayClockWise = new RotateArrayClockWiseSolution2();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expected, rotateArrayClockWise.rotateArrayListClockwise(arrayList, 5));
    }

    @Test
    void testRotateArrayListClockwise_rotationGreaterThanLength() {
        RotateArrayClockWiseSolution2 rotateArrayClockWise = new RotateArrayClockWiseSolution2();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4, 5, 1, 2, 3));
        assertEquals(expected, rotateArrayClockWise.rotateArrayListClockwise(arrayList, 7));
    }

    @Test
    void testRotateArrayListClockwise_emptyArray() {
        RotateArrayClockWiseSolution2 rotateArrayClockWise = new RotateArrayClockWiseSolution2();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, rotateArrayClockWise.rotateArrayListClockwise(arrayList, 3));
    }

    @Test
    void testRotateArrayListClockwise_nullArray() {
        RotateArrayClockWiseSolution2 rotateArrayClockWise = new RotateArrayClockWiseSolution2();
        assertNull(rotateArrayClockWise.rotateArrayListClockwise(null, 3));
    }

    @Test
    void testRotateArrayListClockwise_largeNumberOfRotations() {
        RotateArrayClockWiseSolution2 rotateArrayClockWise = new RotateArrayClockWiseSolution2();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 4, 5, 1, 2));
        assertEquals(expected, rotateArrayClockWise.rotateArrayListClockwise(arrayList, 13));
    }

    @Test
    void testRotateArrayListClockwise_singleElementArray() {
        RotateArrayClockWiseSolution2 rotateArrayClockWise = new RotateArrayClockWiseSolution2();
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1));
        ArrayList<Integer> expected = new ArrayList<>(List.of(1));
        assertEquals(expected, rotateArrayClockWise.rotateArrayListClockwise(arrayList, 3));
    }


    @Test
    void testRotateArrayListClockwise_largeArray() {
        RotateArrayClockWiseSolution2 rotateArrayClockWise = new RotateArrayClockWiseSolution2();
        int size = 10000000;
        ArrayList<Integer> arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(i + 1);
        }

        ArrayList<Integer> expected = new ArrayList<>(arrayList);
        for (int i = 0; i < size; i++) {
            expected.set((i + 1000) % size, i + 1);
        }
        assertEquals(expected, rotateArrayClockWise.rotateArrayListClockwise(arrayList, 1000));
    }
}