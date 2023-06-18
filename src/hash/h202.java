package hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class h202 {

}

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            n = getSum(n);
        }
        return n == 1;
    }

    public int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            int temp = (n % 10) * (n % 10);
            sum += temp;
            n = n/10;
        }
        return sum;
    }
}

