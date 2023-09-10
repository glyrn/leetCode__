package jz;

import java.util.Stack;

public class j30 {
}

class MinStack {


    Stack<Integer> f;
    Stack<Integer> main;
    int x = Integer.MAX_VALUE;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        f = new Stack<>();
        main = new Stack<>();
        f.push(x);

    }

    public void push(int x) {

        main.push(x);
        // 辅助栈是用来储存最小元素值
        f.push(f.peek() > x ? x : f.peek());

    }

    public void pop() {

        main.pop();
        f.pop();
    }

    public int top() {

        return main.peek();
    }

    public int min() {
        return f.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */