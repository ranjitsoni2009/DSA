package backtracking;

import java.util.ArrayList;

/**
 * Created by Ranjit Soni on 31-05-2025.
 * Author: ranjitsoni2009@gmail.com
 */
public class GeneratePermutation {

    ArrayList<ArrayList<String>> generatePermutations(ArrayList<String> list) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        boolean[] visitedArr = new boolean[list.size()];
        generatePermutationsHelper(list, new ArrayList<>(), visitedArr, result);
        return result;
    }

    private void generatePermutationsHelper(ArrayList<String> list, ArrayList<String> currList, boolean[] visitedArr,
                                            ArrayList<ArrayList<String>> result) {
        if (currList.size() == list.size()) {
            result.add(new ArrayList<>(currList));
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            if (!visitedArr[i]) {
                visitedArr[i] = true;
                currList.add(list.get(i));
                generatePermutationsHelper(list, currList, visitedArr, result);
                currList.remove(currList.size() - 1);
                visitedArr[i] = false;
            }
        }
    }
}
