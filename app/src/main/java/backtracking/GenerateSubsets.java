package backtracking;

import java.util.ArrayList;

/**
 * Created by Ranjit Soni on 05-04-2025.
 * Author: ranjitsoni2009@gmail.com
 */
public class GenerateSubsets {
    static ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<Integer> currList = new ArrayList<>();
        ArrayList<Integer> inputList = new ArrayList<>();
        inputList.add(7);
        inputList.add(8);
        inputList.add(6);
        subSet(currList, 0, inputList);
        System.out.println("All subsets of the array are: " + result);
    }

    static void subSet(ArrayList<Integer> currList, int index, ArrayList<Integer> A) {
        if (index == A.size()) {
            result.add(new ArrayList<>(currList));
            return;
        }

        currList.add(A.get(index));
        subSet(currList, index+1, A);

        currList.remove(currList.size()-1);
        subSet(currList, index+1, A);
    }
}
