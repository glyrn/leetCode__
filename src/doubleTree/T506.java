package doubleTree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class T506 {
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
    List<Integer> list = new ArrayList<>();

    public int getMinimumDifference(TreeNode root) {

        travel(root);
        if (list.size() < 2) {
            return 0;
        }
        int rtn = Integer.MAX_VALUE;

        for (int i = 1; i < list.size(); i++) {
            rtn = min(rtn, list.get(i) - list.get(i - 1));
        }
        return rtn;
    }

    public int min(int p, int q) {
        return p > q ? q : p;
    }

    public void travel(TreeNode root) {
        if (root == null) {
            return;
        }
        travel(root.left);
        list.add(root.val);
        travel(root.right);


    }
}