class Solution {
    public int countKConstraintSubstrings(String s, int t) {
        int n = s.length();
        int c=0;

        for (int i = 0; i < n; i++) {
            int x = 0, y = 0;
            for (int j = i; j < n; j++) {
                if (s.charAt(j) == '0') {
                    x++;
                } else {
                    y++;
                }
                
                if (x <= t || y<= t) {
                    c++;
                }
            }
        }
        return c;
    }
}