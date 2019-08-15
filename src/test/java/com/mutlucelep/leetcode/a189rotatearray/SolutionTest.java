package com.mutlucelep.leetcode.a189rotatearray;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testRotateArray_1() {
        int[] given = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {5, 6, 7, 1, 2, 3, 4};

        solution.rotate(given, 3);

        assertEquals(given, expected);
    }

    @Test
    public void testRotateArray_2() {
        int[] given = {-1, -100, 3, 99};
        int[] expected = {3, 99, -1, -100};

        solution.rotate(given, 2);

        assertEquals(given, expected);
    }
}