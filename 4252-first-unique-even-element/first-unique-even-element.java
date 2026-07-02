class Solution {
    public int firstUniqueEven(int[] nums) {
        // HashMap<Integer , Integer> map = new HashMap<>();
        // for(int num : nums) map.put(num , map.getOrDefault(num,0)+1);
        // for(int num : nums)
        // {
        //     if(map.get(num)==1)
        //     {
        //         if(num%2==0) return num;
        //     }
        // }
        // return -1;

        int n = nums.length;
        for(int i=0 ; i<n ; i++)
        {
            int num = nums[i];
            if(num%2==0)
            {
                int count = 0;
                for(int j=0 ; j<n ; j++)
                {
                    if(j==i) continue;
                    if(num == nums[j])
                    {
                        count++;
                        break;
                    }
                }
                if(count == 0) return num;
            }
        }
        return -1;
    }
}