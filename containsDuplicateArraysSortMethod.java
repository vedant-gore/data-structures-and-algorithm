class containsDuplicateArraysSortMethod {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int l=0, r = nums.length;
        int count = 1;
        for (int y = l + 1; y < r; y++) {
            if (nums[y] == nums[y - 1]) {
                count++;
                if (count >= 2) {
                    return true;
                }
            } else {
                count = 1;
            }
        }
        return false;
    }
}
