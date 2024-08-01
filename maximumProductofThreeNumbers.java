import java.util.Arrays;

class maximumProductofThreeNumbers {
    public int maximumProduct(int[] nums) {
        if (nums.length == 3) return nums[0] * nums[1] * nums[2];
        
        Arrays.sort(nums);
        
        // Calculate the product of the three largest numbers
        int max1 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        
        // Calculate the product of the two smallest numbers and the largest number
        int max2 = nums[0] * nums[1] * nums[nums.length - 1];
        
        // Return the maximum of the two products
        return Math.max(max1, max2);
    }
}
