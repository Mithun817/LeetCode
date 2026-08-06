class Solution {
    public int minMoves(int[] nums) {
        int maxx = 0, count = 0, n=nums.length;
        for(int i : nums) maxx = Math.max(maxx , i);

        while(true)
        {
            boolean flag = true;
            for(int i=0 ; i<n ; i++)
            {
                if(nums[i] != maxx)
                {
                    flag = false;
                    nums[i]++;
                    count++;
                }
            }
            if(flag) break;
        }
        return count;
    }
}