class Solution {
    public int search(int[] nums, int target) {
        if(target < nums[0] || target > nums[nums.length - 1]) return -1;
        int start = 0, end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target > nums[mid]) start = mid + 1;
            else if(target < nums[mid]) end = mid - 1;
            else return mid;
        }
        return -1;
    }
}