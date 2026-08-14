class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] cha = new int[26];
        int count = 0;
        for(char ch : chars.toCharArray())
        {
            cha[ch-'a']++;
        }
        for(String str : words)
        {
            boolean flag = true;
            int[] cha1 = cha.clone();
            for(char ch : str.toCharArray())
            {
                if(cha1[ch-'a']<1)
                {
                    flag = false;
                    break;
                }
                else cha1[ch-'a']--;
            }
            if(flag) count+=str.length();
        }
        return count;
    }
}