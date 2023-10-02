package db;

public class d746 {
}

//class Solution {
//    public int minCostClimbingStairs(int[] cost) {
//        int len = cost.length;
//        int db[] = new int[len + 1];
//        db[0] = 0;
//        db[1] = 0;
//        for (int i = 2; i <= len + 1; i++) {
//            db[i] = min(db[i - 1] + cost[i - 1], db[i - 2] + cost[i - 2]);
//        }
//        return db[len + 1];
//
//    }
//
//    int min(int n1, int n2) {
//        return n1 > n2 ? n2 : n1;
//    }
//}


class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] db = new int[cost.length + 1];

        db[0] = 0;
        db[1] = 0;
        if (cost.length <= 1) {
            return cost[1];
        }

        for (int i = 2; i <= db.length+1; i++) {
            db[i] = Math.min(db[i-1]+cost[i-1], db[i-2]+cost[i-2]);
        }


        return db[cost.length+1];
    }
}