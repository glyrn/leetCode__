package doubleTree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class T102 {
}

class Solution {
    public List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();


        if (root == null) {
            return ;
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int len = queue.size();
            while (len > 0) {
                TreeNode q = queue.poll();
                list.add(q.val);
                if (q.left!=null){
                    queue.offer(q.left);
                }
                if (q.right!=null){
                    queue.add(q.right);
                }
                len--;
            }
            result.add(list);
        }
        return result;


    }


}