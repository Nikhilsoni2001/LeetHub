class Solution {
    public boolean isPerfectSquare(int num) {
        long start = 1, end = num;
        while(start <= end) {
            long mid = start + (end - start) / 2;
            long sq = mid * mid;
            if(num == sq) return true;
            else if(num > sq) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }
}