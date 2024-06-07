// BINARY SEARCH 01
class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid + 1]) start=mid+1;
            else end = mid;
        }
        return start;
    }
}

// BINARY SEARCH 02
class Solution {
    public int findPeakElement(int[] nums) {
        int start=0, end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums.length==1) return 0;
            else if(start==mid){
                if(nums[mid]>nums[end]) return mid;
                else return end;
            }
            else if(nums[mid]>nums[mid-1] && nums[mid]<nums[mid+1]) start=mid+1;
            else if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
            else end=mid-1;
        }
        return start;
    }
}
