class theKWeakestRowsInaMatrixEfficientHeapSorting {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] counter = new int[mat.length];
        int m=0;
        while(m<mat.length){
            int count=0;
            for(int j=0; j<mat[m].length; j++){
                if(mat[m][j]==1){
                    count++;
                }
            }
            counter[m]=count;
            m++;
        }
        // counter arr will be
        // [2, 4, 1, 2, 5]

        // PriorityQueue to store (number of 1s, index) and sort by number of 1s
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0]) {
                    return Integer.compare(a[0], b[0]);
                } else {
                    return Integer.compare(a[1], b[1]);
                }
            }
        );
        
        // Push elements with their indices into the heap
        for (int i = 0; i < counter.length; i++) {
            minHeap.offer(new int[] {counter[i], i});
        }
        
        // Array to store the indices of the k weakest rows
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll()[1];
        }
        return result;
    }
}
