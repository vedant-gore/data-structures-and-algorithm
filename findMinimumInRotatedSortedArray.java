class Solution {
    public int findMin(int[] nums) {
        int start=0, end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            // go step by step =>
            // 1. check start<end? true?-> return start
            // 2. if mid>=start -> number is present on the right side only
            // 3. if mid<mid-1 -> smallest number is mid
            // 4. else the number is present in the first half -> end=mid-1
            if(nums[start]<=nums[end]) return nums[start];
            else if(nums[mid]>=nums[start]) start=mid+1;
            else if(nums[mid]<nums[mid-1]) return nums[mid];
            else end=mid-1;
        }
        return nums[start];
    }
}
