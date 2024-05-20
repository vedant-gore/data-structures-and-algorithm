//BINARY SEARCH PROBLEM

import java.util.Arrays;
import java.util.Scanner;
class Solution{
    public boolean checkIfNexist(int arr[]){
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(binarySearch(arr, 2*arr[i], i)){
                return true;
            }
        }
        return false;
    }

    public boolean binarySearch(int arr[], int target, int excludeIndex){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == target && mid!=excludeIndex){
                return true;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }

    @SuppressWarnings("resource")
    public static void main(String args[]){
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int arr_size = 0;
        arr_size = sc.nextInt();
        int arr[] = new int[arr_size];
        System.out.println("Enter the elements of the array: ");
        Scanner sc1 = new Scanner(System.in);
        for(int a=0; a<arr_size; a++){
            if(sc1.hasNextInt()){
                arr[a] = sc1.nextInt();
            }
        }
        System.out.println("Your array is: ");
        for(int b=0; b<arr.length; b++){
            System.out.print(arr[b] + " ");
        }
        
        Solution s1 = new Solution();
        boolean condition = s1.checkIfNexist(arr);
        System.out.println("\n"+condition);
    }
}

