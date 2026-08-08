class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0 , prod = 1, nn = n;
        while(nn!=0)
        {
            sum += nn%10;
            prod *= nn%10;
            nn/=10;
        }
        //System.out.println(sum +" "+ prod);
        return n % (sum + prod) == 0;
    }
}