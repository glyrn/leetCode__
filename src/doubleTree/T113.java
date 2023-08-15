package doubleTree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class T113 {
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
    List<List<Integer>> rtn = new LinkedList<>();
    Deque<Integer> path = new LinkedList<Integer>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        dfs(root, targetSum);

        return rtn;
    }

    public void dfs(TreeNode root, int targetSun) {
        if (root == null) {
            return;
        }
        path.offerLast(root.val);
        targetSun -= root.val;
        if (root.left == null && root.right == null && targetSun == 0){
            rtn.add(new LinkedList<Integer>(path));
        }
        dfs(root.left,targetSun);
        dfs(root.right,targetSun);

        path.pollLast();

    }
}