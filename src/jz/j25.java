package jz;

import link.ListNode;

public class j25 {
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// 迭代
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

//        终止条件
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;

        }else  {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}