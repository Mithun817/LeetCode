class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] ans= new int[n];
        int ind = 0;
        for(int i=0 ; i<n ; i++) if(nums[i]%2==0) ans[ind++] = nums[i];
        for(int i=0 ; i<n ; i++) if(nums[i]%2==1) ans[ind++] = nums[i];
        return ans;
    }
}