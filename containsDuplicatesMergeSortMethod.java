class containsDuplicatesMergeSortMethod {
    static int divide(int[] nums, int l, int r){
        int count = 0;
        if(l<r){
            int mid=l+(r-l)/2;
            count += divide(nums, l, mid);
            count += divide(nums, mid + 1, r);
            count += merge(nums, l, r, mid);
        }
        return count; // Return count inside the method
    }

    static int merge(int[] arr, int l , int r, int mid){
        int lenArr1 = mid-l+1;
        int lenArr2 = r-mid;

        int[] arr1 = new int[lenArr1];
        int[] arr2 = new int[lenArr2];

        for(int x=0; x<lenArr1; x++) arr1[x]=arr[l+x];
        for(int x=0; x<lenArr2; x++) arr2[x]=arr[mid+1+x];

        int i=0, j=0, k=l;
        while(i<lenArr1 && j<lenArr2){
            if(arr1[i]<arr2[j]){
                arr[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<lenArr1){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<lenArr2){
            arr[k]=arr2[j];
            j++;
            k++;
        }

        int count2 = 1;
        int duplicateCount = 0;

        for (int y = 1; y < arr.length; y++) {
            if (arr[i] == arr[i - 1]) {
                count2++;
            } else {
                if (count2 >= 2) {
                    duplicateCount++;
                }
                count2 = 1;
            }
        }
        // To handle the last element
        if (count2 >= 2) {
            duplicateCount++;
        }
        return duplicateCount;

    }

    public boolean containsDuplicate(int[] nums) {
        int ans = divide(nums, 0, nums.length-1);
        if(ans>=2) return true;
        else return false;
    }
}
