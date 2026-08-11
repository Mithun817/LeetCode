class Solution {
    public int percentageLetter(String s, char letter) {
        int p = 0;
        for(char ch : s.toCharArray()) if(letter == ch) p++;
        return (int)(((double)p / s.length()) * 100);
    }
}