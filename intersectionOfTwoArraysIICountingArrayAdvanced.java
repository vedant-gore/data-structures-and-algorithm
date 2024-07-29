class intersectionOfTwoArraysIICountingArrayAdvanced {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] viewed = new int[1001];

        for(int n:nums1) viewed[n]++;;

        List<Integer> intersect = new ArrayList<>();
        for(int n:nums2){
            if(viewed[n]>0){ //checking if n from nums2 exists in viewed as well
                intersect.add(n); // if yes then adding it in intersect
                viewed[n]--; // By decrementing viewed[e]--, we ensure that we account for the element being used. This prevents the same element from being added more times than it appears in both arrays.
            }
        }

        int[] result = new int[intersect.size()];
        for (int i = 0; i < intersect.size(); i++) {
            result[i] = intersect.get(i);
        }
        return result;
    }
}
