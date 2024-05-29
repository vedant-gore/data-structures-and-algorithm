//ONE POINTER METHOD
class Solution {
    public List<Integer> targetIndices(int[] nums, int target){
        Arrays.sort(nums);
        List<Integer> targetindices = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target) targetindices.add(i);
        } 
        return targetindices;
    }
}

//BINARY SEARCH METHOD
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ti = new ArrayList<Integer>();
        int first = first(nums, target);
        int last = last(nums, target);
        if(first==-1) return ti;
        ti.add(first);
        if(first==last) return ti;
        for(int i=first+1; i<=last; i++){
            ti.add(i);
        }
        return ti;
    }
    public static int first(int[] nums, int target){
            int s1 = 0, e1 = nums.length-1, ans = -1;
            while(s1<=e1){
                int m1 = s1+(e1-s1)/2;
                if(nums[m1]==target){
                    ans=m1;
                    e1=m1-1;
                }
                else if(nums[m1]>target) e1=m1-1;
                else s1=m1+1;
            }
            return ans;
        }
        public static int last(int[] nums, int target){
            int s2 = 0, e2 = nums.length-1, ans = -1;
            while(s2<=e2){
                int m2 = s2+(e2-s2)/2;
                if(nums[m2]==target){
                    ans=m2;
                    s2=m2+1;
                }
                else if(nums[m2]>target) e2=m2-1;
                else s2=m2+1;
            }
            return ans;
        }
}