package jz;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;

public class LCR174 {
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
    LinkedList<TreeNode> path = new LinkedList<>();
    public int findTargetNode(TreeNode root, int cnt) {

        if (root == null) {
            return -1;
        }

        dfs(root);

        return path.get(cnt-1);



    }

    void dfs(TreeNode cur) {
        if (cur == null) {
            return ;

        }

        dfs(cur.right);
        path.add(cur);
        dfs(cur.left);
    }
}