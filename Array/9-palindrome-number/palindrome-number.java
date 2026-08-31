class Solution {
    public boolean isPalindrome(int x) {
        int org = x;
        int ans = 0;

        if(x < 0){
            return false;
        }

        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            ans *= 10;
            ans += digit;
        }
        return ans == org;
    }
}