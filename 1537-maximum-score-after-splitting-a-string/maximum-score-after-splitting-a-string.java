class Solution {
    public int maxScore(String s) {
        int z = 0 , o = 0, max = Integer.MIN_VALUE;
        for(char ch : s.toCharArray()) if(ch == '1') o++;
        for(int i=0 ; i<s.length()-1 ; i++)
        {
            char ch = s.charAt(i);
            if(ch == '0') z++;
            else o--;
            max = Math.max(max , o+z);
        }
        return max;
    }
}