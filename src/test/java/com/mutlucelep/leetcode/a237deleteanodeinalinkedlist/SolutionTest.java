package com.mutlucelep.leetcode.a237deleteanodeinalinkedlist;

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
        ListNode deleteNode = null;
        ListNode expected = null;

        solution.deleteNode(deleteNode);

        assertEquals(head, expected);
    }

    @Test
    public void testReverseList_1(){
        int[] headArray = {1,2,3};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] deleteNodeArray = {2};
        ListNode deleteNode = ListNodeUtils.createListFromArray(deleteNodeArray);

        int[] expectedArray = {1,3};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);
        solution.head = head;

        solution.deleteNode(deleteNode);

        assertTrue(ListNodeUtils.equals(head, expected));
    }

    @Test
    public void testReverseList_2(){
        int[] headArray = {4,5,1,9};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] deleteNodeArray = {5};
        ListNode deleteNode = ListNodeUtils.createListFromArray(deleteNodeArray);

        int[] expectedArray = {4,1,9};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);
        solution.head = head;

        solution.deleteNode(deleteNode);

        assertTrue(ListNodeUtils.equals(head, expected));
    }

    @Test
    public void testReverseList_3(){
        int[] headArray = {4,5,1,9};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] deleteNodeArray = {1};
        ListNode deleteNode = ListNodeUtils.createListFromArray(deleteNodeArray);

        int[] expectedArray = {4,5,9};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);
        solution.head = head;

        solution.deleteNode(deleteNode);

        assertTrue(ListNodeUtils.equals(head, expected));
    }

    @Test
    public void testReverseList_4(){
        int[] headArray = {1,2};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] deleteNodeArray = {1};
        ListNode deleteNode = ListNodeUtils.createListFromArray(deleteNodeArray);

        int[] expectedArray = {2};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);
        solution.head = head;

        solution.deleteNode(deleteNode);

        assertTrue(ListNodeUtils.equals(head, expected));
    }


//    @Test
//    public void testReverseList_2(){
//        int[] headArray = {1,1,1};
//        ListNode head = ListNodeUtils.createListFromArray(headArray);
//
//        int[] expectedArray = {1,1,1};
//        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);
//
//        ListNode actual = solution.reverseList(head);
//
//        assertTrue(ListNodeUtils.equals(actual, expected));
//    }
//
//    @Test
//    public void testReverseList_3(){
//        int[] headArray = {3,1,1};
//        ListNode head = ListNodeUtils.createListFromArray(headArray);
//
//        int[] expectedArray = {1,1,3};
//        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);
//
//        ListNode actual = solution.reverseList(head);
//
//        assertTrue(ListNodeUtils.equals(actual, expected));
//    }
//
//
//    @Test
//    public void testReverseList_4(){
//        int[] headArray = {1,1,3};
//        ListNode head = ListNodeUtils.createListFromArray(headArray);
//
//        int[] expectedArray = {3,1,1};
//        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);
//
//        ListNode actual = solution.reverseList(head);
//
//        assertTrue(ListNodeUtils.equals(actual, expected));
//    }
//
//    @Test
//    public void testReverseList_5(){
//        int[] headArray = {1};
//        ListNode head = ListNodeUtils.createListFromArray(headArray);
//
//        int[] expectedArray = {1};
//        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);
//
//        ListNode actual = solution.reverseList(head);
//
//        assertTrue(ListNodeUtils.equals(actual, expected));
//    }



}