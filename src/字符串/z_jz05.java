package 字符串;

public class z_jz05 {
}

class Solution {
    public String replaceSpace(String s) {
        if (s == null) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();

    }
}