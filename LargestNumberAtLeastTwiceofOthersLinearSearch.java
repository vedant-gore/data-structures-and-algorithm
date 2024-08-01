class LargestNumberAtLeastTwiceofOthersLinearSearch {
    public int dominantIndex(int[] nums) {
        int maxno = 0;
        int maxInd = 0;
        for(int i=0; i<nums.length; i++){
            if(maxno<nums[i]){
                maxno=nums[i];
                maxInd=i;
            }
            else continue;
        }
        int m=maxno/2;
        for(int i=0; i<nums.length; i++){
            if(maxno==nums[i]) continue;
            if(m < nums[i]) return -1;
        }
        return maxInd;
    }
}
