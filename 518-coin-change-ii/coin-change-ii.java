class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] arr = new int[n][amount+1];
        arr[0][0] = 1;
        for(int i=1 ; i<amount+1 ; i++)
            {
                arr[0][i] = i % coins[0] == 0 ? 1 : 0;
            }
            for(int i=0 ; i<n ; i++)
            {
                arr[i][0] = 1;
            }
        for(int i=1 ; i<n ; i++)
        {
            int coin = coins[i];
            for(int j=1 ; j<=amount ; j++)
            {
                arr[i][j] = j < coin ? arr[i-1][j] : arr[i-1][j] + arr[i][j-coin];
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
        return arr[n-1][amount];
    }
}