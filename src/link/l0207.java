package link;

public class l0207 {
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode HeadA, HeadB;
        HeadA = new ListNode(-1);
        HeadB = new ListNode(-1);
        HeadA.next = headA;
        HeadB.next = headB;
        int lenA = 0, lenB = 0;
        ListNode a = HeadA;
        ListNode b = HeadB;
        while (a.next != null) {
            a = a.next;
            lenA++;
        }
        while (b.next != null) {
            b = b.next;
            lenB++;
        }
        a = HeadA;
        b = HeadB;
        if (lenA >= lenB) {
            for (int i = lenA - lenB; i > 0; i--) {
                a = a.next;
            }
        } else {
            for (int i = lenB - lenA; i > 0; i--) {
                b = b.next;
            }
        }
        while (a.next.val != b.next.val && a.next != null && b.next != null) {
            a = a.next;
            b = b.next;
        }
        if (a.next != null) {
            return a.next;
        } else {
            return null;
        }
    }
}

public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}