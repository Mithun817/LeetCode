class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        // if(n==1)
        // {
        //     if(coins[0] == amount) return 1;
        //     else return 0;
        // }
        int[][] arr = new int[n][amount+1];
        for(int i=1 ; i<=amount ; i++) arr[0][i] = i%coins[0] == 0 ? i/coins[0] : amount+1;
        for(int i=1 ; i<n ; i++)
        {
            int coin = coins[i];
            for(int j=1 ; j<=amount ; j++)
            {
                arr[i][j] = j<coin ? arr[i-1][j] : Math.min(arr[i-1][j] ,1 + arr[i][j-coin]);
            }
        }
        // for(int i=0 ; i<n ; i++)
        // {
        //     for(int j=0 ; j<=amount ; j++)
        //     {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        return arr[n-1][amount] == amount+1 ? -1 :arr[n-1][amount];
    }
}