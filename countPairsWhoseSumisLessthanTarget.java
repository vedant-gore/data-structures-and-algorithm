// TWO POINTER APPROACH
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count=0, h=0;
        // int[] numsArr = nums.stream().mapToInt(i -> i).toArray();
        int[] numsArr = new int[nums.size()];
        for(int i:nums) numsArr[h++]=i;
        for(int i=0; i<numsArr.length ; i++){
            for(int j=i+1; i<j && j<numsArr.length; j++){
                if(j<numsArr.length && (numsArr[i]+numsArr[j] < target)) count++;
            }
        }
        return count;
    }
}

// BINARY SEARCH APPROACH
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0; // This will hold the total count of pairs
        Integer[] numsArr = nums.toArray(new Integer[0]); // Convert the list to an array
        Arrays.sort(numsArr); // Sort the array
        
        for (int i = 0; i < numsArr.length; i++) { // For each number in the array
            int start = i + 1; // Start the line right after the current number
            int end = numsArr.length; // The end of the list
            int lessThan = target - numsArr[i]; // Calculate what value we need to stay under
            
            // Move the line towards the end to find the right spot
            while (start < end) {
                int mid = start + (end - start) / 2; // Find the middle between start and end
                if (numsArr[mid] < lessThan) { // If adding the middle number is still under the target
                    start = mid + 1; // Move the line to the right
                } else { // If it's too big
                    end = mid; // Move the line to the left
                }
            }
            
            count += start - i - 1; // Count the pairs and add to the total count
        }
        
        return count; // Return the total count of pairs
    }
}
