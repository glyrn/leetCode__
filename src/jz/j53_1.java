package jz;

import java.util.HashMap;
import java.util.Map;

public class j53_1 {
}
class Solution {
    public int search(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i ,map.getOrDefault(i, 0)+1);
        }

        return map.getOrDefault(target, 0);
    }
}