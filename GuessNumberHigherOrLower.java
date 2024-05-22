/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class GuessNumberHigherOrLower extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n; //not n-1 because our start var starts from 1 not 0.
        while(start <= end){
            int mid = start + (end - start)/2;
            int result = guess(mid);
            if(result == 0){
                return mid;
            }
            else if(result == -1){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}