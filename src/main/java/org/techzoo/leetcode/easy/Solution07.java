package org.techzoo.leetcode.easy;

import java.util.Arrays;

import static java.lang.System.out;

//https://leetcode.com/problems/plus-one/
public class Solution07 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }

    public static void main(String[] args) {
//        out.println(Arrays.toString(new Solution07().plusOne(new int[]{1, 2, 3})));
        out.println(Arrays.toString(new Solution07().plusOne(new int[]{1, 2, 9})));
//        out.println(Arrays.toString(new Solution07().plusOne(new int[]{9})));
    }

}
