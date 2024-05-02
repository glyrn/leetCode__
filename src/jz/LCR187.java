package jz;

public class LCR187 {
}

/**
 * 1. 循环报数 报到的元素踢出队列
 */
class Solution {
    public int iceBreakingGame(int num, int target) {

        if (num == 1) {
            return 0;
        }


        return (target + iceBreakingGame(num - -1, target)) % num;
    }
}
