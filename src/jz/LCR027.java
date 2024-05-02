package jz;

import link.ListNode;

import java.util.ArrayList;
import java.util.List;

public class LCR027 {
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
    public boolean isPalindrome(ListNode head) {


        List<Integer> list = new ArrayList<>();

        ListNode cur = head;

        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }

        int i = 0;
        int j = list.size()-1;

        while (i < j) {
            if (!list.get(i).equals(list.get(j))){
                return false;
            }
            i ++;
            j --;
        }

        return true;
    }
}