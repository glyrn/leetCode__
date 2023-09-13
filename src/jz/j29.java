package jz;

public class j29 {
}


// 顺时针打印矩阵

class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }

        int left = 0; // 第一列
        int right = matrix[0].length-1; // 最后一列

        int t = 0; // 第一行
        int b = matrix.length-1; // 最后一行

        int index = 0;
        int[] result = new int[(right + 1) * (b + 1)];

        while (true) {

            for (int i = left; i <= right; i ++) {
                result[index++] = matrix[t][i];
            }
            // 转向
            if (++t > b) {
                break;
            }
            for (int i = t; i <= b; i ++) {
                result[index++] = matrix[i][right];
            }
            if (--right < left) {
                break;
            }
            for (int i = right; i >= left; i --) {
                result[index++] = matrix[b][i];
            }
            if (--b < t) {
                break;
            }
            for (int i = b; i >= t; i --){
                result[index++] = matrix[i][left];
            }
            if (++left > right) {
                break;
            }

        }


        return result;

    }
}
