class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int si = 0 , sum = 0 , n = nums.length , max = Integer.MIN_VALUE , min = Integer.MAX_VALUE;
        for(int i=0 ; i<n ; i++)
        {
            min = Math.min(min , nums[i]);
        }
        for(int i=0 ; i<n ; i++)
        {
            max = Math.max(max , nums[i]);
            if(i != 0)
            {
                if(min == nums[i-1])
                {
                    min = Integer.MAX_VALUE;
                    for(int j=i ; j<n ; j++)
                    {
                        min = Math.min(nums[j] , min);
                    }
                }
            }
            sum = max - min;
            if(sum <= k) return i;
        }
        return -1;
    }
}