package jz;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class j59_2 {
}

/**
 * 总结
 *
 * 对于单调队列问题
 *
 * 模板如下
 *
 * 首先 先创建一个双端队列
 *
 * 为了维持队列中的头部永远是滑动窗口的最大值   需要在每次入队列之前 从双端队列的最末尾端开始检查
 *
 * 如果发现数字比待放入的要小 就直接弹出 知道找到比他大的数 就停止比较
 *
 *
 */

class MaxQueue{
    private Deque<Integer> queue;
    private Deque<Integer> help;


    public MaxQueue() {
        queue = new ArrayDeque<>();
        help = new ArrayDeque<>();
    }



    public int max_value() {
        return queue.isEmpty() ? -1 : help.peekFirst();
    }


    public void push_back(int value) {
        queue.offer(value);
        while(!help.isEmpty() && value>help.peekLast()) {
            // 放入的值需要比上一个值更大的情况下 删除比这个带放入值更小的呃值 从后面删除
            help.pollLast();
        }

        help.offerLast(value);

    }

    public int pop_front() {
        if (queue.isEmpty()) {
            return -1;
        }

        int val = queue.pop();

        if (help.peekFirst() == val) {
            help.pollFirst();
        }


        return val;
    }


}










