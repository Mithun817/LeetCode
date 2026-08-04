class Solution {
    public int diagonalPrime(int[][] nums) {
        int maxx = 0;
        int row = nums.length , j = 0, col = nums[0].length;
        for(int i=0 ; i<row ; i++ , j++)
        {
            //System.out.println(nums[i][j]);
            if(isPrime(nums[i][j]))
            {
                maxx = Math.max(nums[i][j] , maxx);
            }
        }
        j=col-1;
        for(int i=0 ; i<row ; i++ , j--)
        {
            //System.out.println(nums[i][j]);
            if(isPrime(nums[i][j]))
            {
                maxx = Math.max(nums[i][j] , maxx);
            }
        }
        return maxx;
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