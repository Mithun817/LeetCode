class Solution {
    public int countElements(int[] nums) {
        int count = 0 , min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i : nums)
        {
            min = Math.min(min , i);
            max = Math.max(max , i);
        }
        for(int i : nums) if(min < i && max > i) count++;
        return count;
    }
}