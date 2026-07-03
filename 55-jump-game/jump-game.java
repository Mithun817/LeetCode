class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(nums[0] == 0)
        {
            if(n==1) return true;
            return false;
        }
        int max = 0;
        for(int i=0 ; i<n ; i++)
        {
            if(max>=n) return true;
            if(nums[i] == 0)
            {
                if(max<=i) break;
            }
            max = Math.max(max , (nums[i]+i));
        }
        return max>=n-1;
    }
}