class Solution {
    public int[] decimalRepresentation(int n) {
        int len = String.valueOf(n).length();
        int mul = (int)Math.pow(10 , len-1);
        int ii=0, z=0;
        int temp = n;
        while(temp!=0)
        {
            if(temp%10 == 0) z++;
            temp/=10;
        }
        int[] arr = new int[len-z];
        while(n!=0)
        {
            if(n/mul != 0)
            {
                arr[ii++] = (n/mul)*mul;
            }
            n%=mul;
            mul/=10;
        }
        return arr;
    }
}