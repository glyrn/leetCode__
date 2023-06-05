package statck_Queue;

import java.util.Stack;

public class s1047 {
}



class Solution {
    public String removeDuplicates(String s) {
        if (s == null || s.isEmpty()){
            return "";
        }
        Stack<Character> s1 = new Stack<>();
        char[] a = s.toCharArray();

        int len = a.length;
        for (int i = 0; i < len; i ++){
            //需要先判断是否是空的栈 然后在进行peek操作
            if (!s1.isEmpty()&& s1.peek() == a[i]  ){
                s1.pop();
            }else {
                s1.push(a[i]);
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        while (!s1.isEmpty()){
            stringBuffer.append(s1.pop());
        }
        return stringBuffer.reverse().toString();


    }
}