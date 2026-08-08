class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            Set<Integer> p = new HashSet<>();
            Set<Integer> s = new HashSet<>();
            for(int j=0 ; j<=i ; j++) p.add(nums[j]);
            for(int j=i+1 ; j<n ; j++) s.add(nums[j]);
            ans[i] = p.size() - s.size();
        }
        return ans;
    }
}