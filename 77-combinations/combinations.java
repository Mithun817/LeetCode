class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = i+1;
        }
        solve(ans , new ArrayList<>() , k , arr , n , 0);
        return ans;
    }
    public static void solve(List<List<Integer>> ans , List<Integer> temp , int k , int[] arr , int n , int start)
    {
        if(temp.size() == k)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=start ; i<n ; i++)
        {
            temp.add(arr[i]);
            solve(ans , temp , k , arr , n , i+1);
            temp.remove(temp.size()-1);
        }
    }
}