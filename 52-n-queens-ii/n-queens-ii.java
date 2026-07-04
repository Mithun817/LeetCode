class Solution {
    int count = 0;

    public int totalNQueens(int n) {
        char[][] arr = new char[n][n];

        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                arr[i][j] = '.';
            }
        }

        backtrackQueens(arr , n , 0);
        return count;
    }

    public void backtrackQueens(char[][] arr , int n , int row)
    {
        if(row == n)
        {
            count++;
            return;
        }

        for(int i=0 ; i<n ; i++)
        {
            if(isSafe(arr , n , row , i))
            {
                arr[row][i] = 'Q';
                backtrackQueens(arr , n , row+1);
                arr[row][i] = '.';
            }
        }
    }

    public boolean isSafe(char[][] arr , int n , int row , int col)
    {
        for(int i=row-1, j=col-1 ; i>=0 && j>=0 ; i--,j--)
        {
            if(arr[i][j] == 'Q') return false;
        }

        for(int i=row-1 ; i>=0 ; i--)
        {
            if(arr[i][col] == 'Q') return false;
        }

        for(int i=row-1, j=col+1 ; i>=0 && j<n ; i--,j++)
        {
            if(arr[i][j] == 'Q') return false;
        }

        return true;
    }

}