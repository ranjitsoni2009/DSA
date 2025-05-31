package backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

class GenerateParenthesisTest {

    @Test
    void testGenerateParenthesis_nIsZero() {
        GenerateParenthesis gp = new GenerateParenthesis();
        List<String> result = gp.generateParenthesis(0);
        Assertions.assertEquals(Arrays.asList(""), result);
    }

    @Test
    void testGenerateParenthesis_nIsOne() {
        GenerateParenthesis gp = new GenerateParenthesis();
        List<String> result = gp.generateParenthesis(1);
        Assertions.assertEquals(Arrays.asList("()"), result);
    }

    @Test
    void testGenerateParenthesis_nIsTwo() {
        GenerateParenthesis gp = new GenerateParenthesis();
        List<String> result = gp.generateParenthesis(2);
        Assertions.assertTrue(result.containsAll(Arrays.asList("(())", "()()")));
        Assertions.assertEquals(2, result.size());
    }

    @Test
    void testGenerateParenthesis_nIsThree() {
        GenerateParenthesis gp = new GenerateParenthesis();
        List<String> result = gp.generateParenthesis(3);
        Assertions.assertTrue(result.containsAll(Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()")));
        Assertions.assertEquals(5, result.size());
    }

    @Test
    void testGenerateParenthesis_nIsFour() {
        GenerateParenthesis gp = new GenerateParenthesis();
        List<String> result = gp.generateParenthesis(4);
        Assertions.assertEquals(14, result.size());
    }
}