class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length , c = matrix[0].length;
        int[] arr = new int[n+1];
        for(int i=0 ; i<n ; i++)
        {
            Arrays.fill(arr , 1);
            for(int j=0 ; j<c ; j++)
            {
                arr[matrix[i][j]]--;
            }
            for(int k=1 ; k<n+1 ; k++)
            {
                if(arr[k] != 0) return false;
            }
        }
        for(int j = 0; j < n; j++) {

            Arrays.fill(arr, 1);

            for(int i = 0; i < n; i++) {
                arr[matrix[i][j]]--;
            }

            for(int k = 1; k <= n; k++) {
                if(arr[k] != 0)
                    return false;
            }
        }
        return true;

    }
}