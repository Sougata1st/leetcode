package leetcode;

import java.util.Stack;

public class ValidParentheses {
    //https://leetcode.com/problems/valid-parentheses/
    public static void main(String[] args) {
        String str = "({[}])";

        System.out.println(Solution.isValid(str));

    }

    class Solution {
        public static boolean isValid(String s) {
            if (s.length()%2!=0){
                return false;
            }
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                    stack.push(s.charAt(i));
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (!isMatched(stack.pop(), s.charAt(i))) {
                        return false;
                    }

                }
            }
            return stack.isEmpty();
        }

        private static boolean isMatched(Character opening, char closing) {
            if (opening == '(' && closing == ')') {
                return true;
            } else if (opening == '{' && closing == '}') {
                return true;
            } else if (opening == '[' && closing == ']') {
                return true;
            }
            return false;
        }
    }
}