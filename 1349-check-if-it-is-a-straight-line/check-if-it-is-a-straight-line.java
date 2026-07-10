class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int row = coordinates.length, col = coordinates[0].length;
        int cd = coordinates[1][1] - coordinates[0][1];
        int rd = coordinates[1][0] - coordinates[0][0];
        for(int i=2 ; i<row ; i++)
        {
            int cc = coordinates[i][1] - coordinates[i-1][1];
            int cr = coordinates[i][0] - coordinates[i-1][0];
            if(rd*cc != cd*cr) return false;
        }
        return true;
    }
}