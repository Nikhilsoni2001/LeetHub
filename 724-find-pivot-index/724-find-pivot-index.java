class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length < 1) return -1;
        int ls = 0, rs = 0;
        for(int x: nums) rs += x;
        for(int i = 0; i < nums.length; i++) {
            rs -= nums[i];
            if(rs == ls) return i;
            ls += nums[i];
        }
        return -1;
    }
}