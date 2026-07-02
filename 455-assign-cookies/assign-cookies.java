class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int sn = s.length , gn = g.length;
        Arrays.sort(g);Arrays.sort(s);
        int gi=0 , si=0;
        while(gi<gn && si<sn)
        {
            if(s[si] >= g[gi])
            {
                gi++;
            }
            si++;
        }
        return gi;
    }
}