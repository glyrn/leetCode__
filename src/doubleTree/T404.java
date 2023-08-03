package doubleTree;

import javax.swing.tree.TreeNode;
import java.awt.desktop.PreferencesEvent;

public class T404 {
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {

        int left = sumOfLeftLeaves(root.left);
        int right = sumOfLeftLeaves(root.right);
        int mid = 0;

        if (judge(root)) {
            mid = root.left.val;
        }
        return left+right+mid;
    }

    public boolean judge(TreeNode root) {
        return root != null && root.left != null && root.right == null;

    }
}