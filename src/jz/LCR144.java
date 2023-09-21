package jz;

import javax.swing.tree.TreeNode;

public class LCR144 {
}



class Solution {
    public TreeNode mirrorTree(TreeNode root) {

        return re(root);
    }

    public TreeNode re(TreeNode cur) {
        if (cur == null) {
            return null;
        }
        TreeNode temp = cur.left;
        root.left = re(cur.right);
        root.right = re(temp);
        return cur;
    }
}