package link;

public class l142 {
}

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){  // 存在环
                ListNode index = head; //从头节点开始 逐步往后遍历 同时之前相遇的指针同时往后移 再次相遇的时候就在环相遇
                while (index != fast) {
                    index = index.next;
                    fast = fast.next;
                }
                return index;
            }
        }
        return null;
    }
}