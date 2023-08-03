package doubleTree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class T257 {
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
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> res = new ArrayList<>();
//        if (root == null) {
//            return res;
//        }
//        List<Integer> path = new ArrayList<>();
//        travel(res, path, root);
//
//        return res;
//
//    }
//
//    public void travel(List<String> res, List<Integer> path, TreeNode root){
//
//        path.add(root.val);
//
//        // 到达叶子节点
//        if (root.left == null && root.right == null) {
//            StringBuilder stringBuilder = new StringBuilder();
//            for (int i = 0; i < path.size() - 1; i ++) {
//                stringBuilder.append(path.get(i)).append("->");
//            }
//            stringBuilder.append(path.get(path.size()));
//            res.add(stringBuilder.toString());
//            return;
//        }
//
//        // 单层逻辑
//        if (root.left != null) {
//            travel(res, path, root.left);
//            path.remove(path.size()-1);
//        }
//
//        if (root.right != null) {
//            travel(res, path, root.right);
//            path.remove(path.size() -1);
//        }
//
//    }
//}

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        List<Integer> path = new ArrayList<>();

        travel(result, path, root);

        return result;


    }

    public void travel(List<String> res, List<Integer> path, TreeNode root) {

        path.add(root.val);

        if (root.left == null && root.right == null) {

            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < path.size() - 1; i++) {
                stringBuilder.append(path.get(i)).append("->");
            }
            stringBuilder.append(path.get(path.size()) - 1);

            res.add(stringBuilder.toString());
        }

        // 单层逻辑

        if (root.left != null) {
            travel(res, path, root.left);
            path.remove(path.size()-1);
        }
        if (root.right != null) {
            travel(res, path, root.right);
            path.remove(path.size()-1);
        }

    }

}