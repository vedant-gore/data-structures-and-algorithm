class Solution {
    public void reverseString(char[] s) {
        // create a temp var
        // store the last idnex val in the temp var
        // use for loop to iterate through the entire array
        // keeping the pointer initially at 0, shift each character to the right
        // now index 0 will be empty so put the temp var val in the index 0
        // then shift the pointer to the next index instead of 0
        // 0-h 1-e 2-l 3-l 4-o
        // temp=o; 0-h 1-e 2-l 3-l 4-
        // temp=o; 0-  1-h 2-e 3-l 4-l
        // temp=l; 0-o 1-h 2-e 3-l 4-
        // temp=l; 0-o 1-  2-h 3-e 4-l
        // temp=l; 0-o 1-l 2-h 3-e 4-
        // temp=e; 0-o 1-l 2-l 3-  4-h

        // char temp='\0';
        // for(int i=s.length-1; i>=0; i--){
        //     temp=s[i];
        //     for(int j=s.length-1; j>0; j--){
        //         s[j]=s[j-1];
        //     }
        // }
        int left = 0; // Start pointer
        int right = s.length - 1; // End pointer
        while (left < right) {
            // Swap the characters at left and right
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            // Move the pointers towards the center
            left++;
            right--;
        }
    }
}
