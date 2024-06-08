// METHOD 1 - TWO POINTER METHOD
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] indices = new int[2];
        outerloop:
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if((numbers[i]+numbers[j])==target){
                    indices[0]=i+1;
                    indices[1]=j+1;
                    break outerloop;
                }
            }
        }
        return indices;
    }
}

// METHOD 2 - BINARY SEARCH
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // go step by step
        // ascending sorted array
        // 1<=i1<i2<=numbers.length
        // return i1 & i2 +1 +1 as an array[]
        int start=0, end=numbers.length-1;
        while(start<end){
            int sum=numbers[start]+numbers[end];
            if(sum==target) return new int[]{start+1, end+1};
            else if(sum<target) start++;
            else end--;
        }
        return new int[]{1,1};
    }
}
