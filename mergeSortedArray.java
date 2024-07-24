class Solution{
    public void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        // Initialize three pointers to track the current index of nums1, nums2, and the merged array
        int pointerForNums1 = m - 1;
        int pointerForNums2 = n - 1;
        int pointerForMerged = m + n - 1;

        // Continue merging until all elements from either nums1 or nums2 have been added to the merged array
        while ((pointerForNums1 >= 0) && (pointerForNums2 >= 0)) {
            // If the current element in nums1 is smaller than the current element in nums2
            if (nums1[pointerForNums1] < nums2[pointerForNums2]) {
                // Add the current element from nums2 to the merged array
                nums1[pointerForMerged] = nums2[pointerForNums2];
                // Move the pointer for nums2 to the next element
                pointerForNums2--;
            } else {
                // Otherwise, add the current element from nums1 to the merged array
                nums1[pointerForMerged] = nums1[pointerForNums1];
                // Move the pointer for nums1 to the next element
                pointerForNums1--;
            }
            // Move the pointer for the merged array to the next position
            pointerForMerged--;
        }

        // If there are still elements in nums2 that haven't been added to the merged array
        if (pointerForNums2 >= 0) {
            // Copy these elements to the beginning of the merged array
            for (int i = 0; i <= pointerForNums2; i++) {
                nums1[i] = nums2[i];
            }
        }
    }
