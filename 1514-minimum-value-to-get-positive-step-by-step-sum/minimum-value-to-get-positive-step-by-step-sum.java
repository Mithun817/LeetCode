class Solution {
    public int minStartValue(int[] nums) {
        int n = nums.length, sum = 0, nu = 1;
        while (true) {
            boolean flag = true;
            int temp = nu;
            for (int i = 0; i < n; i++) {
                if(temp + nums[i] < 1)
                {
                    flag = false;
                    break;
                }
                else temp = temp + nums[i];
            }
            if(flag) break;
            nu++;
        }
        return nu;
    }
}