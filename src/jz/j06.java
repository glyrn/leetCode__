package jz;

import java.util.ArrayList;
import java.util.Collections;

public class j06 {
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
    public int[] reversePrint(ListNode head) {


        ArrayList<Integer> list = new ArrayList<>();

        ListNode cur = head;

        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }

        Collections.reverse(list);

        int[] res = new int[list.size()];

        for (int i = list.size() - 1; i >= 0; i --) {
            res[i] = list.get(list.size()-i-1);
        }


        return res;
    }
}