class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length(), ind = 0;
        int[] arrr = new int[n];
        for(char ch : s.toCharArray())
        {
            arrr[ind++] = ch-'0';
        }
        while(n!=2)
        {
            for(int i=0 ; i<n-1 ; i++)
            {
                arrr[i] = (arrr[i]+arrr[i+1])%10;
            }
            n--;
        }
        return arrr[0] == arrr[1];
    }
}