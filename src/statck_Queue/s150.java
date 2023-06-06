package statck_Queue;

import java.util.Stack;

public class s150 {
}


class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String c : tokens){
            if ("+".equals(c)){
                stack.push(stack.pop() + stack.pop());
            }else if ("-".equals(c)){
                stack.push(-stack.pop()+stack.pop());
            }else if ("*".equals(c)){
                stack.push(stack.pop()*stack.pop());
            }else if ("/".equals(c)){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }else {
                stack.push(Integer.valueOf(c));
            }
        }
        return stack.pop();
    }
}


//

/**
 * 利用栈 没遇到以恶付哈 就退栈两次
 */