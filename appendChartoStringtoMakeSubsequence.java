class Solution {
    public int appendCharacters(String s, String t) {
        if(s.contains(t)) return 0;
        int sIndex = 0, sameChars = 0;
        for(int i =0; i< t.length(); i++){
            char tcurrChar = t.charAt(i);
            int index = s.indexOf(tcurrChar, sIndex);
            if(index != -1){
                sIndex = index + 1;
                sameChars++;
            }
            else break;            
        }
        return t.length() - sameChars;
    }
}
