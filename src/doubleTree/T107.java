package doubleTree;

import javax.swing.tree.TreeNode;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class T107 {
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
    public List<List<Integer>> result = new LinkedList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        if (root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while ((!queue.isEmpty())){
            int len = queue.size();
            List<Integer> list = new LinkedList<>();
            while(len > 0){
                TreeNode q = queue.poll();
                list.add(q.val);
                if (q.left != null){
                    queue.offer(q.left);
                }else if (q.right != null){
                    queue.offer(q.right);
                }
                len--;
            }
            result.add(list);
        }
        Collections.reverse(result);

        return result;

    }
}