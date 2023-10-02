package traceBack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class tb216 {
}
class Solution {

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {

        backtracking(n, k, 0, 1);

        return result;

    }
    /*
        sum 已经总和
     */
    void backtracking(int targetSum, int k, int sum, int startIndex) {
        if (k == path.size()) {
            if (sum == targetSum) {
                result.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = startIndex; i <= 9; i ++) {
            sum += i;
            path.add(i);
            backtracking(targetSum, k, sum, i + 1);
            sum -= i;
            path.removeLast();
        }
    }
}