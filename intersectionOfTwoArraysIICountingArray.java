class intersectionOfTwoArraysIICountingArray {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] n1 = new int[1001];
        int[] n2 = new int[1001];

        for(int n:nums1) n1[n]++;
        for(int n:nums2) n2[n]++;

        List<Integer> intersect = new ArrayList<>();
        for(int i=0; i<1001; i++){
            int minCount = Math.min(n1[i], n2[i]);
            for(int j=0; j<minCount; j++) intersect.add(i);
        }
        // Convert the list to an array
        int[] result = new int[intersect.size()];
        for (int i = 0; i < intersect.size(); i++) {
            result[i] = intersect.get(i);
        }

        return result;
    }
}
