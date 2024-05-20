//BINARY SEARCH PROBLEM
import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int mySqrt(int x) {
        int y = Math.abs(x);
        IntStream intrange = IntStream.range(0, y+1);
        int arr[] = intrange.toArray();
        int val = binarySearch(arr, x);
        return val;
    }
    public int binarySearch(int arr[], int target){
        System.out.println("Your array is: ");
        for(int a = 0; a<arr.length; a++){
            System.out.print(arr[a] + " ");
        }
        int start = arr[0];
        int end = arr.length - 1;
        while(start<=end){
            int mid = (start+end)/2;
            if(target == arr[mid]*arr[mid]){
                return mid;
            }
            else if(arr[mid]*arr[mid] > target){
                end = mid-1;
            }
            else if(arr[mid]*arr[mid] < target){
                start = mid+1;
            }
        }
        return end;
    }

    @SuppressWarnings("resource")
    public static void main(String a[]){
        Solution sqrt = new Solution();
        System.out.println("Enter the number of which square root is to be found out: ");
        Scanner sc1 = new Scanner(System.in);
        int z = sc1.nextInt();
        int sqroot = sqrt.mySqrt(z);
        System.out.println("\nSquare root of x is : " + sqroot);
    }
}

/*
class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        while(start<=end){
            int mid = (start+end)/2;
            if(mid > x/mid){
                end = mid-1;
            }
            else if(mid < x/mid){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
 */