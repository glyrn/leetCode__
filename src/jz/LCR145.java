package jz;

import javax.swing.tree.TreeNode;

public class LCR145 {
}
// 需要比对左右两个节点的左右对应位置的值是否相等

class Solution {
    public boolean checkSymmetricTree(TreeNode root) {

        if (root == null) {
            return true;
        }

        return re(root.left, root.right);


    }

    boolean re(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        return re(q.left, p.right)&& re(q.right, p.left);
    }

}