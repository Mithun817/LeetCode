class Solution {
    public String[] findWords(String[] words) {
        HashSet<Character> r1 = new HashSet<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
        HashSet<Character> r2 = new HashSet<>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
        HashSet<Character> r3 = new HashSet<>(Arrays.asList('z','x','c','v','b','n','m'));

        List<String> ans = new ArrayList<>();

        for(String str : words)
        {
            String strr = str.toLowerCase();
            int row = 0;
            boolean flag = true;
            for(char ch : strr.toCharArray())
            {
                int rrr = 0;
                if(r1.contains(ch)) rrr = 1;
                else if(r2.contains(ch)) rrr = 2;
                else if(r3.contains(ch)) rrr = 3;
                if(row != 0)
                {
                    if(row != rrr)
                    {
                        flag = false;
                        break;
                    }
                }
                else row = rrr;
            }
            if(flag) ans.add(str);
        }
        int size = ans.size();
        String[] arr = new String[size];
        for(int i=0 ; i<size ; i++) arr[i] = ans.get(i);
        return arr;
    }
}