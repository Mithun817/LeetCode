class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for(int k=0 ;k<n ; k++)
        {
            sum+=arr[k];
            System.out.println(arr[k]);
        }
        for(int i=3 ; i<=n ; i+=2)
        {
            int j=i, ts = 0, ti=1;
            for(int k=0 ; k<j ; k++)
            {
                ts += arr[k];
            }
            sum += ts;
            while(j<n)
            {System.out.println(ts);
                ts -= arr[ti-1];
                ts += arr[j];
                j++;
                ti++;
                sum += ts;
            }
        }
        return sum;
    }
}