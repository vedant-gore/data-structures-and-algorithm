class heightCheckerSortAndCompare {
    public int heightChecker(int[] heights) {
        int totalIndices=0, h=0;
        int[] expected = new int[heights.length];
        for(int num: heights) expected[h++]=num;
        Arrays.sort(expected);
        for(int i=0; i<heights.length; i++){
            if(heights[i] != expected[i]){
                totalIndices++;
            }
        }
        return totalIndices;
    }
}
