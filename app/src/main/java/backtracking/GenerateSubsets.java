package backtracking;

import java.util.ArrayList;

/**
 * Created by Ranjit Soni on 31-05-2025.
 * Author: ranjitsoni2009@gmail.com
 */
public class GenerateSubsets {

    ArrayList<ArrayList<String>> generateSubsets(String str) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        generateSubsetsHelper(str, new ArrayList<>(), 0, result);
        return result;
    }

    private void generateSubsetsHelper(String str, ArrayList<String> currList, int index, ArrayList<ArrayList<String>> result) {
        if (str.length() == index) {
            result.add(new ArrayList<>(currList));
            return;
        }

        currList.add(String.valueOf(str.charAt(index)));
        generateSubsetsHelper(str, currList, index + 1, result);

        currList.remove(currList.size() - 1);
        generateSubsetsHelper(str, currList, index + 1, result);
    }
}
