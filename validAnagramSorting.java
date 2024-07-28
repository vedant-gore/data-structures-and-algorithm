class validAnagramSorting {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);
        return new String(schar).equals(new String(tchar));
    }
}
