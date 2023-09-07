package jz;

import link.ListNode;

public class j22 {
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p = head;
        ListNode q = p;

        // 快指针
        for (int i = 0; i < k; i ++) {
            q = q.next;
        }
        while (q != null) {
            p = p.next;
            q = q.next;
        }
        return p;
    }
}