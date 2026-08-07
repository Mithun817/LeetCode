class Solution {
    public int numberOfChild(int n, int k) {
        boolean flag = true;
        int i=0;
        while(k-->0)
        {
            if(i==0) flag = true;
            else if(i==n-1) flag = false;
            if(flag) i++;
            else i--;
        }
        return i;
    }
}