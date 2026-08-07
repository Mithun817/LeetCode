class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int carry = 0, n = num.length, digit = 0, i=n-1;
        while(i>=0 || k>0 || carry>0)
        {
            int sum = carry;
            if(i>=0)
            {
                sum += num[i--];
            }
            sum += k%10;
            k /= 10;
            ans.add(0 , sum%10);
            carry = sum/10;
        }
        return ans;
    }
}