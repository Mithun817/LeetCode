class Solution {
    public int maxProduct(int n) {
        int len = String.valueOf(n).length();
        int[] arr=  new int[len];
        for(int i=0 ; i<len ; i++)
        {
            arr[i] = n%10;
            n/=10;
        }
        int j=0 , k=0, max = 0 , max2 = 0;
        for(int i=0 ; i<len ; i++)
        {
            if(arr[i]>max) 
            {
                max = arr[i];
                j = i;
            }
        }
        for(int i=0 ; i<len ; i++)
        {
            if(i==j) continue;
            if(arr[i]>max2) 
            {
                max2 = arr[i];
            }
        }
        return max * max2;
    }
}