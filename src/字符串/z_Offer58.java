package 字符串;

public class z_Offer58 {
}

class Solution {
    public String reverseLeftWords(String s, int n) {
        int len = s.length();
        char[] chars = new char[len];
        for (int i = n; i < len; i++) {
            chars[i - n] = s.charAt(i);
        }
        for (int i = 0; i < n; i++) {
            chars[i + len - n] = s.charAt(i);
        }
        return String.valueOf(chars);
    }
}