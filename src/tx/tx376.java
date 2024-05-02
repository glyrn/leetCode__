package tx;

public class tx376 {
}

/**
 * 给一段数组 找到有几个波峰
 */
class Solution {
    public int wiggleMaxLength(int[] nums) {

        /**
         * 每一个节点都记录当前的数值
         *
         * 递推 波峰遇到的是波谷 相反 波谷遇到的是波峰
         **/

        // 1 - f 0 - g
        int dp[][] = new int[1000][2];

        int length = nums.length;

        for (int i = 0; i < length; i ++) {
            if (i == 0) {
                dp[0][0] = 1;
                dp[0][1] = 1;
                continue;
            }
            dp[i][0] = 1;
            dp[i][1] = 1;
            // 遍历数组
            for (int j = 0; j < i; j ++) {
                // 大于 波峰
                if (nums[i] > nums[j]) {
                    dp[i][1] = Math.max(dp[i][1], dp[j][0] + 1);
                }
                // 小于 波谷
                if (nums[i] < nums[j]) {
                    dp[i][0] = Math.max(dp[i][0], dp[j][1] + 1);
                }
            }
        }

        return Math.max(dp[length][1], dp[length][0]);
    }
}