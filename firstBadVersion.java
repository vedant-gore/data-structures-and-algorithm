/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class firstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1; // best possible case for a version to be bad
        int end = n; // not the best possible case for a version to be bad because last one will always be a bad version so there exists only two possible cases that is in the first half. Even mid cannot be considered as the best possible solution as the versions before mid can also be bad hence best possible case is first
        while(start<=end){
            int mid = start + (end-start)/2; // best possible case for a version to be bad
            int x = mid;
            boolean truth = isBadVersion(x);
        }
    }
}