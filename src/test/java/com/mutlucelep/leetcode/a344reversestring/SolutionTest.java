package com.mutlucelep.leetcode.a344reversestring;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testReverseString1() {
        char[] given = {'h', 'e', 'l', 'l', 'o'};
        char[] expected = {'o', 'l', 'l', 'e', 'h'};

        solution.reverseString(given);

        assertEquals(given, expected);
    }

    @Test
    public void testReverseString2(){
        char[] given = {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] expected = {'h','a','n','n','a','H'};

        solution.reverseString(given);

        assertEquals(given, expected);
    }


}