import java.math.*;

class Solution {
    public int myAtoi(String s) {
        // int max = Integer.MAX_VALUE;
        // int min = Integer.MIN_VALUE;

        // String ss = s.trim();
        // char[] arr = ss.toCharArray();
        // int n = arr.length;
        // StringBuilder str = new StringBuilder();

        // for(int i=0 ; i<n ; i++)
        // {
        //     char ch = arr[i];

        //     if(ch=='-' || ch=='+')
        //     {
        //         if(str.length() == 1 && (str.charAt(0)=='-' || str.charAt(0) == '+'))
        //         {
        //             return 0;
        //         }
        //         else if(str.length() != 0) break;
        //         else str.append(ch);
        //     }
        //     else if(Character.isDigit(ch))
        //     {
        //         str.append(ch);
        //     }
        //     else break;
        // }
        // if(str.length() == 0 || (str.length() == 1 && (str.charAt(0)=='-' || str.charAt(0) == '+'))) return 0;
        // BigInteger number = new BigInteger(str.toString());

        // if(number.compareTo(BigInteger.valueOf(max)) == 1) return max;
        // else if(number.compareTo(BigInteger.valueOf(min)) == -1) return min;
        // else return number.intValue();

        //Optimized Code

        String ss = s.trim();

        int result=0 , i=0 , n=ss.length() , sign=1;
        if(n==0) return 0;
        
        if(i<n && ss.charAt(i)=='+' || ss.charAt(i)=='-')
        {
            sign = ss.charAt(i)=='+' ? 1 : -1;
            i++;
        }
        
        while(i<n && Character.isDigit(ss.charAt(i)))
        {
            int digit = ss.charAt(i)-'0';
            if (result > (Integer.MAX_VALUE - digit) / 10)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            
            result = result*10 + (digit);
            i++;
        }
        return result*sign;
    }
}