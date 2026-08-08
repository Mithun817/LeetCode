class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length*2;
        int[] arr = new int[n];
        int ind = 0;

        for(int i=0 ; i<nums.length ;i++)
        {
            arr[ind++] = nums[i];
        }
        for(int i=nums.length-1 ; i>=0 ;i--)
        {
            arr[ind++] = nums[i];
        }
        return arr;
    }
}