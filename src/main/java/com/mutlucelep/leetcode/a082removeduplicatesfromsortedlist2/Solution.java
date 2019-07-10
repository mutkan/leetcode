package com.mutlucelep.leetcode.a082removeduplicatesfromsortedlist2;

import com.mutlucelep.leetcode.utils.list.ListNode;

/**
 * URL:
 * =====
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
 * <p>
 * Desc:
 * =====
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
 * <p>
 * Example 1:
 * <p>
 * Input: 1->2->3->3->4->4->5
 * Output: 1->2->5
 * <p>
 * Example 2:
 * <p>
 * Input: 1->1->1->2->3
 * Output: 2->3
 */

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0 == head.val ? 1 : 0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;
        ListNode first = dummy;

        while (cur != null & cur.next != null) {
            if(prev.val != cur.val && cur.val != cur.next.val){
                first.next = cur;
                first = first.next;
            }
            prev = cur;
            cur = cur.next;
        }

        if(prev.val != cur.val){
            first.next = cur;
            first = first.next;
        }

        first.next = null;

        return dummy.next;
    }


    public ListNode deleteDuplicatesRecursively(ListNode head) {

        if (head == null || head.next == null) return head;

        if (head.val != head.next.val) {
            head.next = deleteDuplicatesRecursively(head.next);
            return head;
        } else {
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
            }

            return deleteDuplicatesRecursively(head.next);
        }
    }
}
