class Solution {
    public int mySqrt(int x) {
        int start = 0, end = x;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            // check for overflow
            if(mid > 46340){
                end = mid - 1;
            }
            else if(x == mid * mid) return mid;
            else if(x < mid * mid) end = mid - 1;
            else start = mid + 1;
        }
        return end;
        
        
    }
}