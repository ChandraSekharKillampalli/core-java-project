package core;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given an expression string exp, write a program to examine whether the pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in the given expression.
 *
 * Example:
 *
 * Input: exp = “[()]{}{[()()]()}”
 * Output: Balanced
 * Explanation: all the brackets are well-formed
 *
 * Input: exp = “[(])”
 * Output: Not Balanced
 * Explanation: 1 and 4 brackets are not balanced because
 * there is a closing ‘]’ before the closing ‘(‘
 */
public class Problem_12 {
    public static void main(String[] args) {
        String inputString = "[(]{}{[()()]()}";//Need to check whether this string is balance parenthesis string
        System.out.println("Result:::"+isBalancedInput(inputString));
    }
    private static String  isBalancedInput(String input) {

        //Stack<Character> stack  =  new Stack<>();//stack is synchronized, so we can use Deque also
        Deque<Character> stack  =new ArrayDeque<>();
        for(int i=0;i<input.length();i++) {
            if(!(input.charAt(i) == '}' || input.charAt(i) == ']' || input.charAt(i) == ')') ){
                stack.push(input.charAt(i));
            }

            if((input.charAt(i) == '}' || input.charAt(i) == ']' || input.charAt(i) == ')')) {
                if(stack.isEmpty())
                    return  "Not Balanced ";
                char top = stack.pop();

                // Check if the popped opening bracket matches the current closing bracket
                if ((input.charAt(i)  == ')' && top != '(') ||
                        (input.charAt(i)  == ']' && top != '[') ||
                        (input.charAt(i)  == '}' && top != '{')) {
                    return  "Not Balanced ";
                }
            }
        }
        return stack.isEmpty()  ? "Balanced" : "Not Balanced ";
    }
}
