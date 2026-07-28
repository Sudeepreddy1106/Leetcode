class Solution {
    public String smallestPalindrome(String s) {
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        char ch = '\0';
        boolean found = false;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] % 2 != 0) {
                ch = (char) ('a' + i);
                found = true;
                freq[ch - 'a']--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < freq.length; i++) {
            for (int j = 0; j < freq[i] / 2; j++) {
                sb.append((char) ('a' + i));
            }
        }
        String left=sb.toString();
        String right= sb.reverse().toString();
        if (found) {
            return left+ch+right;
        }
        return left+right;
    }
}
