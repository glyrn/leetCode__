package db;

public class d746 {
}

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int db[] = new int[len + 1];
        db[0] = 0;
        db[1] = 0;
        for (int i = 2; i <= len + 1; i++) {
            db[i] = min(db[i - 1] + cost[i - 1], db[i - 2] + cost[i - 2]);
        }
        return db[len + 1];

    }

    int min(int n1, int n2) {
        return n1 > n2 ? n2 : n1;
    }
}