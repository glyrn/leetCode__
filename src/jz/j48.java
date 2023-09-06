package jz;

import java.util.HashMap;

public class j48 {
}
class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();



        int p = 0;
        int q = 0;
        int max = 1;

        for (;q<s.length();q++) {
            char c = s.charAt(q);

            // 判断是否重复
            if (map.containsKey(c)) {
                // 更新起点
                p = map.get(c);
            }
            map.put(c, q);
            q++;
            max = max(max, q- p + 1);
        }

        return max;

    }

    int  max(int a, int b) {
        return a > b ? a : b;
    }
}