class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int max = 0;
        max = Math.max(num1 , Math.max(num2 , num3));
        StringBuilder str = new StringBuilder();
        while(max!=0)
        {
            str.append(Math.min(num3%10 , Math.min(num2%10 , num1%10)));
            num1/=10;num2/=10;num3/=10;
            max/=10;
        }
        

        return Integer.parseInt(str.reverse().toString());
    }
}