class Solution {
    public int maxProduct(int n) {
        int len = String.valueOf(n).length();
        int[] arr=  new int[len];
        for(int i=0 ; i<len ; i++)
        {
            arr[i] = n%10;
            n/=10;
        }
        Arrays.sort(arr);
        return arr[len-1]*arr[len-2];
    }
}