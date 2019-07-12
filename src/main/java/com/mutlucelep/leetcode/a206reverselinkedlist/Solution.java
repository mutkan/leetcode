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
}
