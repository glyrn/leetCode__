package doubleTree;

import javax.swing.tree.TreeNode;

public class T226 {
}

//class Solution {
//    public TreeNode invertTree(TreeNode root) {
//        traval(root);
//        return root;
//    }
//
//    public void traval(TreeNode node){
//
//        if (node.left!= null || node.right != null){
//            swap(node.left, node.right);
//        }
//        traval(node.left);
//        traval(node.right);
//
//    }
//
//    public void swap(TreeNode a1, TreeNode a2){
//        TreeNode treeNode = null;
//        treeNode = a1;
//        a1 = a2;
//        a2 = treeNode;
//    }
//}
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;

    }
}