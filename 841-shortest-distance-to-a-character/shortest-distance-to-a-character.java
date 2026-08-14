class Solution {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == c) list.add(index);
            index++;
        }
        int n = s.length();
        int[] arr = new int[n];
        int ind = 0, i=0;
        for(char ch : s.toCharArray())
        {
            if(ch == c)
            {
                if(ind != list.size()-1) ind++;
                i++;
                continue;
            }
            if(ind == 0)
            {
                arr[i] = Math.abs(list.get(ind) - i);
            }
            else
            {
                arr[i] = Math.abs(Math.min(list.get(ind) - i , i - list.get(ind-1)));
            }
            i++;
        }
        return arr;
    }
}