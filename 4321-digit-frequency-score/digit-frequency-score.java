class Solution {
    public int digitFrequencyScore(int n) {
        if(n<10) return n; 
        HashMap<Integer , Integer> map = new HashMap<>();
        while(n!=0)
        {
            int rem = n%10;
            map.put(rem , map.getOrDefault(rem , 0) + 1);
            n/=10;
        }
        int ans = 0;
        for(int key : map.keySet())
        {
            ans += key*map.get(key);
        }
        return ans;
    }
}