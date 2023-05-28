package link;

public class l24 {
}

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode Head = new ListNode(0);
        Head.next = head;
        ListNode cur = Head;
        ListNode three;
        ListNode two;
        ListNode one;

        while (cur.next != null && cur.next.next != null) {
            one = cur.next;
            two = cur.next.next;
            three = cur.next.next.next;
            // 1
            cur.next = two;  //三步骤  0 - 2 | 2 - 1 | 1 - 3
            //2
            two.next = one;
            //3
            one.next = three;

            cur = cur.next.next;
        }
        return Head.next; // 移两位
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
