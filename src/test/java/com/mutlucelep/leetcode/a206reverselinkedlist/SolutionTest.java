package com.mutlucelep.leetcode.a206reverselinkedlist;

import com.mutlucelep.leetcode.utils.list.ListNode;
import com.mutlucelep.leetcode.utils.list.ListNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testReverseList_IfNodeNull(){
        ListNode head = null;
        ListNode expected = null;

        ListNode actual = solution.reverseList(head);

        assertEquals(actual, expected);
    }

    @Test
    public void testReverseList_1(){
        int[] headArray = {1,2,3};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] expectedArray = {3,2,1};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

        ListNode actual = solution.reverseList(head);

        assertTrue(ListNodeUtils.equals(actual, expected));
    }

    @Test
    public void testReverseList_2(){
        int[] headArray = {1,1,1};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] expectedArray = {1,1,1};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

        ListNode actual = solution.reverseList(head);

        assertTrue(ListNodeUtils.equals(actual, expected));
    }

    @Test
    public void testReverseList_3(){
        int[] headArray = {3,1,1};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] expectedArray = {1,1,3};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

        ListNode actual = solution.reverseList(head);

        assertTrue(ListNodeUtils.equals(actual, expected));
    }


    @Test
    public void testReverseList_4(){
        int[] headArray = {1,1,3};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] expectedArray = {3,1,1};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

        ListNode actual = solution.reverseList(head);

        assertTrue(ListNodeUtils.equals(actual, expected));
    }

    @Test
    public void testReverseList_5(){
        int[] headArray = {1};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] expectedArray = {1};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

        ListNode actual = solution.reverseList(head);

        assertTrue(ListNodeUtils.equals(actual, expected));
    }



}