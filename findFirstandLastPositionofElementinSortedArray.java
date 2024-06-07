class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0, end=nums.length-1;
        int first = start(nums, target);
        int last = end(nums, target);
        int[] arr = new int[2];
        arr[0]=first;
        arr[1]=last;
        return arr;
    }

    public static int start(int nums[], int target){
        int start=0, end=nums.length-1, ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                end=mid-1;
                ans=mid;
            }
            else if(nums[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return ans;
    }
    public static int end(int nums[], int target){
        int start=0, end=nums.length-1, ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                start=mid+1;
                ans=mid;
            }
            else if(nums[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return ans;
    }
}
