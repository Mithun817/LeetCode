class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    long sum = 0;
    long target = 0;
    public List<List<Integer>> fourSum(int[] nums, int Target) {
        Arrays.sort(nums);
        target = Target;
        solve(nums , new ArrayList<>() , 0 , nums.length);
        return ans;
    }
    public void solve(int[] arr , List<Integer> temp , int start , int n)
    {
        if (temp.size() + (n - start) < 4)
            return;
        if(temp.size() == 4)
        {
            if(sum == target)
            {
                List<Integer> list = new ArrayList<>(temp);
                if(!ans.contains(list)) ans.add(list);
            }
            return;
        }
        for (int i = start; i < n; i++) {

            if (i > start && arr[i] == arr[i - 1])
                continue;

            sum += arr[i];
            temp.add(arr[i]);

            solve(arr, temp, i + 1, n);

            sum -= arr[i];
            temp.remove(temp.size() - 1);
        }
    }
}