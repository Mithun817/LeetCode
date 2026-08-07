class Solution {
    public int passThePillow(int n, int time) {
        boolean flag = true;
        int i=1;
        while(time-->0)
        {
            if(i==1) flag = true;
            else if(i==n) flag = false;
            if(flag) i++;
            else i--;
        }
        return i;
    }
}