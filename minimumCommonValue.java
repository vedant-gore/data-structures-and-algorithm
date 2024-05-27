//TWO POINTERS METHOD
class Solution {
    public int getCommon(int[] arr1, int[] arr2) {
        for(int p1=0, p2=0, l1=arr1.length, l2=arr2.length; ((p1<l1) && (p2<l2)) ;){
            if(arr1[p1] == arr2[p2]) return arr1[p1];
            else if(arr1[p1] < arr2[p2]) p1++;
            else p2++;
        }
        return -1;
    }
}

//BINARY SEARCH METHOD
class Solution {
    public int getCommon(int[] arr1, int[] arr2){
        for(int i=0; i<arr1.length; i++){
            // int target = arr1[i];
            int start = 0;
            int end = arr2.length-1;
            while(start<=end){
                int mid = start + (end-start)/2;
                // if(target == arr2[mid]) return target;
                if(arr1[i] < arr2[mid]) end = mid-1;
                else if(arr1[i] > arr2[mid]) start = mid+1;
                else return arr1[i];
            }
        }
        return -1;
    }
}