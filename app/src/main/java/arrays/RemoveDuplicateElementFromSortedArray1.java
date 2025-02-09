package arrays;

/**
 * Created by Ranjit Soni on 08-01-2025.
 * Author: ranjitsoni2009@gmail.com
 */
public class RemoveDuplicateElementFromSortedArray1 {

    public int removeDuplicateElement(int[] nums) {
        if (nums.length == 1 || nums.length == 0) {
            return nums.length;
        }

        if (nums[0] == nums[nums.length-1]) {
            return 1;
        }

        int left = 0;
        int right = nums.length-1;
        int i = 1;
        int duplicateCount = 0;
        while (i <= right) {
            if (nums[i-1] == nums[i]) {
                ++duplicateCount;
                ++i;
            } else {
                if (duplicateCount > 0) {
                    reverse(left, right, nums);
                    reverse(left, right - duplicateCount, nums);
                    reverse(right + 1 - duplicateCount, right, nums);
                    right = right - duplicateCount;
                    duplicateCount = 0;
                }
                ++left;
                i = left + 1;
            }
        }

        if (duplicateCount > 0) {
            right = right - duplicateCount;
        }

        return right+1;
    }

    public void reverse(int startIndex, int endIndex, int[] nums) {
        while (startIndex < endIndex) {
            int temp = nums[startIndex];
            nums[startIndex] = nums[endIndex];
            nums[endIndex] = temp;
            ++startIndex;
            --endIndex;
        }
    }
}
