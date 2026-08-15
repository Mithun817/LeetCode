class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
        char[] arr = new char[n];
        int i=0;
        for(char ch : s.toCharArray())
        {
            arr[indices[i++]] = ch;
        }
        return String.valueOf(arr);
    }
}