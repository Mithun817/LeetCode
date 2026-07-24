class Solution {
    String ans = new String("");
    int K = 0;
    public String getPermutation(int n, int k) {
        int[] arr = new int[n];
        K = k;
        boolean[] visited = new boolean[n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = i+1;
        }

        permut(n , visited , new StringBuilder() , arr);
        return ans;
    }

    public void permut(int n , boolean[] visited , StringBuilder temp , int[] arr)
    {
        if(K==0) return;
        if(temp.length() == n)
        {
            ans = temp.toString();
            //System.out.println(ans);
            K--;
        }
        if(K==0) return;
        for(int i=0 ; i<n ; i++)
        {
            if(!visited[i]) temp.append(arr[i]);
            else continue;
            visited[i] = true;
            permut(n,visited,temp,arr);
            temp.deleteCharAt(temp.length()-1);
            visited[i] = false;
        }
    }

}