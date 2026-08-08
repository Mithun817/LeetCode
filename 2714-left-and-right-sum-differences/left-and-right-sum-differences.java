class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        int first = 0 , last = 0;
        for(int i=0 ; i<nums.length ; i++) last += nums[i];
        for(int i=0 ; i<nums.length ; i++)
        {
            if(i != 0) first += nums[i-1];
            last -= nums[i];
            ans[i] = Math.abs(last - first);
        }
        return ans;
    }
}