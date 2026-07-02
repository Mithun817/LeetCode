class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length , five = 0 , ten = 0 , twenty = 0;

        for(int num : bills)
        {
            if(num == 5)
            {
                five++;
            }
            else if(num == 10)
            {
                ten++;
                if(five<1) return false;
                five--;
            }
            else
            {
                twenty++;
                if(ten>0 && five>0)
                {
                    ten--;
                    five--;
                }
                else if(five>=3)
                {
                    five-=3;
                }
                else return false;
            }
        }
        return true;
    }
}