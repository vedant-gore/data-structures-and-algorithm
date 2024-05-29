class Solution{
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            long mid = start + (end-start)/2;
            if(target == nums[(int)mid]){
                return (int)mid;
            }
            else if(target > nums[(int)mid]){
                start = (int)mid+1;
            }
            else{
                end = (int)mid-1;
            }
        }
        return start;
    }
}