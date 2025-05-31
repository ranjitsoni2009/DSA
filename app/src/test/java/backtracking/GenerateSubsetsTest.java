package backtracking;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GenerateSubsetsTest {

    @Test
    void testGenerateSubsets_EmptyString() {
        GenerateSubsets gs = new GenerateSubsets();
        ArrayList<ArrayList<String>> result = gs.generateSubsets("");
        assertEquals(1, result.size());
        assertTrue(result.contains(new ArrayList<>()));
    }

    @Test
    void testGenerateSubsets_SingleChar() {
        GenerateSubsets gs = new GenerateSubsets();
        ArrayList<ArrayList<String>> result = gs.generateSubsets("a");
        assertEquals(2, result.size());
        assertTrue(result.contains(new ArrayList<>()));
        assertTrue(result.contains(new ArrayList<>(Arrays.asList("a"))));
    }

    @Test
    void testGenerateSubsets_TwoChars() {
        GenerateSubsets gs = new GenerateSubsets();
        ArrayList<ArrayList<String>> result = gs.generateSubsets("ab");
        assertEquals(4, result.size());
        assertTrue(result.contains(new ArrayList<>()));
        assertTrue(result.contains(new ArrayList<>(Arrays.asList("a"))));
        assertTrue(result.contains(new ArrayList<>(Arrays.asList("b"))));
        assertTrue(result.contains(new ArrayList<>(Arrays.asList("a", "b"))));
    }

    @Test
    void testGenerateSubsets_ThreeChars() {
        GenerateSubsets gs = new GenerateSubsets();
        ArrayList<ArrayList<String>> result = gs.generateSubsets("abc");
        assertEquals(8, result.size());
        assertTrue(result.contains(new ArrayList<>()));
        assertTrue(result.contains(new ArrayList<>(Arrays.asList("a"))));
        assertTrue(result.contains(new ArrayList<>(Arrays.asList("b"))));
        assertTrue(result.contains(new ArrayList<>(Arrays.asList("c"))));
        assertTrue(result.contains(new ArrayList<>(Arrays.asList("a", "b"))));
        assertTrue(result.contains(new ArrayList<>(Arrays.asList("a", "c"))));
        assertTrue(result.contains(new ArrayList<>(Arrays.asList("b", "c"))));
        assertTrue(result.contains(new ArrayList<>(Arrays.asList("a", "b", "c"))));
    }
}