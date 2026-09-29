class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int n = num_people, candy = 1;
        int[]arr = new int[n];
        for(int i=0 ; candies > 0 ; i = (i+1)%n)
        {
            if(candy <= candies)
            {
                arr[i] += candy;
                candies -= candy;
                candy++;
            }
            else
            {
                arr[i] += candies;
                candies = 0;
            }
            // for(int j=0 ; j<n ; j++)
            // {
            //     System.out.print(arr[j]+" ");
            // }
            // System.out.println();
            // System.out.println("candies = "+candies);
            // System.out.println("candy = "+candy);
        }
        return arr;
    }
}