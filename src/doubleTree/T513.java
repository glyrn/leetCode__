package doubleTree;

import javax.swing.tree.TreeNode;

public class T513 {
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
/*
        这个是用层次遍历法 取每一层得到第一个数
 */
//class Solution {
//    public int findBottomLeftValue(TreeNode root) {
//        if (root == null) {
//            return 0;
//        }
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//
//        int result = root.val;
//
//        while (!queue.isEmpty()) {
//            int len = queue.size();
//            for (int i = 0; i < len; i++) {
//                TreeNode cur = queue.poll();
//                if (i == 0) {
//                    result = cur.val;
//                }
//                if (cur.left != null) {
//                    queue.add(cur.left);
//                }
//                if (cur.right != null) {
//                    queue.add(cur.right);
//                }
//            }
//        }
//        return result;
//    }
//}

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

/*
                下面使用迭代法
 */

class Solution {
    int Maxdeepth = Integer.MIN_VALUE;
    int result;

    public int findBottomLeftValue(TreeNode root) {
        if (root == null) {
            return 0;
        }
        tra(root, 0);
        return result;


    }

    public void tra(TreeNode root, int depth) {
        if (root.left == null && root.right == null) {
            Maxdeepth = depth;
            result = root.val;
        }
        if (root.left != null) {
            depth++;
            tra(root.left);
            depth--;
        }
        if (root.right != null) {
            depth++;
            tra(root.right, depth);
            depth--;
        }

    }
}