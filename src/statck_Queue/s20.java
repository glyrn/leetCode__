package statck_Queue;

import java.util.Stack;

public class s20 {
}

/**
 * 第一种情况：已经遍历完了字符串，但是栈不为空，说明有相应的左括号没有右括号来匹配，所以return false
 * <p>
 * 第二种情况：遍历字符串匹配的过程中，发现栈里没有要匹配的字符。所以return false
 * <p>
 * 第三种情况：遍历字符串匹配的过程中，栈已经为空了，没有匹配的字符了，说明右括号没有找到对应的左括号return false
 */


class Solution {
    public boolean isValid(String s) {
        int size = s.length();
        if (size % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for (char c :
                s.toCharArray()) {
            switch (c) {
                case '(':
                    stack.push(')');
                    continue;
                case '[':
                    stack.push(']');
                    continue;
                case '{':
                    stack.push('}');
                    continue;
                case ')':
                    if (stack.isEmpty()) {
                        return false;
                    } else if (stack.peek() == ')') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    continue;
                case ']':
                    if (stack.isEmpty()) {
                        return false;
                    } else if (stack.peek() == ']') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    continue;
                case '}':
                    if (stack.isEmpty()) {
                        return false;
                    } else if (stack.peek() == '}') {
                        stack.pop();
                    } else {
                        return false;
                    }
                    continue;
                default:
                    break;
            }

        }
        return stack.isEmpty();
    }
}