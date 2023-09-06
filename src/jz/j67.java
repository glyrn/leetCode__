package jz;

public class j67 {
}

class Solution {
    public int strToInt(String str) {

        boolean numflag = true;

        boolean fu = false;

        int res = 0;

        str = str.trim();


        char[] chars = str.toCharArray();
        if (chars.length == 0) {
            return 0;
        }

        // 判断符号位置
        // 如果是负数 就需要从第二位开始判断
        // 如果是正数，就需要从第一位开始判断
        int judge = 1;
        if (chars[0] == '-') {
            fu = true;
        } else if (chars[0] != '+') {
            judge = 0;

        }

        // 开始判断数字
        for (int j = judge; j < chars.length; j++) {
            // 遇到非数字直接结束
            if (chars[j] > '9' || chars[j] < '0') {
                break;
            }
            res = res * 10 + chars[j] - '0';
        }

        return  fu ? res*-1 : res;
    }
}
