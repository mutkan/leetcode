package com.mutlucelep.leetcode.a387firstuniquecharacterinastring;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * URL:
 * =====
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 * <p>
 * Desc:
 * =====
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * <p>
 * <p>
 * Examples:
 * <p>
 * s = "leetcode"
 * return 0.
 * <p>
 * s = "loveleetcode",
 * return 2.
 * <p>
 * <p>
 * Note: You may assume the string contain only lowercase letters.
 */

class Solution {
    public int firstUniqChar(String s) {
        char firstChar = '0';

        LinkedHashMap<Character, Integer> linkedMap = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = 0;
            if(linkedMap.get(c)!=null){
                count = linkedMap.get(c);
            }
            linkedMap.put(c, count + 1);
        }

        for (Map.Entry entry : linkedMap.entrySet()) {
            if ((int) entry.getValue() == 1) {
                firstChar = (char) entry.getKey();
                break;
            }
        }

        return firstChar == '0' ? -1 : s.indexOf(firstChar);
    }
}
