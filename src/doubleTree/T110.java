package doubleTree;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class T110 {
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
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (Math.abs(deep(root.left) - deep(root.right))>1){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);

    }




    public int deep(TreeNode node) {
        int times = 0;
        if (node == null) {
            return times;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()) {
            int len = queue.size();
            while (len > 0) {
                TreeNode cur = queue.poll();
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                if (cur.right != null) {
                    queue.offer(cur.right);
                }
                len--;
            }
            times++;
        }
        return times;
    }
}