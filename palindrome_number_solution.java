class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0;
        int number = x;
        while(number > 0){
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return x == reverse;     
    }
}