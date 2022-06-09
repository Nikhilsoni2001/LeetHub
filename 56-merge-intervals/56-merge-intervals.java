class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;
        
        Arrays.sort(intervals, (a1, a2) -> Integer.compare(a1[0], a2[0]));
        
        List<int[]> arr = new ArrayList<>();
        int[] curr = intervals[0];
        arr.add(curr);
        for(int[] interval: intervals) {
            int curr_beg = curr[0];
            int curr_end = curr[1];
            int next_beg = interval[0];
            int next_end = interval[1];
            
            if(curr_end >= next_beg) {
                curr[1] = Math.max(curr_end, next_end);
            } else {
                curr =  interval;
                arr.add(curr);
            }
        }
        
        return arr.toArray(new int[arr.size()][]);
    }
}