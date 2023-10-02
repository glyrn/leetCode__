package jz;

import java.util.Stack;

public class LCR148 {
}
class Solution {
    public boolean validateBookSequences(int[] putIn, int[] takeOut) {

        int i = 0;
        int j = 0;
        Stack<Integer> stack = new Stack<>();

        for (;i<putIn.length;i++){

            stack.add(putIn[i]);


            while (!stack.isEmpty() && takeOut[j] == stack.peek()){
                j++;
                stack.pop();
            }

        }

        return stack.isEmpty();
    }
}