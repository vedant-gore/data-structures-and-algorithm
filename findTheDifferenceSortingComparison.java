import java.util.Arrays;

class findTheDifferenceSortingComparison {
    public char findTheDifference(String s, String t) {
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);

        for (int i = 0; i < sarr.length; i++) {
            if (sarr[i] != tarr[i]) {
                return tarr[i];
            }
        }
        // If no difference found in the loop, the extra character is the last one in tarr
        return tarr[tarr.length - 1];
    }
}
