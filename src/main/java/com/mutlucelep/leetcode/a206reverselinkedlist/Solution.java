package com.mutlucelep.leetcode.a206reverselinkedlist;

import com.mutlucelep.leetcode.utils.list.ListNode;

/**
 * URL:
 * =====
 * https://leetcode.com/problems/reverse-linked-list/
 * <p>
 * Desc:
 * =====
 * Reverse a singly linked list.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 * <p>
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */

public class Solution {
    //Iterative solution
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;

        while (cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    //Recursive solution 1
    public ListNode reverseList(ListNode curr){
        if(curr == null){
            return null;
        } else if(curr.next == null){
            return curr;
        }else{
            ListNode nextNode = curr.next;
            curr.next = null;
            ListNode rest = reverseList(nextNode);
            nextNode.next = curr;
            return rest;
        }
    }

    //Recursive solution 2
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
