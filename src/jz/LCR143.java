package jz;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;

public class LCR143 {
}
class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {

        // 终止条件

        if (A == null || B == null) {
            return false;
        }

        return re(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);


    }
    /*
        判断B是否是A的子结构,其中B子结构的起点是A的根节点
     */
    private boolean re(TreeNode A, TreeNode B) {
        // 如果B走完了，说明完成查找，B为A的子结构
        if (B == null) {
            return true;
        }
        // 若B不为空
        if(A == null || A.val != B.val) {
            return false;
        }

        // 当A与B的值相等 需要先判断B的左子树是否等于A的右子树  以及右边
        return re(A.left, B.left) && re(A.right, B.right);

    }
}