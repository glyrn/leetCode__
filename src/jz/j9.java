package jz;

import java.util.Stack;

public class j9 {
}


class CQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public CQueue() {

    }

    // 入队
    // 将元素加入栈1
    public void appendTail(int value) {

        stack1.push(value);

    }
    // 出栈
    // 首先判断栈2是否为空，如果是空，就把栈1元素全部出栈，然后入栈到栈2，如果栈1也空，则返回-1
    // 否则，直接出栈
    public int deleteHead() {
        if (stack2.isEmpty()) {
            exchange(stack1, stack2);
        }

        return stack2.isEmpty() ? -1 : stack2.pop();
    }

    // 将栈1的元素出栈，依次入栈到栈2
    public void exchange(Stack<Integer> stack1, Stack<Integer> stack2) {
        // 运行这个函数的前提是 栈2已经空，才需要栈1出栈到栈2
        // 否则直接出栈 把栈的栈顶元素出栈
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
}


/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
