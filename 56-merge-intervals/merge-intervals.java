class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals , (a,b)->Integer.compare(a[0],b[0]) );
        if(intervals.length == 1)
        {
            return intervals;
        }

        List<int[]> list = new ArrayList<>();
        int row = intervals.length, col = intervals[0].length;

        list.add(intervals[0]);
        for(int i=1 ; i<row ; i++)
        {
            int[] prev = list.get(list.size() - 1);
            int[] curr = {intervals[i][0] , intervals[i][1]};

            if(prev[1] >= curr[0] )
            {
                prev[1] = Math.max(curr[1] , prev[1]);
            }
            else
            {
                list.add(curr);
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}