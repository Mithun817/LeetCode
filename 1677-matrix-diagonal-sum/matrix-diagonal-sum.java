class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0, r = mat.length , c = mat[0].length-1;
        for(int i=0 ; i<r ; i++)
        {
            if(i==c) sum+=mat[i][c];
            else sum+=mat[i][i] + mat[i][c];
            c--;
        }
        return sum;
    }
}