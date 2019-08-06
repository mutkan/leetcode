package com.mutlucelep.leetcode.a118pascalstriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * URL:
 * =====
 * https://leetcode.com/problems/pascals-triangle/
 * <p>
 * Desc:
 * =====
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 * <p>
 * <p>
 * <p>
 * Example:
 * <p>
 * <p>
 * Input: 5
 * Output:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * [1,5,10,10,5,1]
 * [1,6,15,20,15,6,1]
 * ]
 */

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> generated = new ArrayList<>();
        if (numRows == 0) {
            return generated;
        }
        List<Integer> one = Arrays.asList(1);
        generated.add(one);
        if (numRows > 1) {
            for (int i = 0; i < numRows - 1; i++) {
                one = generateNewList(one);
                generated.add(one);
            }
        }
        return generated;
    }

    List<Integer> generateNewList(List<Integer> list) {
        int pre = 0;

        List<Integer> newList = new ArrayList<>();
        for (int l : list) {
            newList.add(l + pre);
            pre = l;
        }
        newList.add(pre);

        return newList;
    }
}