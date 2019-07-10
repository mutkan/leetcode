package com.mutlucelep.leetcode.a082removeduplicatesfromsortedlist2;


import com.mutlucelep.leetcode.utils.list.ListNode;
import com.mutlucelep.leetcode.utils.list.ListNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testDeleteDups_IfNodeNull(){
        ListNode head = null;
        ListNode expected = null;

        ListNode actual = solution.deleteDuplicates(head);

        assertEquals(actual, expected);
    }

    @Test
    public void testDeleteDups_1(){
        int[] headArray = {1,2,3,3,4,4,5};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] expectedArray = {1,2,5};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

        ListNode actual = solution.deleteDuplicates(head);

        assertTrue(ListNodeUtils.equals(actual, expected));
    }

    @Test
    public void testDeleteDups_2(){
        int[] headArray = {1,1,1,2,3};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] expectedArray = {2,3};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

        ListNode actual = solution.deleteDuplicates(head);

        assertTrue(ListNodeUtils.equals(actual, expected));
    }

    @Test
    public void testDeleteDups_3(){
        int[] headArray = {1,1,2,3,3};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] expectedArray = {2};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

        ListNode actual = solution.deleteDuplicates(head);

        assertTrue(ListNodeUtils.equals(actual,expected));
    }

    @Test
    public void testDeleteDups_4(){
        int[] headArray = {1,1};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] expectedArray = {};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

        ListNode actual = solution.deleteDuplicates(head);

        assertTrue(ListNodeUtils.equals(actual,expected));
    }

}