class Solution {
    public int specialArray(int[] nums) {
        int start = 0, end = nums.length;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            int curr = count(nums, mid);
            
            if(curr == mid) return mid;
            else if(curr < mid) end = mid -1;
            else start = mid + 1;
        }
        return -1;
    }
    
    public static int count(int[] nums, int mid) {
        int res = 0;
        for(int num: nums) {
            if(num >= mid) {
                res++;
            }
        }
        return res;
    }
}