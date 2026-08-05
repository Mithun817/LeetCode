class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] arr = new boolean[right+1];
        List<Integer> primes = new ArrayList<>();
        int minn = Integer.MAX_VALUE , prev = 0;

        for(int i=2 ; i*i<=right ; i++)
        {
            if(!arr[i])
            {
                for(int j=i*i ; j<=right ; j+=i)
                {
                    arr[j] = true;
                }
            }
        }
        for(int i=left ; i<=right ; i++)
        {
            if(i<2) continue;
            if(!arr[i])
            {
                primes.add(i);
                minn = Math.min(minn , i-prev);
                prev = i;
            }
        }
        //System.out.println(primes);
        for(int i=0 ; i<primes.size()-1 ; i++)
        {
            int n1 = primes.get(i);
            int n2 = primes.get(i+1);
            if(n2-n1 == minn) return new int[] {n1 , n2};
        }
        return new int[] {-1 , -1};
    }
}