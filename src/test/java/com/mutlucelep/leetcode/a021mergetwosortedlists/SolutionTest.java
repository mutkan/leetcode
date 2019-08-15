package com.mutlucelep.leetcode.a021mergetwosortedlists;


import com.mutlucelep.leetcode.utils.list.ListNode;
import com.mutlucelep.leetcode.utils.list.ListNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testMergeTwoSortedList_IfNodeNull(){
        ListNode head1 = null;
        ListNode head2 = null;
        ListNode expected = null;

        ListNode actual = solution.mergeTwoLists_Recursively(head1,head2);

        assertEquals(actual, expected);
    }

    @Test
    public void testMergeTwoSortedList_1(){
        int[] headArray = {1,1,2};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] headArray2 = {1,2};
        ListNode head2 = ListNodeUtils.createListFromArray(headArray2);

        int[] expectedArray = {1,1,1,2,2};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

        ListNode actual = solution.mergeTwoLists_Recursively(head,head2);

        assertTrue(ListNodeUtils.equals(actual, expected));
    }

    @Test
    public void testMergeTwoSortedList_2(){
        int[] headArray = {1,2,3};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] headArray2 = {4,5,6};
        ListNode head2 = ListNodeUtils.createListFromArray(headArray2);

        int[] expectedArray = {1,2,3,4,5,6};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

        ListNode actual = solution.mergeTwoLists_Recursively(head,head2);

        assertTrue(ListNodeUtils.equals(actual, expected));
    }

    @Test
    public void testMergeTwoSortedList_3(){
        int[] headArray = {1,2,4};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] headArray2 = {4,5};
        ListNode head2 = ListNodeUtils.createListFromArray(headArray2);

        int[] expectedArray = {1,2,4,4,5};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

        ListNode actual = solution.mergeTwoLists_Recursively(head,head2);

        assertTrue(ListNodeUtils.equals(actual, expected));
    }

    @Test
    public void testMergeTwoSortedList_4(){
        int[] headArray = {1,2,3};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] headArray2 = {2,3,4};
        ListNode head2 = ListNodeUtils.createListFromArray(headArray2);

        int[] expectedArray = {1,2,2,3,3,4};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

        ListNode actual = solution.mergeTwoLists_Recursively(head,head2);

        assertTrue(ListNodeUtils.equals(actual, expected));
    }


    @Test
    public void testMergeTwoSortedList_5(){
        int[] headArray = {1,2,3};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] headArray2 = {2,3};
        ListNode head2 = ListNodeUtils.createListFromArray(headArray2);

        int[] expectedArray = {1,2,2,3,3};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

        ListNode actual = solution.mergeTwoLists_Recursively(head,head2);

        assertTrue(ListNodeUtils.equals(actual, expected));
    }

    @Test
    public void testMergeTwoSortedList_6(){
        int[] headArray = {1,2,3};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] headArray2 = {2};
        ListNode head2 = ListNodeUtils.createListFromArray(headArray2);

        int[] expectedArray = {1,2,2,3};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

        ListNode actual = solution.mergeTwoLists_Recursively(head,head2);

        assertTrue(ListNodeUtils.equals(actual, expected));
    }

}