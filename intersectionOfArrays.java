class intersectionOfArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> unique = new ArrayList<>();
        int[] n1 = new int[1001];
        int[] n2 = new int[1001];

        // replace 0s of n1 & n2 with 1 at index num
        // if num is 2,5,.. in nums1 then: n1 would be [0,0,1,0,0,1,0,..] 
        // marking presence in nums1 and nums2
        for(int num:nums1){
            n1[num] = 1;
        }
        for(int num:nums2){
            n2[num] = 1;
        }

        // cannot use array since we are unsure of how many unique elements will be there
        // finding common elements
        for(int i=0; i<1001; i++){
            if(n1[i]==1 && n2[i]==1) unique.add(i);
        }

        // convert arraylist to array
        int size = unique.size();
        int [] result = new int[size];
        
        for(int i = 0; i < size; i++){
            result[i] = unique.get(i);
        }

        return result;
    }
}
