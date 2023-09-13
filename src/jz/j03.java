package jz;

import java.util.HashSet;
import java.util.Set;

public class j03 {
}
class Solution {
    public int findRepeatNumber(int[] nums) {

        Set<Integer> res = new HashSet<>();

        int r = -1;

        for (int i : nums) {
            if (res.contains(i)) {
                r = i;
                break;

            }else {
                res.add(i);
            }
        }


        return r;

    }
}