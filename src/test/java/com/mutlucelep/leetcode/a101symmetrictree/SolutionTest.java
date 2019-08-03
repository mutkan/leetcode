package com.mutlucelep.leetcode.a101symmetrictree;

import com.mutlucelep.leetcode.utils.tree.TreeNode;
import com.mutlucelep.leetcode.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void testSymmetricTree_1() {
        Integer[] nums = {1, 2, 2, 3, 4, 4, 3};
        TreeNode root = TreeNodeUtils.fromArray(nums);

        boolean actual = solution.isSymmetric(root);

        assertTrue(actual);
    }

    @Test
    public void testSymmetricTree_2() {
        Integer[] nums = {1, 2, 2, 3, 4, 4};
        TreeNode root = TreeNodeUtils.fromArray(nums);

        boolean actual = solution.isSymmetric(root);

        assertFalse(actual);
    }

    @Test
    public void testSymmetricTree_3() {
        Integer[] nums = {1, 2, 2, null, 3, null, 3};
        TreeNode root = TreeNodeUtils.fromArray(nums);

        boolean actual = solution.isSymmetric(root);

        assertFalse(actual);
    }
}