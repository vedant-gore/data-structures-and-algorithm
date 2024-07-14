// TIME LIMIT EXCEEDS AS THE TIME COMPLEXITY IS O(n2)

class Solution {
    public int[] sortArray(int[] nums) {
        int temp=0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length-1; j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
}
