package jz;

import java.util.LinkedList;

public class LCR167 {
}
class Solution {
    public int maxSales(int[] sales) {

        int[] db = new int[sales.length];

        for (int i = 0; i < sales.length; i ++) {

            if (i == 0) {
                db[i] = sales[0];
            }else {
                if (db[i-1] < 0) {
                    db[i] = sales[i];
                }else {
                    db[i] = db[i-1] + sales[i];
                }
            }
        }
        int res = -100; // 这里需要考虑负数 所以就直接使用非常小的数字来确保不会报错
        for (int j = 0; j < db.length; j ++) {
            if (db[j] > res) {
                res = db[j];
            }
        }

        return res;
    }
}