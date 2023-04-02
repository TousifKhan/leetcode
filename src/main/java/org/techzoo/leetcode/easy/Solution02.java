package org.techzoo.leetcode.easy;

public class Solution02 {
    //https://leetcode.com/problems/can-place-flowers/

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0 && canPlant(flowerbed, i)) {
                flowerbed[i] = 1;
                count++;
                if(count == n) {
                    return true;
                }

            }
        }

        return false;
    }

    private boolean canPlant(int[] flowerbed, int i) {
        if((i-1>=0 && flowerbed[i-1] == 1) || (i+1<flowerbed.length && flowerbed[i+1] ==1)) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] flowerbed = new int[]{1,0,0,0,1};
        int n = 1;
        System.out.println("Can Plant Flowers ? "+new Solution02().canPlaceFlowers(flowerbed, n));
    }
}
