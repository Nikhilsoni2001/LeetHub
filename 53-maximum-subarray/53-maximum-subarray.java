class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_far = Integer.MIN_VALUE, max_ends_here = 0;
        for(int num: nums) {
            max_ends_here += num;
            if(max_ends_here > max_so_far) max_so_far = max_ends_here;
            if(max_ends_here < 0) max_ends_here = 0;
        }
        return max_so_far;
    }
}