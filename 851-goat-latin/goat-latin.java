class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder ans = new StringBuilder();
        StringBuilder aa = new StringBuilder();
        for(int i=0 ; i<sentence.length() ; i++) aa.append('a');
        String[] arr = sentence.split(" ");
        int n = arr.length;
        for(int i=0 ; i<n ; i++)
        {
            String v = arr[i].substring(0,1).toLowerCase();
            if(v.equals("a") || v.equals("e") || v.equals("i") || v.equals("o") || v.equals("u"))
            {
                ans.append(arr[i]);
                ans.append("ma");
            }
            else
            {
                ans.append(arr[i].substring(1 , arr[i].length()));
                ans.append(arr[i].charAt(0));
                ans.append("ma");
            }
            ans.append(aa.substring(0 , i+1));
            if(i != n-1) ans.append(" ");
        }
        return ans.toString();
    }
}