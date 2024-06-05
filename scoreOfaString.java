class Solution {
    public int scoreOfString(String s) {
        int total=0;
        for(int i=0; i<s.length()-1; i++){
            int char1 = (int)s.charAt(i);
            int char2 = (int)s.charAt(i+1);
            total += Math.abs(char1-char2);
        }
        return total;
    }
}
