// METHOD 1
class Solution {
    public int search(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target) return i;
        }
        return -1;
    }
}

// METHOD 2 BINARY SEARCH
class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e= nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]==target) return mid;
            if(nums[s] <= nums[mid]){
                if(target>=nums[s] && target < nums[mid]) e=mid-1;
                else s=mid+1;
            }
            else{
                if(nums[mid]<target && target <= nums[e]) s=mid+1;
                else e=mid-1;
            }
        }    
        return -1;
    }
}    
