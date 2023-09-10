package jz;

import java.util.Deque;
import java.util.LinkedList;

public class j59 {
}


// 滑动窗口题解

/**
 *  思路
 *    1. 维护一个双端队列
 *    2. 队列首部存放的是滑动窗口的最大值
 *    3. 在入队过程中，如果待加入的值比队尾元素大，就将队尾元素出队
 *    4. 在入队前，先将过期的值从队首出队
 *    5. 滑动窗口的右边界向右移动，将新的值入队
 *    6. 滑动窗口的左边界向右移动，将队首元素出队
 *    7. 返回结果数组
 *
 *  复杂度
 *    时间复杂度：O(n)
 *    空间复杂度：O(n)
 */
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums.length == 0) {
            return new int[0];
        }
        Deque<Integer> dq = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 0, j = 1 - k; i < nums.length; i ++, j ++) {
            // 删除滑动窗口中过期的值
            if (j > 0 && dq.peekFirst() == nums[j-1]) {
                dq.removeFirst();
            }
            // 保持滑动窗口递减
            // 刚加入的元素
            while (!dq.isEmpty() && dq.peekLast() < nums[i]) {
                dq.removeLast();
            }
            // 进入队列
            dq.addLast(nums[i]);

            // 记录最大值
            if (j >= 0) {
                res[j] = dq.peekFirst();
            }
        }

        return res;
    }
}