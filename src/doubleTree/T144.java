package doubleTree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class T144 {
}

class Solution {

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