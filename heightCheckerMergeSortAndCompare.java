class heightCheckerMergeSortAndCompare {
    static void divide(int[] expected, int l, int r){
        if(l<r){
            int m=(l+r)/2;
            divide(expected, l, m);
            divide(expected, m+1, r);
            merge(expected, l, r, m);
        }
    }

    static void merge(int[] expected, int l, int r, int m){
        int l1 = m-l+1;
        int l2 = r-m;
        int[] arr1 = new int[l1];
        int[] arr2 = new int[l2];
        for(int i=0; i<l1; i++){
            arr1[i] = expected[l+i];
        }
        for(int i=0; i<l2; i++){
            arr2[i] = expected[m+1+i];
        }
        int i=0, j=0, k=l;
        while(i<l1 && j<l2){
            if(arr1[i]<=arr2[j]){
                expected[k]=arr1[i];
                i++;
                k++;
            }
            else{
                expected[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<l1){
            expected[k]=arr1[i];
            i++;
            k++;
        }
        while(j<l2){
            expected[k]=arr2[j];
            j++;
            k++;
        }
    }

    public int heightChecker(int[] heights) {
        int totalIndices=0, h=0;
        int[] expected = new int[heights.length];
        for(int num: heights) expected[h++]=num;
        divide(expected, 0, expected.length-1);
        for(int i=0; i<heights.length; i++){
            if(heights[i] != expected[i]){
                totalIndices++;
            }
        }
        return totalIndices;
    }
}
