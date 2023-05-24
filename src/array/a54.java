package array;

import java.util.ArrayList;
import java.util.List;

public class a54 {
}

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int a = 0, b = 0, c = matrix[0].length - 1, d = matrix.length - 1;
        List<Integer> list = new ArrayList<>();
        while (true) {
            //
            for (int i = b; i <= c; i++) {
                list.add(matrix[a][i]);
            }
            if (++a > d) {
                break;
            }
            for (int i = a; i <= d; i++) {
                list.add(matrix[i][c]);
            }
            if (--c < b) {
                break;
            }
            for (int i = c; i >= b; i --){
                list.add(matrix[d][i]);
            }
            if (--d < a){
                break;
            }
            for (int i = d; i >= a; i --){
                list.add(matrix[i][b]);
            }
            if (++b > c){
                break;
            }
        }
        return list;
    }
}