package doubleTree;

import javax.swing.tree.TreeNode;

public class T654 {
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {


//        // 终止条件
//        if (nums.length == 1) {
//            node.val = nums[0];
//            return node;
//        }
//
//        // 单层逻辑
//        int max = 0;
//        int maxIndex = 0;
//        // 找到最大的点
//        for (int i = 0; i < nums.length; i ++) {
//            if (nums[i] > max) {
//                max = nums[i];
//                maxIndex = i;
//            }
//        }
//        // 处理左区间

        return build(nums, 0, nums.length);
    }

    public TreeNode build(int[] nums, int start, int end) {
        // 终止条件
        if (end ==start) {
            return null;
        }
        if (end - start == 1) {
            return new TreeNode(nums[start]);
        }

        // 处理单层逻辑

        // 寻找中值
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        // 处理左子树
        TreeNode root = new TreeNode(nums[maxIndex]);

        root.left = build(nums, start, maxIndex );
        root.right = build(nums, maxIndex + 1, end);

        return root;
    }
}
