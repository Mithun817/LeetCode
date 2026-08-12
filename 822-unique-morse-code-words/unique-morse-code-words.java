class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();

        for(String str : words)
        {
            int n = str.length();
            StringBuilder s = new StringBuilder();

            for(int i=0 ; i<n ; i++)
            {
                s.append(morse[str.charAt(i) - 'a']);
            }
            set.add(s.toString());
        }
        return set.size();
    }
}