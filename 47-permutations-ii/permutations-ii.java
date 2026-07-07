class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        boolean[] used = new boolean[n];
        backtrack(list , new ArrayList<>() , nums , n , used);
        //System.out.println(list);
        return list;
    }

    public void backtrack(List<List<Integer>> ans , List<Integer> temp , int[] arr , int n , boolean[] used)
    {
        if(temp.size() == n)
        {
            List<Integer> tl = new ArrayList<>(temp);
            if(!ans.contains(tl))
            ans.add(tl);
            return;
        }

        for(int i=0 ; i<n ; i++)
        {
            if(used[i]) continue;
            if(i>0 && arr[i] == arr[i-1] && !used[i-1]) continue;
            temp.add(arr[i]);
            used[i] = true;
            backtrack(ans , temp , arr , n , used);
            temp.remove(temp.size()-1);
            used[i] = false;
        }
    }

}