class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\W+|_", "").toLowerCase();
        int k = s.length() - 1;
        for (int i = 0; i < k; i++) {
            if (s.charAt(i) != s.charAt(k)) return false;
            else k--;
        }
        return true;
    }
}