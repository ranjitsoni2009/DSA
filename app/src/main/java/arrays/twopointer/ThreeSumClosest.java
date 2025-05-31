package arrays.twopointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSumClosest {

    public static void main(String[] args) {
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
        int[] A = {-5,1,4,-7,10,-7,0,7,3,0,-2,-5,-3,-6,4,-7,-8,0,4,9,4,1,-8,-6,-6,0,-9,5,3,-9,-5,-9,6,3,8,-10,1,-2,2,1,-9,2,-3,9,9,-10,0,-9,-2,7,0,-4,-3,1,6,-3};
        int B = 10;
     }
     
    public int threeSumClosest(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        System.out.println("A -->"+A);
        //3 integer sum
        int k = 3;
        int minDiff = Integer.MAX_VALUE;
        int sum = 0 ;
        for (int i = 0; i < k; ++i) {
            sum = sum + A.get(i);
        }

        int closestEle = 0;
        
        int diff = getDiff(B, sum);
        if (diff < minDiff) {
            closestEle = sum;
            minDiff = diff;
        }

        System.out.println("B -->"+B+", sum -->"+sum+", diff -->"+diff+", minDiff -->"+minDiff);

        for (int i = 1; i <= A.size()-k; ++i) {
            sum = sum - A.get(i-1) + A.get(i);
            diff = getDiff(B, sum);
            if (diff < minDiff) {
                closestEle = sum;
                minDiff = diff;
                System.out.println("B -->"+B+", sum -->"+sum+", diff -->"+diff+", minDiff -->"+minDiff+", closestEle -->"+closestEle);
            }
            
        }
        System.out.println("closestEle -->"+closestEle);
        return closestEle;
    }

    int getDiff(int B, int sum) {
        int diff = 0;
        if (B > sum) {
            diff = B - sum;
        } else {
            diff = sum - B;
        }
        return diff;
    }
}
