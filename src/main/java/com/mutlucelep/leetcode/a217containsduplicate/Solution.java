package com.mutlucelep.leetcode.a217containsduplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * URL:
 * =====
 * https://leetcode.com/problems/contains-duplicate/
 * <p>
 * Desc:
 * =====
 * Given an array of integers, find if the array contains any duplicates.
 * <p>
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: [1,2,3,1]
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * <p>
 * Input: [1,2,3,4]
 * Output: false
 * <p>
 * Example 3:
 * <p>
 * <p>
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */

class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return false;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
