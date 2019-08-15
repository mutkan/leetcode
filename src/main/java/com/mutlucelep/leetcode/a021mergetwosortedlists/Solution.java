package com.mutlucelep.leetcode.a021mergetwosortedlists;

/**
 * URL:
 * =====
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * <p>
 * Desc:
 * =====
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * <p>
 * <p>
 * Example:
 * <p>
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */

import com.mutlucelep.leetcode.utils.list.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1 == null && l2 == null) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        curr.next = l1 == null ? l2 : l1;
        return dummy.next;
    }

    public ListNode mergeTwoLists_Recursively(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists_Recursively(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists_Recursively(l1, l2.next);
            return l2;
        }
    }
}