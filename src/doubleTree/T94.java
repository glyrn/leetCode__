package doubleTree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T94 {
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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        resverse(root, arrayList);
        return arrayList;
    }
    public void resverse(TreeNode root, ArrayList<Integer> arrayList){

        if (root == null){
            return;
        }

        resverse(root.left, arrayList);

        arrayList.add(root.val);

        resverse(root.right,arrayList);
    }
}