package jz;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class j32_3 {
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> res;

    public List<List<Integer>> levelOrder(TreeNode root) {
        boolean flag = false;
        if (root == null) {
            return new ArrayList<>();
        }
        res = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>() {{
            add(root);
        }};
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            if (flag == true) {
                list = re(list);
            }
            flag = !flag;
            res.add(list);
        }
        return res;
    }

    public List<Integer> re(List<Integer> list) {
        List<Integer> res = new ArrayList<>();
        list.stream().forEach(
                lis -> {
                    res.add(0, lis);
                }
        );
        return res;
    }


}