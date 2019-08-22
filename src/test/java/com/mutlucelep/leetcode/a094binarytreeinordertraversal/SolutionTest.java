package com.mutlucelep.leetcode.a094binarytreeinordertraversal;


import com.mutlucelep.leetcode.utils.tree.TreeNode;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testBinaryTreeInOrderTraversal_IfNodeNull() {
        TreeNode root = new TreeNode(1);
        TreeNode child1Left = new TreeNode(2);
        TreeNode child1Right = new TreeNode(3);
        root.left = child1Left;
        root.right = child1Right;

        TreeNode child2Left = new TreeNode(4);
        child1Left.left = child2Left;

        List<Integer> expected = Arrays.asList(4, 2, 1, 3);

        List<Integer> actual = solution.inorderTraversalRecursive(root);

        assertEquals(actual, expected);
    }

}