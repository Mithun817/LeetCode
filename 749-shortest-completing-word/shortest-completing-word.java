class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String str1="";
        StringBuilder str2 = new StringBuilder();

        for(char ch : licensePlate.toCharArray())
        {
            if(Character.isLetter(ch)) str1 += (String.valueOf(ch).toLowerCase());
        }
        int min=Integer.MAX_VALUE;
        int index = 0;
        for(int i=0 ; i<words.length ; i++)
        {
            String st = words[i];
            int n = st.length();
            int[] arr = new int[26];

            for(int j=0 ; j<n ; j++)
            {
                arr[st.charAt(j)-'a']++;
            }
            boolean flag = true;
            for(char ch : str1.toCharArray())
            {
                if(arr[ch-'a']==0)
                {
                    flag = false;
                    break;
                }
                else arr[ch-'a']--;
            }
            if(flag)
            {
                if(min > n)
                {
                    index = i;
                    min = n;
                }
            }
        }
        return words[index];
    }
}