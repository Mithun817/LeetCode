class Solution {
    public int possibleStringCount(String word) {
        int possi = 1;
        
        int l = 0 , r = 1 , count = 1;

        while(l<r && r<word.length())
        {
            if(word.charAt(l) == word.charAt(r))
            {
                count++;
                r++;
            }
            else
            {
                possi += count-1;
                count = 1;
                l=r;
                r++;
            }
        }
        possi += count-1;
        return possi;
    }
}