package jz;

public class j04 {
}
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        int i = matrix.length;
        int j = 0;

        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] > target) {
                i--;
            }else if (matrix[i][j] < target){
                j ++;
            }else {
                return true;
            }
        }
        return false;
    }
}