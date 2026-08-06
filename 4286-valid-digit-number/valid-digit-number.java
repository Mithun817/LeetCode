class Solution {
    public boolean validDigit(int n, int x) {
        int len = String.valueOf(n).length();
        int mul = (int)Math.pow(10 , len-1);
        if(n/mul != x)
        {
            int temp = n;
            while(temp!=0)
            {
                if(temp%10==x) return true;
                temp/=10;
            }
        }
        return false;
    }
}