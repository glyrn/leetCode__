package statck_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class s225 {
}
class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }

    public void push(int x) {
        //倒序
        q2.offer(x);
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        Queue<Integer> temp;
        temp = q1;
        q1 = q2;
        q2 = temp;

    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}


/**
 * 入队操作  offer()  add() 前面不抛出异常 后面抛出异常
 *
 * 出队操作  pool() remove() 前面不抛出异常 后面抛出异常
 *
 * 获取队首元素  peek() element() 前面抛出异常 后面不跑出异常
 *
 */