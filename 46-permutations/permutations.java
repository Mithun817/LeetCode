class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list , new ArrayList<>() , nums.length , nums);
        return list;
    }

    public void backtrack(List<List<Integer>> result , List<Integer> temp , int n , int[] arr)
    {
        if(temp.size() == n)
        {
            List<Integer> list = new ArrayList<>(temp);
            if(!result.contains(list)) result.add(list);
            return;
        }
        for(int i=0 ; i<n ; i++)
        {
            if(temp.contains(arr[i])) continue;

            temp.add(arr[i]);
            backtrack(result , temp , n , arr);
            temp.remove(temp.size()-1);
        }
    }
}