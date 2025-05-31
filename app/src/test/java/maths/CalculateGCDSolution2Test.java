package maths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateGCDSolution2Test {

    @Test
    void gcd() {
        CalculateGCDSolution2 solution = new CalculateGCDSolution2();
        int result = solution.gcd(10, 15);
        assertEquals(5, result);
    }

    @Test
    void gcd_1() {
        CalculateGCDSolution2 solution = new CalculateGCDSolution2();
        int result = solution.gcd(10, 0);
        assertEquals(10, result);
    }

    @Test
    void gcd_2() {
        CalculateGCDSolution2 solution = new CalculateGCDSolution2();
        int result = solution.gcd(10, 1);
        assertEquals(1, result);
    }

}