package org.techzoo.leetcode.easy;

import java.util.*;
public class Solution01 {

    public static void main(String[] args) {

        int[] result = new Solution01().twoSum(new int[]{1,2,3,5,6,7}, 10);
        System.out.println(result[0] + " , " + result[1]);

    }
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target - nums[i])){
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i],i);
        }

        return result;
    }

}
