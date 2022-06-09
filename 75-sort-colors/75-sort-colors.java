class Solution {
    public void sortColors(int[] nums) {
        int s = 0, e = nums.length - 1, p = 0;
        while(p <= e) {
            if(nums[p] == 0) {
                swap(nums, p, s);
                p++;
                s++;
            }
            else if(nums[p] == 1) p++;
            else if(nums[p] == 2) {
                swap(nums, p, e);
                e--;
            }
        }
    }
    
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}