class Solution {
    public int finalValueAfterOperations(String[] operations) {
        String pred = "--X";
        String postd = "X--";
        String prei = "++X";
        String posti = "X++";
        int x = 0;
        for(String str : operations)
        {
            if(str.equals(pred)) --x;
            else if(str.equals(postd)) x--;
            else if(str.equals(prei)) ++x;
            else x++;
        }
        return x;
    }
}