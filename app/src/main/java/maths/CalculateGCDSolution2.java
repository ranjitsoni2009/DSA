package maths;

/**
 * Created by Ranjit Soni on 22-02-2025.
 * Author: ranjitsoni2009@gmail.com
 */
public class CalculateGCDSolution2 {

    /**
     * Calculate GCD of two numbers using Euclidean Algorithm
     * @param a - first number
     * @param b - second number
     * @return - GCD of a and b
     */
    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
