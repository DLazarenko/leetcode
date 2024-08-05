class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if(n == 2) return 2;
        int previous = 1;
        int last = 2;
        for (int i = 3; i < n; i++){
            int temp = last;
            last = last + previous;
            previous = temp;
        }
        return last + previous;
    }
}