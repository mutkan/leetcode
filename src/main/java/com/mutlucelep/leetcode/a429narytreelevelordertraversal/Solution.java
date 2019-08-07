package com.mutlucelep.leetcode.a429narytreelevelordertraversal;

import com.mutlucelep.leetcode.utils.narytree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * URL:
 * =====
 * https://leetcode.com/problems/n-ary-tree-level-order-traversal/
 * <p>
 * Desc:
 * =====
 * Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * <p>
 * <p>
 * <p>
 * For example, given a 3-ary tree:
 * <p>
 * We should return its level order traversal:
 * [
 * [1],
 * [3,2,4],
 * [5,6]
 * ]
 * Note:
 * <p>
 * <p>
 * The depth of the tree is at most 1000.
 * The total number of nodes is at most 5000.
 */

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> intList = new ArrayList<>();
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                Node node = queue.poll();
                intList.add(node.val);
                if (node.children != null) {
                    for (Node n : node.children) {
                        queue.add(n);
                    }
                }
            }
            ans.add(intList);
        }

        return ans;
    }
}
