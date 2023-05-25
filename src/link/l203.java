package link;



public class l203 {
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode Head = new ListNode(0);
        Head.next = head;
        ListNode p = Head;
        while (p.next != null){
            if (p.next.val == val){
                p.next = p.next.next;
            }else {
                p = p.next;
            }
        }
        return Head.next;
    }
}

class ListNode {
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