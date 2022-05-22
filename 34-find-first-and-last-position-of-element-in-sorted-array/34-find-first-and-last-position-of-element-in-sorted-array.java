class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = search(nums,target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    
    private static int search(int[] arr, int target, boolean firstInd) {
         int start = 0, end = arr.length - 1, ans = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target > arr[mid]) start = mid + 1;
            else if(target < arr[mid]) end = mid - 1;
            else {
                ans = mid;
                if(firstInd) end = mid - 1;
                else start = mid + 1;
            }
        }
        return ans;
    }
}