/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int bad = -1, i = 0, j = n;
        while(i <= j) {
            int mid = i + (j - i) / 2;
            if(isBadVersion(mid)) {
                bad = mid;
                j = mid - 1;
            }else {
                i = mid + 1;
            }
        }
        return bad;
    }
}