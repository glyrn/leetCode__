package jz;

import org.w3c.dom.Node;

public class LCR155 {
}
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
class Solution {
    Node pre;
    Node head;
    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return head;
        }

        dfs(root);
        head.left = pre;
        pre.right = head;



    }

    void dfs(Node root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        // 本层
        if (pre != null) {
            pre.right = root;
        }else {
            head = root;
        }
        root.left = pre;
        pre = root;


        dfs(root.right);
    }
}