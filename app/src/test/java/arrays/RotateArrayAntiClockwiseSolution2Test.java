package arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class RotateArrayAntiClockwiseSolution2Test {

    @Test
    void testRotateArrayAntiClockwise_singleRotation() {
        RotateArrayAntiClockwiseSolution2 rotateArrayAntiClockwise = new RotateArrayAntiClockwiseSolution2();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 1));
        assertEquals(expected, rotateArrayAntiClockwise.rotateArrayAntiClockwise(arrayList, 1));
    }

    @Test
    void testRotateArrayAntiClockwise_multipleRotations() {
        RotateArrayAntiClockwiseSolution2 rotateArrayAntiClockwise = new RotateArrayAntiClockwiseSolution2();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 4, 5, 1, 2));
        assertEquals(expected, rotateArrayAntiClockwise.rotateArrayAntiClockwise(arrayList, 2));
    }

    @Test
    void testRotateArrayAntiClockwise_noRotation() {
        RotateArrayAntiClockwiseSolution2 rotateArrayAntiClockwise = new RotateArrayAntiClockwiseSolution2();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expected, rotateArrayAntiClockwise.rotateArrayAntiClockwise(arrayList, 0));
    }

    @Test
    void testRotateArrayAntiClockwise_rotationEqualToLength() {
        RotateArrayAntiClockwiseSolution2 rotateArrayAntiClockwise = new RotateArrayAntiClockwiseSolution2();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expected, rotateArrayAntiClockwise.rotateArrayAntiClockwise(arrayList, 5));
    }

    @Test
    void testRotateArrayAntiClockwise_rotationGreaterThanLength() {
        RotateArrayAntiClockwiseSolution2 rotateArrayAntiClockwise = new RotateArrayAntiClockwiseSolution2();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 4, 5, 1, 2));
        assertEquals(expected, rotateArrayAntiClockwise.rotateArrayAntiClockwise(arrayList, 7));
    }

    @Test
    void testRotateArrayAntiClockwise_emptyArray() {
        RotateArrayAntiClockwiseSolution2 rotateArrayAntiClockwise = new RotateArrayAntiClockwiseSolution2();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, rotateArrayAntiClockwise.rotateArrayAntiClockwise(arrayList, 3));
    }

    @Test
    void testRotateArrayAntiClockwise_nullArray() {
        RotateArrayAntiClockwiseSolution2 rotateArrayAntiClockwise = new RotateArrayAntiClockwiseSolution2();
        assertNull(rotateArrayAntiClockwise.rotateArrayAntiClockwise(null, 3));
    }

    @Test
    void testRotateArrayAntiClockwise_largeNumberOfRotations() {
        RotateArrayAntiClockwiseSolution2 rotateArrayAntiClockwise = new RotateArrayAntiClockwiseSolution2();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4, 5, 1, 2, 3));
        assertEquals(expected, rotateArrayAntiClockwise.rotateArrayAntiClockwise(arrayList, 13));
    }

    @Test
    void testRotateArrayAntiClockwise_singleElementArray() {
        RotateArrayAntiClockwiseSolution2 rotateArrayAntiClockwise = new RotateArrayAntiClockwiseSolution2();
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1));
        ArrayList<Integer> expected = new ArrayList<>(List.of(1));
        assertEquals(expected, rotateArrayAntiClockwise.rotateArrayAntiClockwise(arrayList, 3));
    }

    @Test
    void testRotateArrayAntiClockwise_largeArray() {
        RotateArrayAntiClockwiseSolution2 rotateArrayAntiClockwise = new RotateArrayAntiClockwiseSolution2();
        int size = 1000000;
        ArrayList<Integer> arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(i + 1);
        }
        ArrayList<Integer> expected = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            expected.add((i + 100) % size + 1);
        }
        assertEquals(expected, rotateArrayAntiClockwise.rotateArrayAntiClockwise(arrayList, 100));
    }
}