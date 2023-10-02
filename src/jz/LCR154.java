package jz;

import org.w3c.dom.Node;

import java.util.HashMap;

public class LCR154 {
}
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        HashMap<Node, Node> nodeNodeHashMap = new HashMap<>();

        Node cur = head;

        while (cur != null) {
            Node node = new Node(cur.val);
            nodeNodeHashMap.put(cur, node);
            cur = cur.next;
        }

        // 重述链表
        cur = head;
        while (cur.next != null) {
            nodeNodeHashMap.get(cur).next = nodeNodeHashMap.get(cur.next);
            nodeNodeHashMap.get(cur).random = nodeNodeHashMap.get(cur.random);
            cur = cur.next;
        }

        return nodeNodeHashMap.get(head);
    }
}