package org.techzoo.leetcode.easy;

import java.util.Arrays;

public class Solution10 {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        String[] input = {"x", "xx", "xss21 eef"};
        Solution10 solution10 = new Solution10();
        Arrays.asList(input).forEach(i -> {
            System.out.println(solution10.isPalindrome(i));
        });
    }
}
