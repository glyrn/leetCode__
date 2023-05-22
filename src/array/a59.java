package array;

public class a59 {
}

class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int value = 1;
        int target = n * n;
        int startX = 0;
        int startY = 0;
        int offset = 1;
        int i = 0, j = 0;
        int times = 0;
        while (times++ < n / 2) {

            //left - right
            for (j = startX; j < n - offset; j++) {
                result[startX][j] = value++;

            }
            //up - down
            for (i = startX; i < n - offset; i++) {
                result[i][j] = value++;
            }
            //right - left
            for (; j > startY; j--) {
                result[i][j] = value++;
            }
            //down - up
            for (; i > startX; i--) {
                result[i][j] = value++;
            }
            startX++;
            startY++;
            offset++;
        }
        if (n % 2 == 1) {
            result[(n + 1) / 2 - 1][(n + 1) / 2 - 1] = n * n;
        }
        return result;
    }
}