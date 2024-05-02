package tx;

public class tx122 {
}

/**
 * 买入股票的最佳时机 实际上 每天
 */
class Solution {
    public int maxProfit(int[] prices) {

        int len = prices.length;

        int res = 0;

        for (int i = 1; i < len; i ++) {

            if (prices[i] - prices[i-1] > 0) {
                res += prices[i];
            }
        }

        return res;
    }
}
