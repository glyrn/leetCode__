package link;

public class l19 {
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode p, q;
        ListNode Head = new ListNode(-1);
        p = Head;
        q = Head;
        Head.next = head;
//        if (q.next.next == null){
//            return null;
//        }

        for (int i = 0; i < n; i++) {
            q = q.next;
        }
        while (q.next != null) {
            q = q.next;
            p = p.next;
        }
        ListNode temp;
        temp = p.next.next;
        p.next = temp;
        return Head.next;

    }
}

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}