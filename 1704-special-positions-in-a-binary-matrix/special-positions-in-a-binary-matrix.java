class Solution {
    public int numSpecial(int[][] mat) {
        int r = mat.length, c = mat[0].length, count = 0;
        for(int i=0 ; i<r ; i++)
        {
            for(int j=0 ; j<c ; j++)
            {
                boolean flag = true;
                if(mat[i][j] == 1)
                {
                    for(int k=0 ; k<c ; k++)
                    {
                        if(k == j) continue;
                        if(mat[i][k] == 1)
                        {
                            flag = false;
                            break;
                        }
                    }
                    if(flag)
                        for(int k=0 ; k<r ; k++)
                        {
                            if(k == i) continue;
                            if(mat[k][j] == 1)
                            {
                                flag = false;
                                break;
                            }
                        }
                    if(flag) count++;
                }
            }
        }
        return count;
    }
}