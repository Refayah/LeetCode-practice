class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
        return intervals;
        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));
        List<int[]> result=new ArrayList<>();
        int[] temp=intervals[0];
        result.add(temp);
        for(int[] interval:intervals)
        {
            if(interval[0]<=temp[1])
            {
                temp[1]=Math.max(temp[1],interval[1]);
            }
            else{
                temp=interval;
                result.add(temp);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
