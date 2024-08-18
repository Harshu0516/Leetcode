class Solution {
    public int nthUglyNumber(int n) {
        int[] ans = new int[n];
        ans[0] = 1;
        int x = 0, y = 0, z = 0;
        int n2 = 2, n3 = 3, n5 = 5;

        for (int i = 1; i < n; i++) {
            int t = Math.min(n2, Math.min(n3,n5));
            ans[i] = t;

            if (t == n2) {
                x++;
                n2 = ans[x] * 2;
            }
            if (t == n3) {
                y++;
                n3 = ans[y] * 3;
            }
            if (t == n5) {
                z++;
                n5 = ans[z] * 5;
            }
        }

        return ans[n - 1];
    }
}