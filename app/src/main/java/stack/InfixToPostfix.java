package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Ranjit Soni on 03-05-2025.
 * Author: ranjitsoni2009@gmail.com
 */
public class InfixToPostfix {

    Map<Character, Integer> priorityMap = new HashMap<>();

    public String solve(String A) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        priorityMap.put('+', 1);
        priorityMap.put('-', 1);
        priorityMap.put('*', 2);
        priorityMap.put('/', 2);
        priorityMap.put('^', 3);

        int i = 0;
        while (i < A.length()) {
            if (A.charAt(i) >= 'a' && A.charAt(i) <= 'z') {
                sb.append(Character.toString(A.charAt(i))); //use alphabet in answer
            } else if (A.charAt(i) == '(') {
                stack.push('(');                            //push open braces in stack
            } else if (A.charAt(i) == ')') {
                removeAllOperatorUntilOpenBraces(stack, sb); //remove all operator untill and including open braces
            } else { //operator found like +, -, *, /, ^
                processOperator(stack, sb, A, i);
            }
            ++i;
        }

        while (!stack.isEmpty()) {
            sb.append(Character.toString(stack.peek()));
            stack.pop();
        }
        return sb.toString();
    }

    void removeAllOperatorUntilOpenBraces(Stack<Character> stack, StringBuilder sb) {
        while (!stack.isEmpty() && stack.peek() != '(') {
            sb.append(Character.toString(stack.peek()));
            stack.pop();
        }
        if (!stack.isEmpty() && stack.peek() == '(') {
            stack.pop();
        }
    }

    void processOperator(Stack<Character> stack, StringBuilder sb, String A, int i) {
        if (!stack.isEmpty()) {
            if (stack.peek() == '(') {
                stack.push(A.charAt(i));
            } else {
                if (priorityMap.get(stack.peek()) >= priorityMap.get(A.charAt(i))) {
                    //process all the operator exist in Stack
                    while (!stack.isEmpty() && stack.peek() != '(' && priorityMap.get(stack.peek()) >= priorityMap.get(A.charAt(i))) {
                        if (stack.peek() != '(') {
                            sb.append(stack.peek());
                            stack.pop();
                        } else {
                            break;
                        }
                    }
                }
                stack.push(A.charAt(i));
            }
        } else {
            stack.push(A.charAt(i));
        }
    }
}
