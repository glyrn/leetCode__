package jz;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

//[BFS] 广度优先搜索
class Solution {
    public int[] levelOrder(TreeNode root) {

        if (root == null) {
            return new int[0];
        }

        ArrayList<Integer> ans = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>(){{
            add(root);
        }};

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            ans.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        int[] a = new int[ans.size()];

        for (int i = 0; i < a.length; i ++) {
            a[i] = ans.get(i);
        }

        return a;

    }
}