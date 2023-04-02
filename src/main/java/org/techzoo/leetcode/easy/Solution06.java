package org.techzoo.leetcode.easy;

public class Solution06 {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(" ");
        String lastWord = s.substring(lastSpaceIndex+1, s.length());
        return lastWord.length();
    }

    public static void main(String[] args) {
        Solution06 solution06 = new Solution06();
        String[] inputs = new String[] {"Hello World", "   fly me   to   the moon  ",  "luffy is still joyboy"};
        for (String input : inputs) {
            System.out.println(solution06.lengthOfLastWord(input));
        }

    }
}
