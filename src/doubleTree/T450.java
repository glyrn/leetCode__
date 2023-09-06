package doubleTree;

import javax.swing.tree.TreeNode;

public class T450 {
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
    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null) {
            return root;
        }


        if (root.val == key) {
            // 没有孩子
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left != null && root.right == null) {
                return root.left;
            } else if (root.left == null && root.right != null) {
                return root.rgiht;
            } else {

                TreeNode cur = root;
                TreeNode p = root.right;

                while (p.left != null) {
                    p = p.left;
                }

                p.left = cur.left;

                return root.right;

            }

        }

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        }
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }


        return root;
    }


}