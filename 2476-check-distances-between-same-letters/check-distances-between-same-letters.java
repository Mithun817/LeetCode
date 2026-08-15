class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[] arr = new int[26];
        int l = 0 , r = 1;
        for(; l<r && l<s.length(); )
        {
            if(r == s.length())
            {
                l++;r=l+1;
                continue;
            }
            //System.out.println(s.charAt(l)+" "+s.charAt(r)+" "+l+" "+r);
            if(s.charAt(l) == s.charAt(r))
            {
                arr[s.charAt(l)-'a'] = (r-l)-1;
                l++;
                r = l+1;
            }
            else r++;
        }
        //for(int i=0 ; i<26 ; i++) System.out.print(arr[i]+" ");
        for(char ch : s.toCharArray())
        {
            if(arr[ch-'a'] != distance[ch-'a']) return false;
        }
        return true;
    }
}