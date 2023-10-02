package traceBack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
    this is a review for traceBack
 */
public class review {

    List<List<Integer>> list = new ArrayList<>();  // 用来存符合条件的结果的集合

    LinkedList<Integer> res = new LinkedList<>();  // 用来存储遍历树的路径

    void trace(int n, int k, int index) {
        if (res.size() == k) {
            list.add(new ArrayList<>(res));
            return;
        }
        // 纵向遍历
        for (int i = index; i < n; i ++) {

            res.add(i);

            // 回溯下一层
            trace(n, k, index+1);

            res.removeLast();

        }

    }
}
