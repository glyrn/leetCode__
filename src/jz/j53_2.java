package jz;

public class j53_2 {
}
class Solution {
    public int missingNumber(int[] nums) {

        int j =0;
        boolean flag = true;
        for (int i = 0; i < nums.length; i ++) {
            if (i != nums[i]) {
                j = i;
                flag = false;
                break;
            }

            if (i == nums.length - 1 && flag) {
                j = i + 1;
            }
        }

        return j;
    }
}