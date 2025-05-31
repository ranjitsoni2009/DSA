package backtracking;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GeneratePermutationTest {

    @Test
    void generatePermutations() {
        GeneratePermutation gp = new GeneratePermutation();
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        ArrayList<ArrayList<String>> result = gp.generatePermutations(list);

        assertEquals(6, result.size());
        assertTrue(result.contains(new ArrayList<>(Arrays.asList("a", "b", "c"))));
        assertTrue(result.contains(new ArrayList<>(Arrays.asList("a", "c", "b"))));
        assertTrue(result.contains(new ArrayList<>(Arrays.asList("b", "a", "c"))));
        assertTrue(result.contains(new ArrayList<>(Arrays.asList("b", "c", "a"))));
        assertTrue(result.contains(new ArrayList<>(Arrays.asList("c", "a", "b"))));
        assertTrue(result.contains(new ArrayList<>(Arrays.asList("c", "b", "a"))));
    }
}