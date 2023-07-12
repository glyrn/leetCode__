package doubleTree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class T637 {
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
    public List<Double> result = new ArrayList<>();

    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return result;
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            LinkedList<Integer> list = new LinkedList<>();
            while (len > 0) {
                TreeNode cur = queue.poll();
                list.add(cur.val);
                if (cur.left!= null){
                    queue.offer(cur.left);
                }
                if ((cur.right!=null)){
                    queue.offer(cur.right);
                }
                len--;
            }
            result.add(avg(list));
        }
        return result;

    }

    public Double avg(LinkedList<Integer> list) {
        Double sum = 0d;
        for (int i :
                list) {
            sum += i;
        }
        return sum / list.size();
    }
}