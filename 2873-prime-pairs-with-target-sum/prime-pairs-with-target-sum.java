class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        boolean[] arr = new boolean[n];
        for(int i=2 ; i*i<n ; i++){
            if(!arr[i]){
                for(int j=i*i ; j<n ; j+=i){
                    arr[j] = true;
                }
            }
        }

        for(int i=2 ; i<=n/2 ; i++)
        {
            int y = n - i;
            if(!arr[y] && !arr[i]) ans.add(Arrays.asList(i, y));
        }
        return ans;
    }
}