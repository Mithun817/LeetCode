class Solution {
    public String baseNeg2(int n) {
        if(n==0) return "0";
        int temp = n;
        StringBuilder str = new StringBuilder();
        while(true)
        {
            int rem = temp%-2;
            if(rem<0) rem += 2;
            str.append(rem);
            if(temp == 1) break;
            temp = (temp-rem)/-2;
        }
        return str.reverse().toString();
    }
}