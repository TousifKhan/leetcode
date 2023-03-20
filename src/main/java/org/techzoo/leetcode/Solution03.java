package org.techzoo.leetcode;

public class Solution03 {

    //https://leetcode.com/problems/palindrome-number/

    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int length = s.length();
        for(int i = 0; i <length/2; i++) {
            if (s.charAt(i) != s.charAt(length-i-1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is Number palindrome ? " + new Solution03().isPalindrome(10201));
    }
}
