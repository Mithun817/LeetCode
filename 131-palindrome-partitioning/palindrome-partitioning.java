class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        int n = s.length();
        solve(ans , new ArrayList<>() , n , s , 0);
        return ans;
    }

    public boolean isPalindrome(String str)
    {
        if(str.length() == 1) return true;
        StringBuilder stri = new StringBuilder(str);
        return str.equals(stri.reverse().toString());
    }

    public void solve(List<List<String>> ans , List<String> temp , int n , String s , int start)
    {
        if(start == n)
        {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=start ; i<n ; i++)
        {
            String stri = s.substring(start , i+1);
            if(isPalindrome(stri))
            {
                temp.add(stri);
                solve(ans , temp , n , s , i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
}