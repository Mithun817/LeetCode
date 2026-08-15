class Solution {
    public String interpret(String command) {
        int n = command.length();
        StringBuilder str = new StringBuilder();
        for(int i=0 ; i<n ; i++)
        {
            char ch = command.charAt(i);
            if(ch == 'G')
            {
                str.append(ch);
            }
            else if(ch == '(')
            {
                if(command.substring(i,i+2).equals("()"))
                {
                    str.append('o');
                    i++;
                }
                else if(command.substring(i,i+4).equals("(al)"))
                {
                    str.append("al");
                    i+=3;
                }
            }
        }
        return str.toString();
    }
}