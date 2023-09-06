package jz;

public class j05 {

}



class Solution {
    public String replaceSpace(String s) {

        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char a : chars) {

            if (a != ' ') {
                stringBuilder.append(a);
            }else {
                stringBuilder.append("%20");
            }

        }
        return stringBuilder.toString();
    }
}