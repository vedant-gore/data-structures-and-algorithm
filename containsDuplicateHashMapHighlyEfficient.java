class containsDuplicateHashMapHighlyEfficient {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> duplicates = new HashMap<>();
        
        for (int num : nums) {
            if (duplicates.containsKey(num)) {
                duplicates.put(num, duplicates.get(num) + 1);
                if (duplicates.get(num) >= 2) return true;
            } else {
                duplicates.put(num, 1);
            }
        }
        return false;
    }
}
