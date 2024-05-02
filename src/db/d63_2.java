package db;

public class d63_2 {
}

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        // 输入的数组中 有障碍物的为1 没有障碍物的 为0

        // 求 一共有多少路径到达目标

        // 创建dp数组
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int db[][] = new int[row][col];

        // 初始化矩阵 遍历条件矩阵 遍历双边 如果出现了障碍物 则后面的都是0
        // 先判定第一行
        for (int i = 0; i < col; i ++) {
            db[0][i] = 1;
            // 如果有障碍物 直接变成0 并且如果左边有障碍物也变成0
            if (obstacleGrid[0][i] == 1) {
                // 如果当前是障碍物
                db[0][i] = 0;
            }
            // 如果左边也是障碍物 那么也是0
            if ((i!= 0) && db[0][i-1] == 0) {
                db[0][i] = 0;
            }
        }
        // 列判断
        for (int i = 0; i < row; i ++) {
            db[i][0] = 1;
            // 如果有障碍物
            if (obstacleGrid[i][0] == 1) {
                db[i][0] = 0;
            }
            // 如果上面也是障碍物
            if (i != 0 && db[i-1][0] == 0) {
                db[i][0] = 0;
            }
        }

        /**
         * 遍历矩阵 每一个矩阵等于上方方块的值加上左方方块的值
         * 如果原矩阵有障碍物 那么赋值为0
         */
        for (int i = 1; i < col; i ++) {
            for (int j = 1; j < row; j ++) {
                db[i][j] = db[i-1][j] + db[i][j-1];
                if (obstacleGrid[i][j] == 1) {
                    db[i][j] = 0;
                }
            }
        }

        return db[row-1][col-1];



    }
}