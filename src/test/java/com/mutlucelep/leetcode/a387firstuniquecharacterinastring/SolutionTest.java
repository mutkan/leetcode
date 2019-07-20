package com.mutlucelep.leetcode.a387firstuniquecharacterinastring;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testFirstUniqueChar_1() {
        String s = "leetcode";
        int expected = 0;
        int actual = solution.firstUniqChar(s);

        assertEquals(actual, expected);
    }

    @Test
    public void testFirstUniqueChar_2() {
        String s = "loveleetcode";
        int expected = 2;
        int actual = solution.firstUniqChar(s);

        assertEquals(actual, expected);
    }

    @Test
    public void testFirstUniqueChar_3() {
        String s = "lll";
        int expected = -1;
        int actual = solution.firstUniqChar(s);

        assertEquals(actual, expected);
    }


    @Test
    public void testFirstUniqueChar_AnotherSol_1() {
        String s = "leetcode";
        int expected = 0;
        int actual = solution.firstUniqCharAnotherSol(s);

        assertEquals(actual, expected);
    }

    @Test
    public void testFirstUniqueChar_AnotherSol_2() {
        String s = "loveleetcode";
        int expected = 2;
        int actual = solution.firstUniqCharAnotherSol(s);

        assertEquals(actual, expected);
    }

    @Test
    public void testFirstUniqueChar_AnotherSol_3() {
        String s = "lll";
        int expected = -1;
        int actual = solution.firstUniqCharAnotherSol(s);

        assertEquals(actual, expected);
    }


}