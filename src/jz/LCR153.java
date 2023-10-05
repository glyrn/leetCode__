package jz;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.List;

public class LCR153 {
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
//class Solution {
//    LinkedList<Integer> path = new LinkedList<>();
//
//    LinkedList<List<Integer>> res = new LinkedList<>();
//
//    public List<List<Integer>> pathTarget(TreeNode root, int target) {
//        recur(root, target);
//        return res;
//    }
//
//    public void recur(TreeNode root, int target) {
//        // 终止条件
//        if (root == null) {
//            return;
//        }
//        path.add(root.val);
//        target -= root.val;
//        // 判断叶子节点
//        if (target == 0 && root.left == null && root.right == null) {
//            res.add(path);
//        }
//        res(root.left, target);
//        res(root.right, target);
//
//        path.removeLast();
//    }
//}




class Solution {
    LinkedList<Integer> path = new LinkedList<>();

    LinkedList<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> pathTarget(TreeNode root, int target) {
        recur(root, target);
    }

    public void recur (TreeNode root, int target) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        target -= root.val;

        if (target == 0 && root.left == null && root.right == null) {
            res.add(new LinkedList<>(path)); // 复制一手
        }
        recur(root.left, target);
        recur(root.right, target);

        path.removeLast();

    }
}