package com.mutlucelep.leetcode.a217containsduplicate;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testContainsDuplicate_1() {
        int[] given = {1, 2, 3, 1};

        boolean actual = solution.containsDuplicate(given);

        assertTrue(actual);
    }

    @Test
    public void testContainsDuplicate_2() {
        int[] given = {1, 2, 3, 4};

        boolean actual = solution.containsDuplicate(given);

        assertFalse(actual);
    }

    @Test
    public void testContainsDuplicate_3() {
        int[] given = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        boolean actual = solution.containsDuplicate(given);

        assertTrue(actual);
    }

}