class Solution {
    public int countPrimes(int n) {
        if(n<2) return 0;
        int count=0;
        boolean[] arr = new boolean[n];
        //arr[0] = arr[1] = true;
        for(int i=2 ; i*i<n ; i++){
            if(!arr[i]){
                for(int j=i*i ; j<n ; j+=i){
                    arr[j] = true;
                }
            }
        }
        for(int i=2 ; i<n ; i++){
            if(!arr[i]) count++;
        }
        return count;
    }
}