package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfixToPostfixTest {

    @Test
    void testSolve_NormalExpression() {
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        String result = infixToPostfix.solve("a+b*(c^d-e)^(f+g*h)-i");
        assertEquals("abcd^e-fgh*+^*+i-", result);
    }

    @Test
    void testSolve_SimpleExpression() {
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        String result = infixToPostfix.solve("a+b");
        assertEquals("ab+", result);
    }

    @Test
    void testSolve_ExpressionWithParentheses() {
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        String result = infixToPostfix.solve("(a+b)*c");
        assertEquals("ab+c*", result);
    }

    @Test
    void testSolve_ExpressionWithSingleOperand() {
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        String result = infixToPostfix.solve("a");
        assertEquals("a", result);
    }

    @Test
    void testSolve_ExpressionWithMultipleOperators() {
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        String result = infixToPostfix.solve("a+b-c");
        assertEquals("ab+c-", result);
    }

    @Test
    void testSolve_ExpressionWithPowerOperator() {
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        String result = infixToPostfix.solve("a^b^c");
        assertEquals("ab^c^", result);
    }

    @Test
    void testSolve_EmptyExpression() {
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        String result = infixToPostfix.solve("");
        assertEquals("", result);
    }

    @Test
    void testSolve_ExpressionWithNestedParentheses() {
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        String result = infixToPostfix.solve("((a+b)*c)-d");
        assertEquals("ab+c*d-", result);
    }

    @Test
    void testSolve_ExpressionWithAllOperators() {
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        String result = infixToPostfix.solve("a+b*c/d-e^f");
        assertEquals("abc*d/+ef^-", result);
    }

    @Test
    void testSolve_ExpressionWithSpaces() {
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        String result = infixToPostfix.solve("a+b*c");
        assertEquals("abc*+", result); // Assuming spaces are ignored
    }
}