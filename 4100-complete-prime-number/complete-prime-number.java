class Solution {
    public boolean completePrime(int num) {
        int n = String.valueOf(num).length();
        String str = String.valueOf(num);
        if(!isPrime(num)) return false;
        for(int i=1 ; i<n ; i++)
        {
            if(!(isPrime(Integer.parseInt(str.substring(0 , i))) && isPrime(Integer.parseInt(str.substring(i , n))))) return false;
        }
        return true;
    }
    public boolean isPrime(int n)
    {
        if(n<2) return false;
        else if(n==2) return true;
        for(int i=2 ; i*i<=n ; i++)
        {
            if(n%i == 0) return false;
        }
        return true;
    }
}