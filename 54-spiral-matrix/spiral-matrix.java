class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length , col = matrix[0].length;
        ArrayList<Integer> arr = new ArrayList<>();
        int top = 0 , bottom = row-1 , right = col-1 , left = 0;

        while(top<=bottom && left<=right)
        {
            for(int i=left ; i<=right ; i++)
            {
                arr.add(matrix[top][i]);
            }
            top++;
            for(int i=top ; i<=bottom ; i++)
            {
                arr.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right ; i>=left ; i--)
                {
                    arr.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom; i>=top ; i--)
                {
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }
        return arr;
    }
}