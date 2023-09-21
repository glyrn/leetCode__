package jz;

import link.ListNode;

import java.util.Arrays;

public class LCR077 {
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {

        int len = 0;
        ListNode cur = head;
        while (cur.next != null) {
            len ++;
            cur = cur.next;
        }
//        len ++;



        int[] temp = new int[len];
        ListNode t = head;
        for (int i = 0; i < len; i ++) {

            temp[i] = t.val;
            t = t.next;

        }
        Arrays.sort(temp);
        ListNode j = head;
        for (int i = 0; i < len; i ++) {
            t.val = temp[i];
            t = t.next;
        }

        return head;

    }
}
/*
    递归排序
 */