package backtracking;

import java.util.ArrayList;

/**
 * Created by Ranjit Soni on 31-05-2025.
 * Author: ranjitsoni2009@gmail.com
 */
public class GenerateParenthesis {

    private final ArrayList<String> result = new ArrayList<>();
    ArrayList<String> generateParenthesis(int n) {
        generateParenthesisHelper("", n, 0, 0);
        return result;
    }

    private void generateParenthesisHelper(String str, int n, int opening, int closing) {
        if (str.length() == 2*n) {
            result.add(str);
        }

        if (opening < n) {
            generateParenthesisHelper(str + "(", n, opening + 1, closing);
        }

        if (closing < opening) {
            generateParenthesisHelper(str + ")", n, opening, closing + 1);
        }
    }
}
