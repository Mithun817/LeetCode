class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals , (a,b) -> Integer.compare(a[1],b[1]));
        int count = 0,n=intervals.length;
        int col = intervals[0].length , row = intervals.length;
        int first = intervals[0][0];
        int second = intervals[0][1];
        for (int j = 1; j < n; j++)
        {
            int first2 = intervals[j][0];
            int second2 = intervals[j][1];
            if(second<=first2)
            {
                first = first2;
                second = second2;
            }
            else
            {
                count++;
                if(second2 < second)
                {
                    first = first2;
                    second = second2;
                }
            }
        }
        return count;
    }
}