package org.techzoo.leetcode;

public class Solution04 {

//    https://leetcode.com/problems/running-sum-of-1d-array/
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Sums = " + new Solution04().runningSum(new int[] {1,2,3,4,5}));
    }
}
