// 滑动窗口
package array;
import java.util.HashMap;
import java.util.Map;

public class a76 {
}

class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> targetCounts = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetCounts.put(c, targetCounts.getOrDefault(c, 0) + 1);
        }

        int start = 0;
        int winlen = Integer.MAX_VALUE;
        int targetCharCount = t.length();
        int minstart = 0;

        for (int end = 0; end < s.length(); end++) {
            char curChar = s.charAt(end);
            if (targetCounts.containsKey(curChar)) {
                if (targetCounts.get(curChar) > 0) {
                    targetCharCount--;
                }
                targetCounts.put(curChar, targetCounts.get(curChar) - 1);
            }
            while (targetCharCount == 0) {
                if (end - start + 1 < winlen) {
                    winlen = end - start + 1;
                    minstart = start;
                }
                char startChar = s.charAt(start);
                //开始移动窗口
                if (targetCounts.containsKey(startChar)) {
                    targetCounts.put(startChar, targetCounts.get(startChar) + 1);
                    if (targetCounts.get(startChar) > 0) {
                        targetCharCount++;
                    }
                }
                start++;
            }
        }
        if (winlen ==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(minstart, minstart + winlen);

    }

}

//class CharacterCounter {
//    public static Map<Character, Integer> countCharacters(String s) {
//        Map<Character, Integer> charCounts = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1) {
//
//            }
//            return charCounts;
//        }
//    }
//}
