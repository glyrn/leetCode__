package statck_Queue;

import java.util.Stack;

public class s232 {
}

class MyQueue {
    Stack<Integer> in;
    Stack<Integer> out;

    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        dumo();
        return out.pop();
    }

    public int peek() {
        dumo();
        return out.peek();
    }

    public boolean empty() {
        return in.empty() && out.empty();
    }

    private void dumo() {
        //out非空 把in栈的所有元素移到out栈中
        if (!out.isEmpty()) return;
        while (!in.isEmpty()) {
            out.push(in.pop());
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
