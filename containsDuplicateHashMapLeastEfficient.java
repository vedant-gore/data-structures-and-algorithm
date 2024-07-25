class containsDuplicateHashMapLeastEfficient {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        Map<Integer,Integer> duplicates = new HashMap<>();
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
                duplicates.put(nums[i], count);
            } 
        }

        for(int key : duplicates.keySet()){
            if(duplicates.get(key) >= 2) return true;
        }
        return false;
    }
}
