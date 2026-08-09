class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = Integer.MAX_VALUE, n = nums.size();
        while(l <= r)
        {
            int sum = 0;
            for(int i=0 ; i<l ; i++)
            {
                sum += nums.get(i);
            }
            if(sum > 0) min = Math.min(min , sum);
            for(int i = l ; i<n ; i++)
            {
                sum += nums.get(i) - nums.get(i-l);
                if(sum > 0) min = Math.min(min , sum);
            }
            l++;
        }
        return min==Integer.MAX_VALUE ? -1 : min;
    }
}