package jz;

import java.util.ArrayList;

public class LCR180 {
}
class Solution {
    public int[][] fileCombination(int target) {

        // 左边界
        int left = 1;
        // 右边界
        int right = 1;

        int sum = 0;

        ArrayList<int[]> res= new ArrayList<>();
        while (left <= target / 2) {
            if (sum < target) {
                // 右边界向右移动
                sum += right;
                right ++;
            } else if (sum > target) {
                // 左边界向右移动
                sum -= left;
                left ++;
            }else {
                // 等于情况
                int[] ints = new int[right - left];
                for (int k = left; k < right; k ++) {
                    ints[k-left] = k;
                }
                res.add(ints);
                sum -=left;
                left ++;

            }
        }
        return res.toArray(new int[res.size()][]);
    }
}