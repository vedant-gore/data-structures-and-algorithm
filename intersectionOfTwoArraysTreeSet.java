class intersectionOfTwoArraysTreeSet {
    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> numset1 = new TreeSet<Integer>();
        for(int num : nums1){
            numset1.add(num);
        }
        TreeSet<Integer> numset2 = new TreeSet<Integer>();
        for(int num : nums2){
            numset2.add(num);
        }
        List<Integer> newarr = new ArrayList<>();
        // 4 9 5
        // 4 9 8
        // 1 2
        // 2
        if(numset1.size() > numset2.size()){
            for(int n: numset1){
                if(numset2.contains(n)) newarr.add(n);
            }
        }
        else{
            for(int n: numset2){
                if(numset1.contains(n)) newarr.add(n);
            }
        }

        // Convert the ArrayList to an int array
        int[] result = new int[newarr.size()];
        for (int i = 0; i < newarr.size(); i++) {
            result[i] = newarr.get(i);
        }

        return result;
        

    }
}
