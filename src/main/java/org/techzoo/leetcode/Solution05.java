package org.techzoo.leetcode;

import java.util.HashMap;

public class Solution05 {

    public boolean canConstruct(String ransomNote, String magazine) {
        char[] chars = magazine.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char c: chars) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c)+1);
            } else {
                charMap.put(c, 1);
            }
        }

        System.out.println(charMap);

        char[] ransomChars = ransomNote.toCharArray();
        for (char c: ransomChars) {
            if (!charMap.containsKey(c)) {
                return false;
            }
        }

        return true;
    }

//    Input: ransomNote = "aa", magazine = "aab"
//    Output: true

    public static void main(String[] args) {
        System.out.println(new Solution05().canConstruct("aa", "aab"));
    }
}
