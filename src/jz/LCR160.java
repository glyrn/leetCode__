package jz;

import java.util.LinkedList;
import java.util.List;

public class LCR160 {
}
// 先转换成 数组进行排序 然后再赋值回去
class MedianFinder {

    List<Integer> list;

    /** initialize your data structure here. */
    public MedianFinder() {

        list = new LinkedList<Integer>();


    }

    public void addNum(int num) {

        list.add(num);
        int[] i = new int[list.size()];

        list.toArray(i);

    }

    public double findMedian() {

    }

}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */