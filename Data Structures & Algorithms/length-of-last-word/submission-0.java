class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length() - 1;
        
        while (s.charAt(n) == ' ') {
            n--;
        }

        int counter = 0;
        for (int i = n; i >= 0 && s.charAt(i) != ' '; i--) {
            counter++;
        }

        return counter;
    }
}