class Solution {

    public static boolean isSafe(String[][] arr , int n , int row , int col)
    {
        for(int i=row-1, j=col-1 ; i>=0 && j>=0 ; i--,j--)
        {
            if(arr[i][j].equals("Q")) return false;
        }

        for(int i=row-1 ; i>=0 ; i--)
        {
            if(arr[i][col].equals("Q")) return false;
        }

        for(int i=row-1, j=col+1 ; i>=0 && j<n ; i--,j++)
        {
            if(arr[i][j].equals("Q")) return false;
        }

        return true;
    }

    public static void queen(List<List<String>> list ,String[][] arr , int n , int row)
    {
        if(row == n)
        {
            List<String> strList = new ArrayList<>();
            for(int i=0 ; i<n ; i++)
            {
                String rowStr = String.join("", arr[i]);
                strList.add(rowStr);
            }
            list.add(strList);
            return;
        }
        for(int j=0 ; j<n ; j++)
        {
            if(isSafe(arr, n, row, j))
            {
                arr[row][j] = "Q";
                queen(list ,arr , n , row+1);
                arr[row][j] = ".";
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        int row = n , col = n;
        String[][] arr = new String[row][col];
        List<List<String>> list = new ArrayList<>();
        for(int i=0 ; i<row ; i++)
        {
            for(int j=0 ; j<col ; j++)
            {
                arr[i][j] = ".";
            }
        }
        queen(list, arr , n , 0);
        
        return list;
    }
}