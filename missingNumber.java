import java.util.Arrays;

public class missingNumber {
    
}
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            long mid = start + (end - start)/2;
            if(nums[(int)mid] == mid){
                start = (int)mid + 1;
            }
            else{
                end = (int)mid -1 ;
            }
        }
        return start; 
    }
}