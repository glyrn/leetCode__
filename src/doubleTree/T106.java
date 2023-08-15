package doubleTree;

import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.Map;

public class T106 {
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

    Map<Integer, Integer> map;

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        map = new HashMap<>();


        for (int i = 0; i < inorder.length; i++) {

            map.put(inorder[i], i);

        }

        return findRoot(inorder, 0, inorder.length, postorder, 0, postorder.length);


    }


    public TreeNode findRoot(int[] inorder, int inbegin, int inend, int[] postorder, int postbegin, int postend) {

        // 如果数组不符合左开右闭 则不合法
        if (inbegin >= inend || postbegin >= postend) {
            return null;
        }

        int rootIndex = map.get(postorder[postend - 1]);
        //构造节点
        TreeNode root = new TreeNode(inorder[rootIndex]);

        int lenOfleft = rootIndex - inbegin;


        root.left = findRoot(inorder, inbegin, rootIndex, postorder, postbegin, postbegin + lenOfleft);

        root.right = findRoot(inorder, rootIndex + 1, inend, postorder, postbegin + lenOfleft, postend - 1);


        return root;

    }
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
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return find(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }

    public TreeNode find(int[] inorder, int inbegin, int inend, int[] postorder, int postbegin, int postend) {
        if (inbegin >= inend || postbegin >= postend) {
            // 数组越界
            return null;
        }

        int rootIndex = map.get(postorder[postend - 1]);

        // 构造根节点
        TreeNode root = new TreeNode(inorder[rootIndex]);

        int lenOfLeft = rootIndex - inbegin;

        root.left = find(inorder, inbegin, rootIndex, postorder, postbegin, postbegin + lenOfLeft);

        root.right = find(inorder, rootIndex + 1, inend, postorder, postbegin + lenOfLeft, postend - 1);

        return root;

    }
}


