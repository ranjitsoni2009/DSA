package maths;

/**
 * Created by Ranjit Soni on 22-02-2025.
 * Author: ranjitsoni2009@gmail.com
 */
public class ModularArithmeticSolution2 {

    /**
     * Count the number of pairs (i, j) such that (arr[i] + arr[j])%m == 0, where i < j
     * @param arr input array
     * @return number of pairs
     */
    public int countPairOfIJBasedOnConstraint(int[] arr, int m) {
        int remainderFrequency[] = new int[m-1];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int remainder = arr[i] % m;
            count += remainderFrequency[(m - remainder) % m];
            remainderFrequency[remainder]++;
        }
        return  count;
    }

}
