class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        StringBuilder str = new StringBuilder();
        if (n == m) {
            for (int i = 0; i < n; i++) {
                str.append(word1.charAt(i));
                str.append(word2.charAt(i));
            }
        } else if (n > m) {
            for (int i = 0; i < m; i++) {
                str.append(word1.charAt(i));
                str.append(word2.charAt(i));
            }
            str.append(word1.substring(m));
        } else {
            for (int i = 0; i < n; i++) {
                str.append(word1.charAt(i));
                str.append(word2.charAt(i));
            }
            str.append(word2.substring(n));
        }
        return str.toString();
    }
}