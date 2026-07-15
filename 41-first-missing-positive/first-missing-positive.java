class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=1;
        int n = nums.length;
        Arrays.sort(nums);
        if(nums[n-1] == 1) return 2;
        if(nums[0] == nums[n-1] || nums[n-1]<=0)
        {
            if(nums[0] == 1) return 2;
            else if(nums[n-1] <=0 ) return 1;
            else return 1;
        }
        int prev = nums[0];
        boolean flag = false;
        boolean flag2 = false;
        for(int j=0 ; j<n-1 ; j++)
        {
            if(j!=0)
            {
                if(prev == nums[j])
                continue;
            }
            if(i<nums[j])
            {
                return i;
            }
            else if(nums[j] <= 0  )
            {
                continue;
            }
            else if(i==nums[j])
            {
                i++;
                flag = true;
            }
            prev = nums[j];
        }
        if(prev == nums[n-1]) return i;
        if(nums[n-1] > i) return i;
        return flag ? i+1 : i;
    }
}