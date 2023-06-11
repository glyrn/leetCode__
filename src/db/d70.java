package db;

public class d70 {
}

class Solution {
    public int climbStairs(int n) {
        int[] db = new int[100];
        db[1] = 1;
        db[2] = 2;
        for (int i = 3; i <= n; i++) {
            db[i] = db[i - 1] + db[i - 2];
        }
        return db[n];


    }
}