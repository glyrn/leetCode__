package jz;

public class j57 {
}

clpackage jz;

// @author zhangyong
// @date 2021/6/8
public class j58_1 {
    // 定义一个类
    public class Solution {
        // 定义一个方法
        public String reverseWords(String s) {
            // 定义一个字符串数组
            String[] str = s.split(" ");
            // 定义一个字符串构建器
            StringBuilder sb = new StringBuilder();
            // 遍历字符串数组
            for (int i = str.length - 1; i >= 0; i--) {
                // 如果字符串数组中的元素不为空
                if (str[i].length()!= 0) {
                    // 将字符串数组中的元素拼接到字符串构建器中
                    sb.append(str[i]);
                    // 将空格拼接到字符串构建器中
                    sb.append(" ");
                }

class Solution {
    public String reverseWords(String s) {

        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i].length() != 0) {
                sb.append(str[i]);
                sb.append(" ");
            }

            // 返回字符串构建器中的字符串
            return sb.toString().trim();

        }
        return sb.toString().trim();

    }
}

、         ret[0] = nums[i];
//                    ret[1] = nums[j];
//                }
//            }
//        }
//
//        return ret;
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int sum = nums[start] + nums[end];

            if (sum == target) {
                return new int[]{nums[start], nums[end]};
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return null;
    }
}