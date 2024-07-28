/**
 * Intuition:
 * The goal is to sort an array such that all even numbers come before all odd numbers.
 * Using a divide-and-conquer approach, similar to merge sort, helps achieve this efficiently.
 * 
 * Approach:
 * 1. Divide: Recursively divide the array into two halves until each subarray has one element.
 * 2. Merge: During the merge step, ensure that even numbers are placed before odd numbers.
 * 3. Sort: Use the merge function to combine the subarrays while maintaining the parity order.
 * 
 * Complexity:
 * - Time Complexity: O(n log n), where n is the length of the array. This is due to the divide-and-conquer approach similar to merge sort.
 * - Space Complexity: O(n), for the temporary arrays used during the merge process.
 */
class Solution {
    static void divide(int[] nums, int l, int r){
        if(l<r){
            int m=(l+r)/2;
            divide(nums, l, m);
            divide(nums, m+1, r);
            merge(nums, l, r, m);
        }
    }

    static void merge(int[] arr, int l, int r, int m){
        int n1 = m - l +1;
        int n2 = r - m;
        int[] larr = new int[n1];
        int[] rarr = new int[n2];

        for(int x=0; x<n1; x++){
            larr[x]=arr[l+x];
        }
        for(int x=0; x<n2; x++){
            rarr[x]=arr[m+1+x];
        }
        int i=0, j=0, k=l;
        while (i < n1 && j < n2) {
            if (larr[i] % 2 == 0) {
                arr[k++] = larr[i++];
            } else if (rarr[j] % 2 == 0) {
                arr[k++] = rarr[j++];
            } else {
                break;
            }
        }

        while (i < n1) {
            arr[k++] = larr[i++];
        }
        while (j < n2) {
            arr[k++] = rarr[j++];
        }
    }

    public int[] sortArrayByParity(int[] nums) {
        if(nums.length==1) return nums;
        divide(nums, 0, nums.length-1);
        return nums;
    }
}
