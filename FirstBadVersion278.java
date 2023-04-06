package leetcode;

public class FirstBadVersion278 {
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
/**
    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            // SUM OF 2 BIG INTEGERS CANBE OUT OF BOUNDARY OF INTEGER
            int low = 0; int high = n;

            while ( low <= high ) {
                int mid = low + (high-low)/2;

                if( isBadVersion(mid) && !isBadVersion (mid-1) )
                    return mid;

                else if( !isBadVersion(mid) )
                    low = mid+1;
                else
                    high= mid;

            }
            return -1;
        }
    }
 */
}
