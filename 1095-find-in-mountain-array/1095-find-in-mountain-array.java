/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0, end = mountainArr.length() - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(mountainArr.get(mid) > mountainArr.get(mid + 1)) end = mid;
            else start = mid + 1;
        }
        int peak = end;
        
        int firstTry = res(mountainArr, target, 0, peak);
        if(firstTry != -1) return firstTry;
        return res(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }
    
    private static int res(MountainArray arr, int target, int start, int end) {
        boolean asc = arr.get(start) < arr.get(end);
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr.get(mid) == target) return mid;
            if(asc) {
                if(target > arr.get(mid)) start = mid + 1;
                else end = mid - 1;
            } else {
                if(target > arr.get(mid)) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}