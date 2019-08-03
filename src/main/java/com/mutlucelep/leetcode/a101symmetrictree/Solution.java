package com.mutlucelep.leetcode.a101symmetrictree;

import com.mutlucelep.leetcode.utils.tree.TreeNode;

/**
 *
 * URL:
 * =====
 * https://leetcode.com/problems/symmetric-tree/
 *
 * Desc:
 * =====
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 * 
 * 
 * 1
 * / 
 * 2 2
 * /  / 
 * 3 4 4 3
 *
 * 
 * But the following [1,2,2,null,3,null,3] is not:
 * 1
 * / 
 * 2 2
 *  
 * 3 3
 * Note:
 * 
 * Bonus points if you could solve it both recursively and iteratively.
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

       return isMirror(root.left,root.right);
    }

    boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }else if(left == null || right == null){
            return false;
        }else {
            return (left.val == right.val) &&
                    isMirror(left.left, right.right) &&
                    isMirror(left.right, right.left);
        }
    }
}
