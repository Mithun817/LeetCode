class Solution {
    public String finalString(String s) {
        StringBuilder str = new StringBuilder();
        int n = s.length();

        for(int i=0 ; i<n ; i++)
        {
            if(s.charAt(i) == 'i')
            {
                str = str.reverse();
            }
            else str.append(s.charAt(i));
        }
        return str.toString();
    }
}