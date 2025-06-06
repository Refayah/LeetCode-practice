class Solution {
    public int reverse(int x) {
        int rev = 0;    
       while (x != 0) {
            int digit = x % 10;
            x /= 10;
            // Check for overflow
            if (rev > 214748364 || (rev == 214748364 && digit > 7)) return 0;
            if (rev < -214748364 || (rev == -214748364 && digit < -8)) return 0;
            rev = rev * 10 + digit;
        }
       /* while (x!=0) {
            int rem=x%10;
            rev = rev*10+rem;
            x=x/10;
        }*/  
        return rev;
    }
}
