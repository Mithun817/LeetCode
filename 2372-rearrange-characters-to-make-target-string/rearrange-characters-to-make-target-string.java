class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] arr = new int[26];
        for(char ch : s.toCharArray()) arr[ch-'a']++;
        int count = 0;
        while(true)
        {
            boolean flag = true;
            for(char ch : target.toCharArray())
            {
                if(arr[ch-'a']>0) arr[ch-'a']--;
                else
                {
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
            else break;
        }
        return count;
    }
}