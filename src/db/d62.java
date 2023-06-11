package db;

public class d62 {
}

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] db = new int[m][n];
        for (int i = 0; i < m; i++) {
            db[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            db[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                db[i][j] = db[i - 1][j] + db[i][j - 1];
            }
        }
        return db[m-1][n-1];
    }
}