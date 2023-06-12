package hash;

import java.util.HashMap;

public class h242 {
}

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] result = new int[26];
        for (int i = 0; i < s.length(); i++) {
            result[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            result[t.charAt(i) - 'a']--;
        }
        boolean flag = true;
        for (int i = 0; i < 26; i++) {
            if (result[i] != 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
//class Solution {
//    public boolean isAnagram(String s, String t){
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i ++){
//            map.put(s.charAt(i), map.getOrDefault(0) + 1);
//        }
//    }
//}