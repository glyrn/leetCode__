package doubleTree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class T145 {
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
//class Solution {
//    public List<Integer> postorderTraversal(TreeNode root) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        reverse(root, arrayList);
//        return arrayList;
//    }
//
//    public void reverse(TreeNode root, ArrayList<Integer> arrayList) {
//        if (root == null) {
//            return;
//        }
//        reverse(root.left, arrayList);
//        reverse(root.right, arrayList);
//        arrayList.add(root.val);
//    }
//}

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arrayList = new ArrayList<>();
        reverse(root, arrayList);
        return arrayList;
    }

    public void reverse(TreeNode root, List<Integer> arrayList) {
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return;
        }
        TreeNode cur = root;
        stack.push(root);
        while (!stack.isEmpty()) {
             cur = stack.pop();
             arrayList.add(cur.val);
             if (cur.left != null){
                 stack.push(cur.left);
             }else if (cur.right!=null){
                 stack.push(cur.right);
             }
        }
        Collections.reverse(arrayList);
    }
}