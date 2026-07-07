class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int col1 = coordinate1.charAt(0)-'a';
        int row1 = coordinate1.charAt(1)-'0';

        int col2 = coordinate2.charAt(0)-'a';
        int row2 = coordinate2.charAt(1)-'0';

        String colour = "";

        if(col1 % 2 == 0)
        {
            if(row1%2 == 0) colour = "W";
        }
        else
        {
            if(row1%2 != 0) colour = "W";
        }

        String colour2 = "";

        if(col2 % 2 == 0)
        {
            if(row2%2 == 0) colour2 = "W";
        }
        else
        {
            if(row2%2 != 0) colour2 = "W";
        }

        return colour.equals(colour2);
    }
}