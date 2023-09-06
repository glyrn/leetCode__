package jz;

public class j58 {
}
class Solution {
    public String reverseLeftWords(String s, int n) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0;i<n;i++) {
            stringBuilder.append(s.charAt(i));
        }
        s = s.substring(n);

        return s + stringBuilder.toString();
    }
}