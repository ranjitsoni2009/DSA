package arrays;

import java.util.Arrays;

/**
 * Created by Ranjit Soni on 08-01-2025.
 * Author: ranjitsoni2009@gmail.com
 */
public class TwoSumSolution {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Arrays.sort(nums);
        int left = 0;
        for (int right = nums.length-1; right > 0; --right) {
            if (target < nums[right]) {
                continue;
            }
             while (left < right) {
                 int sum = nums[left] + nums[right];
                 if (sum < target) {
                     ++left;
                 } else if (sum == target) {
                     result[0] = left;
                     result[1] = right;
                     right = 0;
                 } else {
                     break;
                 }
             }
        }
        return result;
    }
}
