class Solution {
    public long removeZeros(long n) {
        int len = String.valueOf(n).length();
        long mul = (long)Math.pow(10 , len-1);
        long temp = n , ans = 0;
        while(temp!=0)
        {
            int rem =(int) (temp/mul);
            if(rem != 0)
            {
                ans = ans * 10 + rem;
            }
            temp %= mul;
            mul /= 10;
        }
        return ans;
    }
}