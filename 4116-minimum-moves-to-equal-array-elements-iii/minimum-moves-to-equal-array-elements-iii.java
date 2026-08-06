class Solution {
    public int minMoves(int[] nums) {
        int maxx = 0, count = 0;
        for(int i : nums) maxx = Math.max(maxx , i);

        for(int i : nums) count += maxx - i;

        return count;
    }
}