package 字符串;

public class z541 {
}


class Solution {

    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i += 2 * k) {
            //如果剩余字符小于2k 但是大于k 则反转前k个字符
            if (i + k <= chars.length) {
                reverse(chars, i, i + k - 1);
                continue;
            }
            //如果剩余字符小于k 则全部反转
            reverse(chars, i, chars.length - 1);
        }
        return new String(chars);
    }

    public void reverse(char[] chars, int i, int j) {
        for (; i < j; i++, j--) {
            char temp = chars[j];
            chars[j] = chars[i];
            chars[i] = temp;
        }
    }
}

/*
class Solution {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        // 1. 每隔 2k 个字符的前 k 个字符进行反转
        for (int i = 0; i< ch.length; i += 2 * k) {
            // 2. 剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符
            if (i + k <= ch.length) {
                reverse(ch, i, i + k -1);
                continue;
            }
            // 3. 剩余字符少于 k 个，则将剩余字符全部反转
            reverse(ch, i, ch.length - 1);
        }
        return  new String(ch);

    }
    // 定义翻转函数
    public void reverse(char[] ch, int i, int j) {
    for (; i < j; i++, j--) {
        char temp  = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    }
}
 */