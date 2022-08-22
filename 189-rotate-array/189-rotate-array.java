class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        if(k < 0) k += nums.length;
        
        reverse(0, nums.length - k - 1, nums);
        reverse(nums.length - k, nums.length - 1, nums);
        reverse(0, nums.length - 1, nums);
    }
    
    public void reverse(int start, int end, int[] arr) {
        int i = start, j = end;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}