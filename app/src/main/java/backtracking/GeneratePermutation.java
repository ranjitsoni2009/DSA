package backtracking;

import java.util.ArrayList;

/**
 * Created by Ranjit Soni on 05-04-2025.
 * Author: ranjitsoni2009@gmail.com
 */
public class GeneratePermutation {
    static ArrayList<String> result = new ArrayList<>();
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        boolean[] visited = new boolean[n];
        StringBuilder currentPermutation = new StringBuilder();
        generatePermutations(str, visited, currentPermutation);
        System.out.println("All permutations of the string are: " + result);
    }

    private static void generatePermutations(String str, boolean[] visited, StringBuilder currentPermutation) {
        if (currentPermutation.length() == str.length()) {
            result.add(currentPermutation.toString());
            //System.out.println("Add in result --> "+currentPermutation.toString());
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                currentPermutation.append(str.charAt(i));
                //System.out.println("i --> "+i+", str.charAt("+i+") --> "+str.charAt(i)+", currentPermutation -> " + currentPermutation.toString());
                generatePermutations(str, visited, currentPermutation);
                //System.out.println("--------------------------Function call returned for i -> "+i+" --- Start-----------------------------");
                //System.out.println("currentPermutation -> " + currentPermutation.toString()+ ", visited["+i+"] -> "+visited[i]);
                visited[i] = false;
                currentPermutation.deleteCharAt(currentPermutation.length() - 1);
                //System.out.println("After Operation, currentPermutation -> " + currentPermutation.toString()+ ", visited["+i+"] -> "+visited[i]);
                //System.out.println("--------------------------Function call returned or i ->"+i+" --- End-----------------------------");
            }
        }
    }
}
