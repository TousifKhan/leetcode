package org.techzoo.leetcode.easy;

public class ClimbingStairs {

    public int climbStairs(int n) {
        if (n == 1) return n;
        //n <- current step
        int lastStep = 2; //n-1
        int lastButOne = 1; //n-2
        for (int i = 3; i <= n ; i++) {
            int temp = lastStep;
            lastStep = lastButOne + lastStep;
            lastButOne = temp;
        }
        return lastStep;
    }

    public static void main(String[] args) {

    }
}
