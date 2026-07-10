class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        double th = n*0.25;
        int count = 1, i=0;
        for(i=0 ; i<n-1 ; i++)
        {
            if(arr[i] == arr[i+1])
            {
                count++;
            }
            else
            {
                if(count>th) return arr[i];
                count = 1;
            }
            if(count>th) return arr[i];
        }
        if(count>th) return arr[i];
        return -1;
    }
}