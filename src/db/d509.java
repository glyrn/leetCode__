package db;

public class d509 {
}


class Solution {
    public int fib(int n) {
        switch (n) {
            case 1:
                return 1;
            case 0:
                return 0;

            default:
                break;
        }
        return fib(n - 1) + fib(n - 2);

    }


    
}

