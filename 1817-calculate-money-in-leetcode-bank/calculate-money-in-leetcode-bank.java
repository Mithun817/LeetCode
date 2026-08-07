class Solution {
    public int totalMoney(int n) {
        int sum = 0, mul = 3;
        if(n<=7)
        {
            for(int i=0 ; i<n ; i++) sum += i+1;
        }
        else
        {
            int weeks = n/7;
            for(int i=0 ; i<weeks ; i++) sum += 28 + (7 * i);
            int di = n/7 + 1;
            for(int i=0 ; i<n%7 ; i++)
            {
                sum +=di++;
            }
        }
        return sum;
    }
}