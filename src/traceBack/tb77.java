package traceBack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
    回溯算法过了一个月还是不会 。。 吐槽差评！！！
 */
public class tb77 {
}

class Solution {

    List<List<Integer>> list = new ArrayList<>();  // 用来存符合条件的结果的集合

    LinkedList<Integer> res = new LinkedList<>();  // 用来存储遍历树的路径

    public List<List<Integer>> combine(int n, int k) {

        traceBack(n, k, 1);

        return list;

    }

    /*
        这里的 n 是指给的数的范围

        k 是指一次排序的数的个数

        startIndex 是在回溯的时候的其实索引
     */

    /**
     * 回溯问题本质上是  带有剪枝优化的递归问题
     * @param n
     * @param k
     * @param startIndex
     */
    void traceBack(int n, int k, int startIndex) {

        // 终止条件 --走到了树的终点了
        if (res.size() == k) {
            list.add(new ArrayList<>(res));
            return;
        }


        // 纵向遍历
        for (int i = startIndex; i <= n; i++) {

            // 添加当前元素
            res.add(i);

            traceBack(n, k, i+1); // 这个是回溯下一层

            // 回溯
            res.removeLast();

        }


    }

}