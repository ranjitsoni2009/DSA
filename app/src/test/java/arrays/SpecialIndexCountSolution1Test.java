package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SpecialIndexCountSolution1Test {

    @Test
    void testGetSpecialIndexCount_singleElement() {
        SpecialIndexCountSolution1 solution = new SpecialIndexCountSolution1();
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1));
        int expected = 1;
        assertEquals(expected, solution.getSpecialIndexCount(arrayList));
    }

    @Test
    void testGetSpecialIndexCount_multipleElements() {
        SpecialIndexCountSolution1 solution = new SpecialIndexCountSolution1();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int expected = 0;
        assertEquals(expected, solution.getSpecialIndexCount(arrayList));
    }

    @Test
    void testGetSpecialIndexCount_emptyArray() {
        SpecialIndexCountSolution1 solution = new SpecialIndexCountSolution1();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int expected = 0;
        assertEquals(expected, solution.getSpecialIndexCount(arrayList));
    }

    @Test
    void testGetSpecialIndexCount_evenNumberOfElements() {
        SpecialIndexCountSolution1 solution = new SpecialIndexCountSolution1();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 1, 2));
        int expected = 1;
        assertEquals(expected, solution.getSpecialIndexCount(arrayList));
    }

    @Test
    void testGetSpecialIndexCount_randomElements() {
        SpecialIndexCountSolution1 solution = new SpecialIndexCountSolution1();
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(2, 5, 1, 7, 9, 6, 8));
        int expected = 1;
        assertEquals(expected, solution.getSpecialIndexCount(arrayList));
    }

    @Test
    void testGetSpecialIndexCount_largeArray() {
        SpecialIndexCountSolution1 solution = new SpecialIndexCountSolution1();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i % 2 == 0 ? 1 : -1);
        }
        int expected = 0;
        assertEquals(expected, solution.getSpecialIndexCount(arrayList));
    }
}