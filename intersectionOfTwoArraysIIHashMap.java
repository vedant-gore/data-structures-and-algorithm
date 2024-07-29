class intersectionOfTwoArrayIIHashMap {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int num:nums1) numMap.put(num, numMap.getOrDefault(num,0)+1);

        List<Integer> intersect = new ArrayList<>();
        for(int num:nums2){
            if(numMap.containsKey(num) && numMap.get(num)>0 ){
                intersect.add(num);
                numMap.put(num, numMap.get(num)-1);
            }
        }

        int[] result = new int[intersect.size()];
        int i = 0;
        for (int num : intersect) {
            result[i++] = num;
        }

        return result;
    }
}
