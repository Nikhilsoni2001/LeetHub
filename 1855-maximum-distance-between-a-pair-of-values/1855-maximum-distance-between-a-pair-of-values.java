class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i = 0, j = 0, max = Integer.MIN_VALUE;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] > nums2[j]) i++;
            else {
                max = Math.max(max, j++ - i);
            }
        }
        return max < 0 ? 0 : max;
    }
}