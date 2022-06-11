class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        
        int count = 0;
        int[] prev = intervals[0];
        
        for(int i = 1; i < intervals.length; i++) {
            int[] current = intervals[i];
            
            if(current[0] < prev[1]) {
                count++;
                prev[1] = Math.min(prev[1], current[1]);
            } else {
                prev[0] = current[0];
                prev[1] = current[1];
            }
        }
        return count;
    }
}