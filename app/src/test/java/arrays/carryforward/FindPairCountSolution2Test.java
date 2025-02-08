package arrays.carryforward;

import static org.junit.jupiter.api.Assertions.*;

class FindPairCountSolution2Test {

        @org.junit.jupiter.api.Test
        void getPairCount_NoPairs() {
            FindPairCountSolution2 solution = new FindPairCountSolution2();
            char[] array = {'a', 'b', 'c', 'd'};
            int result = solution.getPairCount(array, 'x', 'y');
            assertEquals(0, result);
        }

        @org.junit.jupiter.api.Test
        void getPairCount_WithPairs() {
            FindPairCountSolution2 solution = new FindPairCountSolution2();
            char[] array = {'b', 'a', 'c', 'a', 'g', 'g', 'a', 'g'};
            int result = solution.getPairCount(array, 'a', 'g');
            assertEquals(7, result);
        }

        @org.junit.jupiter.api.Test
        void getPairCount_AllPairs() {
            FindPairCountSolution2 solution = new FindPairCountSolution2();
            char[] array = {'a', 'b', 'a', 'b', 'a', 'b'};
            int result = solution.getPairCount(array, 'a', 'b');
            assertEquals(6, result);
        }

        @org.junit.jupiter.api.Test
        void getPairCount_SingleElement() {
            FindPairCountSolution2 solution = new FindPairCountSolution2();
            char[] array = {'a'};
            int result = solution.getPairCount(array, 'a', 'b');
            assertEquals(0, result);
        }

        @org.junit.jupiter.api.Test
        void getPairCount_EmptyArray() {
            FindPairCountSolution2 solution = new FindPairCountSolution2();
            char[] array = {};
            int result = solution.getPairCount(array, 'a', 'b');
            assertEquals(0, result);
        }
}