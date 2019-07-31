package com.mutlucelep.leetcode.utils.tree;


import com.mutlucelep.leetcode.a100sametree.Solution;
import java.util.ArrayList;
import java.util.List;

public class TreeNodeUtils {
    public static TreeNode fromArray(Integer[] nums) {
        TreeNode root = null;
        if (nums.length > 0 && nums[0] != null) {
            List<TreeNode> thisLevelSiblings = new ArrayList<>();
            root = new TreeNode(nums[0]);
            thisLevelSiblings.add(root);

            int index = 1;
            while (index < nums.length) {
                List<TreeNode> nextLevelSiblings = new ArrayList<>();
                for (int i = 0; i < thisLevelSiblings.size(); i++) {
                    TreeNode thisNode = thisLevelSiblings.get(i);
                    if (index < nums.length) {
                        Integer value = nums[index];
                        if (value != null) {
                            TreeNode left = new TreeNode(value);
                            thisNode.left = left;
                            nextLevelSiblings.add(left);
                        }
                        index++;
                    }
                    if (index < nums.length) {
                        Integer value = nums[index];
                        if (value != null) {
                            TreeNode right = new TreeNode(value);
                            thisNode.right = right;
                            nextLevelSiblings.add(right);
                        }
                        index++;
                    }
                }
                thisLevelSiblings = nextLevelSiblings;
            }
        }
        return root;
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        Solution solution = new Solution();
        return solution.isSameTree(p, q);
    }
}
