class sortArrayByParityIISwapping {
    public int[] sortArrayByParityII(int[] nums) {
        int evenIndex = 0; // Pointer for the next even index
        int oddIndex = 1;  // Pointer for the next odd index
        int n = nums.length;

        while (evenIndex < n && oddIndex < n) {
            // Move evenIndex to the next even index that holds an odd number
            while (evenIndex < n && nums[evenIndex] % 2 == 0) {
                evenIndex += 2;
            }

            // Move oddIndex to the next odd index that holds an even number
            while (oddIndex < n && nums[oddIndex] % 2 == 1) {
                oddIndex += 2;
            }

            // Swap the elements at evenIndex and oddIndex if both are within bounds
            if (evenIndex < n && oddIndex < n) {
                int temp = nums[evenIndex];
                nums[evenIndex] = nums[oddIndex];
                nums[oddIndex] = temp;
            }
        }

        return nums;
    }
}
