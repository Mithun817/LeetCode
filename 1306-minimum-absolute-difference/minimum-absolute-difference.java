class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length, min = Integer.MAX_VALUE, i=0, j=1;
        List<Integer> list = new ArrayList<>();

        while(j<n)
        {
            int num1 = arr[i] , num2 = arr[j], diff = num2 - num1;
            if(min > diff)
            {
                ans.clear();
                if(!ans.contains(Arrays.asList(num1,num2))) ans.add(Arrays.asList(num1,num2));
                min = diff;
            }
            else if(min == diff)
            {
                if(!ans.contains(Arrays.asList(num1,num2))) ans.add(Arrays.asList(num1,num2));
            }
            i++;j++;
        }
        return ans;
    }
}