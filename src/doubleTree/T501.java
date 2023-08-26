package doubleTree;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class T501 {
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
    int count = 0;
    int maxCount = 0;
    TreeNode pre = null;
    List<Integer> list = new ArrayList<>();
    public void find(TreeNode cur) {
        if (cur == null) {
            return;
        }
        find(cur.left);
        if (pre == null) {
            count = 1;
        }
        else if (cur.val == pre.val) {
            count ++;
        } else {
            count = 1;
        }
        pre = cur;

        if (count == maxCount) {
            list.add(cur.val);
        }
        if (count > maxCount) {
            maxCount = count;
            list.clear();
            list.add(cur.val);
        }
        find(cur.right);
    }
    public int[] findMode(TreeNode root) {


        find(root);
        int size = list.size();

        // turn arrayList to []
        // use stream
        int[] rtn = list.stream().mapToInt(Integer::intValue).toArray();

        return rtn;

    }


}