package jz;

public class l1768 {
}
class Solution {
    public String mergeAlternately(String word1, String word2) {

        int size1 = word1.length();
        int size2 = word2.length();

        StringBuilder stringBuilder = new StringBuilder("");

        for (int i = 0; i < min(size1, size2); i ++) {
            stringBuilder.append(word1.charAt(i)).append(word2.charAt(i));
        }

        String str = stringBuilder.append(word1.substring(min(size1, size2))).append(word2.substring(min(size1, size2))).toString();

        return str;
    }

    int min(int a, int b) {
        return a > b ? b : a;
    }
}