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
