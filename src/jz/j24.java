package jz;

public class j24 {
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
    public ListNode reverseList(ListNode head) {
        ListNode pre = new ListNode();
        ListNode cur;


        cur = head;
        while (cur != null) {
            ListNode temp = cur.next;

            cur.next = pre;
            pre = cur;
            cur = temp;

        }

        return cur;
    }
}