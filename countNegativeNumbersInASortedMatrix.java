class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] < 0) count++;
                else continue;
            }
        }
        return count;
        // APPROACH 2 (SLOW: TIME LIMIT EXCEEDS):
        // while(rows<grid.length && cols<grid[0].length){
        //     if(grid[rows][cols] < 0){
        //         count++;
        //     }
        //     else{
        //         continue;
        //     }
        //     rows++;
        //     cols++;
        // }
    }
}