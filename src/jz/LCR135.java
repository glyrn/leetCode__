package jz;

import java.util.ArrayList;

public class LCR135 {

}
class Solution {
    public int[] countNumbers(int cnt) {
        int end = (int)Math.pow(10, cnt) - 1;
        int[] res = new int[end];
        for(int i = 0; i < end; i++)
            res[i] = i + 1;
        return res;
    }
}
