class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] - (mid + 1) < k) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l + k;
    }
}
