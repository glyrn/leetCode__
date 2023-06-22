package 字符串;

public class z151 {
}

/**
 * 去除多余的空格
 * <p>
 * 反转整个字符串
 * <p>
 * 反转各个单词
 */
class Solution {
    public String reverseWords(String s) {
        StringBuilder stringBuilder = removeSpace(s);
        reverseString(stringBuilder, 0, stringBuilder.length()-1);
        reverseEachWord(stringBuilder);
        return stringBuilder.toString();
    }

    /**
     * 去除多余空格 规范化字符串
     *
     * @param s
     * @return
     */
    private StringBuilder removeSpace(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (s.charAt(start) == ' ') {
            start++;
        }
        while (s.charAt(end) == ' ') {
            end--;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (start <= end) {
            char c = s.charAt(start);
            if (c != ' ' || stringBuilder.charAt(stringBuilder.length() - 1) != ' ') {
                stringBuilder.append(c);
            }
            start++;
        }
        return stringBuilder;
    }

    /**
     * 反转字符串
     */
    public void reverseString(StringBuilder stringBuilder, int start, int end) {
        while (start < end) {
            char temp = stringBuilder.charAt(start);
            stringBuilder.setCharAt(start, stringBuilder.charAt(end));
            stringBuilder.setCharAt(end, temp);
            start++;
            end--;
        }
    }

    /**
     * 字符串中的将单词反转
     */
    public void reverseEachWord(StringBuilder stringBuilder) {
        int start = 0;
        int end = 1;
        int len = stringBuilder.length();
        while (start < len) {
            while (end < len && stringBuilder.charAt(end) != ' ') {
                end++;
            }
            reverseString(stringBuilder, start, end-1);
            start = end + 1;
            end = start + 1;
        }

    }
}