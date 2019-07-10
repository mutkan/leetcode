package com.mutlucelep.leetcode.a083removeduplicatesfromsortedlist;

import com.mutlucelep.leetcode.utils.list.ListNode;

/**
 * URL:
 * =====
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * <p>
 * Desc:
 * =====
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * <p>
 * Example 1:
 * <p>
 * Input: 1->1->2
 * Output: 1->2
 * Example 2:
 * <p>
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 */

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.getNext() != null) {
            if (current.getNext().getVal() == current.getVal()) {
                current.setNext(current.getNext().getNext());
            } else {
                current = current.getNext();
            }
        }
        return head;
    }
}
