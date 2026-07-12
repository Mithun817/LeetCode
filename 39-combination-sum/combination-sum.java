class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int n = candidates.length;
        solve(list , new ArrayList<>() , candidates , target , 0 , n , 0 );
        return list;
    }

    public void solve(List<List<Integer>> list , List<Integer> temp , int[] arr , int target , int sum , int n , int start)
    {
        if(sum == target)
        {
            list.add(new ArrayList<>(temp));
            return;
        }

        if(sum > target) return;

        for(int i=start ; i<n ; i++)
        {
            temp.add(arr[i]);
            sum+=arr[i];
            solve(list , temp , arr , target , sum , n , i);
            temp.remove(temp.size()-1);
            sum-=arr[i];
        }
    }
}