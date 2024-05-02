package tx;

import java.util.Arrays;

public class tx455 {
}
class Solution {
    public int findContentChildren(int[] g, int[] s) {

        // g -- 小孩 s -- 饼干

        Arrays.sort(g);
        Arrays.sort(s);

        int start = 0;
        int count = 0;

        // 优先满足饼干
        for (int i = 0; i < s.length && start < g.length; i ++) {
            if(s[i] >= g[start]) {
                start ++;
                count ++;
            }
        }

        return count;
    }
}