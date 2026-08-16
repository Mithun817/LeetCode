class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0, r = strs.length, c = strs[0].length();
        for(int i=0 ; i<c ; i++)
        {
            boolean flag = true;
            for(int j=0 ; j<r-1 ; j++)
            {
                if(strs[j].charAt(i) > strs[j+1].charAt(i))
                {
                    flag = false;
                    break;
                }
            }
            if(!flag) count++;
        }
        return count;
    }
}