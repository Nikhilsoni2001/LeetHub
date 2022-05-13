class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] arr: matrix) {
            int i = 0, j = arr.length - 1;
            if(target >= arr[i] && target <= arr[j]) {
                return findRes(arr, i, j, target);    
            }
        }
        return false;
    }
    
    private static boolean findRes(int[] arr, int i, int j, int target) {
        while(i <= j) {
            int mid = i + (j - i) / 2;
            if(target == arr[mid]) return true;
            else if(target > arr[mid]) i = mid + 1;
            else j = mid - 1;
        }
        return false;
    }
}