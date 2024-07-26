import java.util.Arrays;

class Solution {
    public int thirdMaxSortingTraversal(int[] nums) {
        Arrays.sort(nums);  // Sort the array
        int distinctCount = 1;  // Start with the first distinct number
        int currentMax = nums[nums.length - 1];  // Start with the maximum number

        for (int i = nums.length - 2; i >= 0; i--) {  // Start from the second last element
            if (nums[i] != currentMax) {
                distinctCount++;
                currentMax = nums[i];
            }
            if (distinctCount == 3) {  // We need the third distinct maximum
                return nums[i];
            }
        }
        return nums[nums.length - 1];  // If there are less than 3 distinct numbers, return the maximum
    }
}
