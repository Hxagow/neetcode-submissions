class Solution {
    public boolean isSubsequence(String s, String t) {
        int sSize = s.length();
        int tSize = t.length();
        
        int i = 0;
        int j = 0;

        while (i < sSize && j < tSize) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        return i == sSize;
    }
}