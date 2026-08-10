class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        int od = 0 , es = 0;
        if(n % 2 == 0)
        {
            od = n/2;
            es = n/2;
        }
        else
        {
            od = n/2;
            es = n/2 + 1;
        }
        int[] odd = new int[od];
        int[] even = new int[es];
        int oi = 0 , ei = 0;
        for(int i=0 ; i<n ; i++)
        {
            if(i%2 == 1) odd[oi++] = nums[i];
            else even[ei++] = nums[i];
        }
        Arrays.sort(odd);
        Arrays.sort(even);

        for(int i = 0 ,j =0 ; i<es ; i++ , j+=2) nums[j] = even[i];
        for(int i = od-1 , j=1 ; i>=0 ; i-- , j+=2) nums[j] = odd[i];

        return nums;
    }
}