class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = Arrays.stream(aliceSizes).sum();
        int bobSum = Arrays.stream(bobSizes).sum();
        int diff = (bobSum - aliceSum) / 2; // Difference divided by 2
        
        Arrays.sort(bobSizes); // Sort bobSizes for binary search
        
        for (int aliceCandy : aliceSizes) {
            int target = aliceCandy + diff; // The candy size Bob needs to exchange
            int index = Arrays.binarySearch(bobSizes, target);
            if (index >= 0) { // Found the pair
                return new int[]{aliceCandy, bobSizes[index]};
            }
        }
        return new int[]{-1, -1}; // In case there is no answer, though the problem guarantees one.
    }
}
