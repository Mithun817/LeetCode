class Solution {
    public long sumAndMultiply(int n) {
        long num = 0;
        int temp = n;
        long len = String.valueOf(n).length();
        long mul = (int)Math.pow(10,len-1);
        int count = 0 , sum=0;
        while(temp!=0)
        {
            long rem = temp/mul;
            if(rem != 0){
                count++;
                num = num*10+(rem);
                sum+=rem;
            }
            temp %= mul;
            mul /= 10;
        }
        return (long) (sum * num);
    }
}