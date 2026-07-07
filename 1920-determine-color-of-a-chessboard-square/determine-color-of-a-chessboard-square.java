class Solution {
    public boolean squareIsWhite(String coordinates) {
        int col = coordinates.charAt(0)-'a';
        int row = coordinates.charAt(1)-'0';

        if(col % 2 == 0)
        {
            if(row%2 == 0) return true;
        }
        else
        {
            if(row%2 != 0) return true;
        }
        return false;
    }
}