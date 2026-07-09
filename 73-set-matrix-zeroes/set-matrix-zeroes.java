class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        List<List<Integer>> index = new ArrayList<>();

        for(int i=0 ; i<row ; i++)
        {
            for(int j=0 ; j<col ; j++)
            {
                if(matrix[i][j] == 0) index.add(Arrays.asList(i,j));
            }
        }

        for(int i=0 ; i<index.size() ; i++)
        {
            int ii=index.get(i).get(0);
            int jj=index.get(i).get(1);

            for(int k=0 ; k<col ; k++)
            {
                matrix[ii][k] = 0;
            }
            for(int k=0 ; k<row ; k++)
            {
                matrix[k][jj] = 0;
            }
        }
    }
}