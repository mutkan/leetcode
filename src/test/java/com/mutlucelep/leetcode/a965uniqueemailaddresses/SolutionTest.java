package com.mutlucelep.leetcode.a965uniqueemailaddresses;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testReverseString1() {
        String[] given = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        int expected = 2;

        int actual = solution.numUniqueEmails(given);
        assertEquals(actual, expected);
    }

    @Test
    public void testReverseString2() {
        String[] given = {"test.emai.l+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        int expected = 2;

        int actual = solution.numUniqueEmails(given);
        assertEquals(actual, expected);
    }

    @Test
    public void testReverseString3() {
        String[] given = {"test.emai.l+alex@leetcode.com", "test.e.mail+bob.cathy@leetc.ode.com", "testemail+david@lee.tcode.com"};
        int expected = 3;

        int actual = solution.numUniqueEmails(given);
        assertEquals(actual, expected);
    }

    @Test
    public void testReverseString4() {
        String[] given = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@leetcode.com"};
        int expected = 1;

        int actual = solution.numUniqueEmails(given);
        assertEquals(actual, expected);
    }


}