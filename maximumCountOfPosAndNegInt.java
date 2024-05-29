// METHOD 1
class Solution {
    public int maximumCount(int[] nums) {
        int neg=0;
        for(int n=0; n<nums.length ;n++){
            if(nums[n]<0) neg++;
            else if(nums[n]>0 && neg<nums.length-n) return nums.length-n;
            else if(nums[n]!=0) return neg;
        }
    return neg;}
}

// METHOD 2
class Solution {
    public int maximumCount(int[] nums) {
        int pos=0, neg=0;
        for(int num:nums){
            pos += (num > 0) ? 1 : 0; // Increment pos if num is positive
            neg += (num < 0) ? 1 : 0; // Increment neg if num is non-positive
        }
        return pos > neg ? pos : neg; // Return the larger count
    }
}

// METHOD 3
class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1;
        int firstPositiveIndex = n, lastNegativeIndex = -1;

        // Find the first positive number
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > 0) {
                firstPositiveIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // Reset the pointers
        left = 0; right = n - 1;

        // Find the last negative number
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < 0) {
                lastNegativeIndex = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Calculate the counts of positive and negative numbers
        int posCount = n - firstPositiveIndex;
        int negCount = lastNegativeIndex + 1;

        // Return the maximum count
        return Math.max(posCount, negCount);
    }
}
