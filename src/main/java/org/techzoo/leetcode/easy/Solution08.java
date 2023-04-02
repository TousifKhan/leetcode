package org.techzoo.leetcode.easy;

import java.util.Stack;

import static java.lang.System.out;

public class Solution08 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[] inputs = {"{}", "[]{}", "(){}[]"};
        for (String input: inputs) {
            out.println(new Solution08().isValid(input));
        }
    }
}
