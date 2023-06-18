package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class h15 {

}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> array = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return array;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            } //对a去重
            int left = i + 1;
            int right = nums.length - 1;
            while (right > left) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    array.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (right > left && nums[right] == nums[right - 1]) {
                        right--; //对c去重
                    }
                    while (right > left && nums[left] == nums[left + 1]) {
                        left++;  // 对b去重
                    }
                    //继续找
                    left ++;
                    right --;
                }
            }

        }
        return array;
    }
}