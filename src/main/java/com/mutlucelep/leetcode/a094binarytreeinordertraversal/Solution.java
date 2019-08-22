package com.mutlucelep.leetcode.a094binarytreeinordertraversal; /**
 * URL:
 * =====
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 * <p>
 * Desc:
 * =====
 * Given a binary tree, return the inorder traversal of its nodes' values.
 * <p>
 * <p>
 * <p>
 * Example:
 * <p>
 * <p>
 * Input: [1,null,2,3]
 * 1
 * <p>
 * 2
 * /
 * 3
 * <p>
 * Output: [1,3,2]
 * <p>
 * <p>
 * <p>
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */

import com.mutlucelep.leetcode.utils.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.val);
            curr = curr.right;
        }
        return list;
    }

    public List<Integer> inorderTraversalRecursive(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        helper(root, list);
        return list;
    }

    void helper(TreeNode root, List<Integer> list) {
        if(root == null) return;

        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }
}
