package jz;

import link.ListNode;

public class j18 {
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
    public ListNode deleteNode(ListNode head, int val) {

        ListNode cur = head;
        ListNode a = cur;

        // 先判断需要删除头节点的情况
        if (head.val == val) {
            return head.next;
        }

        ListNode pre = null;

        while (cur != null) {

            if (cur.val == val) {
                // 删除节点
                pre.next = cur.next;
                break;
            }
            pre = cur;
            cur = cur.next;
        }
        return a;
    }
}