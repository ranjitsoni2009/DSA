package DSA.BasicDSA.TestCases;

import DSA.BasicDSA.CheckIfNumberIsPrime;
import DSA.BasicDSA.GetFactorOfNumberSolution2;

public class Main {
    public static void main(String[] args) {

        GetFactorOfNumberSolution2 countFactorOfNumberSolution1 = new GetFactorOfNumberSolution2();
        int factors = countFactorOfNumberSolution1.findFactors(2147483646);    
        System.out.println("Factors :: "+factors);

        GetFactorOfNumberSolution2 countFactorOfNumberSolution2 = new GetFactorOfNumberSolution2();
        factors = countFactorOfNumberSolution2.findFactors(2147483646);    
        System.out.println("Factors :: "+factors);

        CheckIfNumberIsPrime checkIfNumberIsPrime = new CheckIfNumberIsPrime();
        boolean isPrime = checkIfNumberIsPrime.isPrime(2147483647);
        System.out.println("isPrime :: "+isPrime);
    }
    
}
