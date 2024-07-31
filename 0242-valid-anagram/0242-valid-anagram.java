class Solution {
    public boolean isAnagram(String s, String t) {
       if (s.length() != t.length()) {
            return false;
        }

        int[] charCount = new int[26];

        // Increment count for each character in s
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
        }

        // Decrement count for each character in t
        for (int i = 0; i < t.length(); i++) {
            charCount[t.charAt(i) - 'a']--;
        }

        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}