// METHOD 1 - BINARY SEARCH
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length, m=matrix[0].length;
        int l=0, h=n*m-1;
        while(l<=h) {
            int mid=(l+h)/2;
            int row=mid/m;
            int col=mid%m;  
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]<target) l=mid+1;
            else h=mid-1;
        }
        return false;
    }
}

// METHOD 2 - TWO POINTER APPROACH
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix[i].length; j++){
                    if(matrix[i][j]==target) return true;
                }
            }
            return false;
    }
}
