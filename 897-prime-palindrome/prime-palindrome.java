class Solution {
    public int primePalindrome(int n) {
        while(true)
        {
            if (10000000 <= n && n < 100000000)
                n = 100000000;
            if(isPrime(n) && isPalindrome(n)) return n;
            n++;
            if(n == Integer.MAX_VALUE) break;
        }
        return -1;
    }
    public boolean isPrime(int n)
    {
        if(n<2) return false;
        if(n==2) return true;
        if(n%2 == 0) return false;

        for(int i=3 ; i*i<=n ; i+=2)
        {
            if(n%i == 0) return false;
        }
        return true;
    }
    public boolean isPalindrome(int n)
    {
        String str = String.valueOf(n);
        int len = str.length();
        int i=0 , j=len-1;
        while(i<j)
        {
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;j--;
        }
        return true;
        // int temp = n, rev = 0;
        // while(temp!=0)
        // {
        //     rev = rev * 10 + temp%10;
        //     temp/=10;
        // }
        // return n == rev;
    }
}