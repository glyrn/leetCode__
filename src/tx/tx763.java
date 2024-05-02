package tx;

import java.util.*;

public class tx763 {
}
class Solution {
    public List<Integer> partitionLabels(String s) {
        // 遍历每一个数字的边界　然后回文
        HashMap<Character, Integer> map = new HashMap<>();
        List<Integer> rtn = new ArrayList<>();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i ++) {
            map.put(chars[i], i);
        }

        // 计数器
        int cnt = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < chars.length; i ++) {
            set.add(chars[i]);
            cnt ++;
            int char = map.get(chars[i]);
            // 如果当前位置与最大位置符合 就可以划分边界
            if (i == char) {
                set.remove(chars[i]);
                if (set.isEmpty()) {
                    // 说明找到了当前划分的边界
                    rtn.add(cnt);
                    cnt = 0;
                }
            }
        }
        return rtn;


    }
}