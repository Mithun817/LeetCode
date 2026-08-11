class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder str = new StringBuilder();
        String ans = "";
        int r=0, n = s.length();

        for(int i=0 ; i<n ; i++)
        {
            r = i + (2 * k);
            if(r<n)
            {
                int rev = 0;
                for(int j=i ; j<r ; j++ , i++ , rev++)
                {
                    if(rev==k)
                    {
                        ans += str.reverse().toString();
                        str.setLength(0);
                    }
                    str.append(s.charAt(j));
                }
                i--;
                if(str.length() > 0)
                {
                    ans += str.toString();
                    str.setLength(0);
                }
                //System.out.println(ans+" "+i);
            }
            else
            {
                int rev = 0;
                for(int j=i ; j<n ; j++ , i++ , rev++)
                {
                    if(rev==k)
                    {
                        ans += str.reverse().toString();
                        str.setLength(0);
                    }
                    str.append(s.charAt(j));
                }
                if(str.length() > 0)
                {
                    if(rev<=k) ans += str.reverse().toString();
                    else ans += str.toString();
                    str.setLength(0);
                }
            }
        }
        if(str.length()>0) ans += str.reverse().toString();
        return ans;
    }
}