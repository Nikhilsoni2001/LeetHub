class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            int target = arr[i] * 2;
             if(target == 0 && arr[i+1] != 0) continue;
            if (res(arr, 0, n - 1, target)) return true;
        }
        return false;
    }
    
    private static boolean res(int[] arr, int left, int right, int target) {
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) return true;
            else if(target > arr[mid]) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}