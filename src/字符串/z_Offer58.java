package 字符串;

public class z_Offer58 {
}

//class Solution {
//    public String reverseLeftWords(String s, int n) {
//        int len = s.length();
//        char[] chars = new char[len];
//        for (int i = n; i < len; i++) {
//            chars[i - n] = s.charAt(i);
//        }
//        for (int i = 0; i < n; i++) {
//            chars[i + len - n] = s.charAt(i);
//        }
//        return String.valueOf(chars);
//    }
//}
class Solution { //优化
    public String reverseLeftWords(String s, int n) {
        int len = s.length();
        StringBuilder stringBuilder = new StringBuilder(s);
        reverse(stringBuilder, 0, n-1);
        reverse(stringBuilder, n, len-1);
        reverse(stringBuilder, 0, len-1);
        return String.valueOf(stringBuilder);
    }

    public void reverse(StringBuilder s, int start, int end){
        while(start<end){
            char temp = s.charAt(start);
            s.setCharAt(start, s.charAt(end));
            s.setCharAt(end, temp);
            start++;
            end--;
        }
    }
}