package com.mutlucelep.leetcode.a876middleofthelinkedlist;

import com.mutlucelep.leetcode.utils.list.ListNode;

/**
 * URL:
 * =====
 * https://leetcode.com/problems/middle-of-the-linked-list/
 * <p>
 * Desc:
 * =====
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 * <p>
 * If there are two middle nodes, return the second middle node.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,4,5]
 * Output: Node 3 from this list (Serialization: [3,4,5])
 * The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
 * Note that we returned a ListNode object ans, such that:
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
 * Example 2:
 * <p>
 * Input: [1,2,3,4,5,6]
 * Output: Node 4 from this list (Serialization: [4,5,6])
 * Since the list has two middle nodes with values 3 and 4, we return the second one.
 * <p>
 * <p>
 * Note:
 * <p>
 * The number of nodes in the given list will be between 1 and 100.
 */

public class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null) return null;
        int count = 0;

        ListNode curr = head;

        while (curr.next !=null) {
            count++;

            curr = curr.next;
        }
        count++;

        for(int i = 0; i<count/2; i++){
            head = head.next;
        }

        return head;
    }
}
