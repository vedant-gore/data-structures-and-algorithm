import java.util.Scanner;

class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }
        int start = 0;
        int end = num;
        while(start<=end){
            long mid = start + (end-start)/2;
            System.out.println(mid);  //OPTIONAL TO PRINT 
            if(mid*mid == num){
                return true;
            }
            else if(mid*mid > num){
                end = (int)mid-1;
            }
            else if(mid*mid < num){
                start = (int)mid+1;
            }
        }
        return false;
    }

    @SuppressWarnings("resource")
    public static void main(String a[]){
        Solution s1 = new Solution();
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        boolean condition = s1.isPerfectSquare(num);
        System.out.println(condition);
    }
}


/*
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }
        int start = 1;
        int end = num;
        while(start<=end){
            long mid = start + (end-start)/2;
            if(mid*mid == num){
                return true;
            }
            else if(mid*mid > num){
                end = (int)mid-1;
            }
            else{
                start = (int)mid+1;
            }
        }
        return false;
    }
}
 */