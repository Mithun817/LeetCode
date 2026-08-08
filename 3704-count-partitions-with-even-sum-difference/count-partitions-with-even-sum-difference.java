class Solution {
    public int countPartitions(int[] nums) {
        int last = 0 , first = 0, count = 0;
        for(int i=0 ; i<nums.length ; i++) last += nums[i];
        for(int i=0 ; i<nums.length-1 ; i++)
        {
            first += nums[i];
            last -= nums[i];
            if(Math.abs(last - first) % 2 == 0) count++;
        }
        return count;
    }
}