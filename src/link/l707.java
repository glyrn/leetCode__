package link;

public class l707 {
}


class MyLinkedList {
    int size;
    ListNode head;

    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    public int get(int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception();
        }
        ListNode cur = head;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) throws Exception {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) throws Exception {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception();
        }
        size++;
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        ListNode temp = new ListNode(val);
        temp = pre.next;
        pre.next = temp;
    }

    public void deleteAtIndex(int index)throws Exception {
        if (index < 0 || index > size) {
            throw new Exception();
        }
        ListNode temp = head;
        for (int i = 0; i < index; i ++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = Integer.parseInt(null);
        next = null;
    }

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */