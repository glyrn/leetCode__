package jz;

import link.ListNode;

public class j52 {
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;
        ListNode b = headB;

        if (a == null || b == null) {
            return null;
        }

        int lena = len(headA);
        int lenb = len(headB);

        if (lena > lenb) {
            for (int i = 0; i < lena-lenb; i ++) {
                a = a.next;
            }
        }else if (lena< lenb){
           for (int i = 0; i < lenb - lena; i ++) {
               b = b.next;
           }
        }

        ListNode ret = null;
        // 开始判断
        if (a == b) {
            return a;
        }
        while(a.next != null){
            if (a.next == b.next) {
                ret = a.next;
                break;
            }
            a = a.next;
            b = b.next;
        }
        return ret;
    }

    int len(ListNode root) {
        int i = 0;
        while(root != null) {
            i ++;
            root = root.next;
        }
        return i;
    }
}