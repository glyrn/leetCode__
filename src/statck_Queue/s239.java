package statck_Queue;

import java.util.Deque;
import java.util.LinkedList;

public class s239 {
}

class Solution {
    // 单调队列
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> queue = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        int index = 0;

        //首先将第一个窗口输入
        for (int i = 0; i < k; i++) {
            while (!queue.isEmpty() && queue.peekLast() < nums[i]) {
                queue.removeLast();
            }
            queue.offerLast(nums[i]);
        }
        // 填入最大值 将队头元素存入
        res[index++] = queue.peekFirst();
        // 开始移动窗口

        for (int i = k; i < nums.length; i++) {
            // 去除周期失效元素
            if (nums[i - k] == queue.peekFirst()) {
                queue.removeFirst();
            }
            while (!queue.isEmpty() && queue.peekLast() < nums[i]) {
                queue.removeLast();
            }
            queue.offerLast(nums[i]);
            res[index++] = queue.peekFirst();
        }
        return res;

    }
}

/**
 * nums[i - k] 表示滑动窗口中移出的元素，也就是窗口最左边的元素。
 *
 * queue.peekFirst() 返回队列中的第一个元素，也就是当前滑动窗口中的最大值。
 *
 * 如果 nums[i - k] 等于队列中的最大值，说明最大值将离开滑动窗口，所以需要将它从队列的头部移除，以保持队列中的元素都在当前窗口范围内。
 *
 * 这样做的目的是为了确保队列中的元素都是当前滑动窗口中的元素，即队列中的第一个元素始终是窗口中的最大值。通过移除离开窗口的最大值，可以确保队列中的元素是有效的，而不包含已经不在窗口范围内的元素。这样，每次将当前元素加入队列时，队列中的第一个元素就是当前窗口的最大值。
 */