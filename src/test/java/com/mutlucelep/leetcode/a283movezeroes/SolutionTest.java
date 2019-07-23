package com.mutlucelep.leetcode.a283movezeroes;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testMoveZeroes_1() {
        int[] given = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        solution.moveZeroes(given);

        assertEquals(given, expected);
    }

    @Test
    public void testMoveZeroes_2() {
        int[] given = {0, 0, 0, 3, 12};
        int[] expected = {3, 12, 0, 0, 0};
        solution.moveZeroes(given);

        assertEquals(given, expected);
    }

    @Test
    public void testMoveZeroes_3() {
        int[] given = {3, 12, 0, 0, 0};
        int[] expected = {3, 12, 0, 0, 0};
        solution.moveZeroes(given);

        assertEquals(given, expected);
    }

    @Test
    public void testMoveZeroes_4() {
        int[] given = {2, 1, 3, 0, 5, 0, 6};
        int[] expected = {2, 1, 3, 5, 6, 0, 0};
        solution.moveZeroes(given);

        assertEquals(given, expected);
    }


}