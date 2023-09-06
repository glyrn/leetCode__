package traceBack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class tb77 {
}

class Solution {

    List<List<Integer>> list = new ArrayList<>();

    LinkedList<Integer> res = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {

        traceBack(n, k, 1);

        return list;

    }

    void traceBack(int n, int k, int startIndex) {

        // 终止条件
        if (res.size() == k) {
            list.add(new ArrayList<>(res));
            return;
        }
        // 纵向遍历
        for (int i = startIndex; i <= n; i++) {

            // 添加当前元素
            res.add(i);

            traceBack(n, k, i+1);

            // 回溯
            res.removeLast();

        }


    }

}