class Solution {
    public static boolean isHappy(int n) {
        int x = n;
        do {
            if(x == 4) return false;
            x = check(x);
        } while(x > 1);
        return x == 1;
    }
    public static int check(int n) {
        if (n == 1) return 1;
        if (n == 0) return 0;
        if (n <= 9) return n * n;
        return check(n%10) + check(n/10);
    }
}