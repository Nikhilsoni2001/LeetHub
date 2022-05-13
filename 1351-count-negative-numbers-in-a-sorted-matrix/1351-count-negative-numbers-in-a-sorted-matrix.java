class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int[] arr: grid) count += countNeg(arr);
        return count;
    }
    
    private static int countNeg(int[] arr) {
        int i = 0, j = arr.length - 1;
        while(i <= j) {
            int mid = i + (j - i) / 2;
            if(arr[mid] < 0) j = mid - 1;
            else i = mid + 1;
        }
        return arr.length - i;
    }
}