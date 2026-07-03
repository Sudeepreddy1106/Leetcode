class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int[] freq = new int[26];
        int maxfreq = 0;
        int maxwindow = 0;
        int window = 0;
        while (right < s.length()) {
            freq[s.charAt(right) - 'A']++;
            maxfreq = Math.max(maxfreq, freq[s.charAt(right) - 'A']);
            window = right - left + 1;
            if (window - maxfreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
                window--;
            }
            maxwindow = Math.max(maxwindow, window);
            right++;

        }
        return maxwindow;
    }
}
