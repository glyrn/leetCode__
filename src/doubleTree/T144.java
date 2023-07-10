package doubleTree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class T144 {
}

class Solution1 {

    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        tra(root, arrayList);
        return arrayList;
    }

    public void tra(TreeNode root, ArrayList<Integer> arrayList) {
        if (root == null) return;
        arrayList.add(root.val);
        tra(root.left, arrayList);
        tra(root.right, arrayList);
    }
}

/**
 * 下面是非递归实现
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return null;
        }
        stack.push(root.val);
        while(!stack.isEmpty()){
            TreeNode pop = stack.pop();
            result.add(pop.val);
            if (pop.right != null){
                stack.push(root.right);
            }
            if (pop.left!= null){
                stack.push(root.left);
            }
        }
        return result;
    }
}