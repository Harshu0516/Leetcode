class Solution {
    public int threeSumClosest(int[] n, int t) {
        Arrays.sort(n);
        int sum = Integer.MAX_VALUE / 2;  
        
        for (int i = 0; i < n.length - 2; ++i) {
            int left = i + 1, right = n.length - 1;
            while (left < right) {
                int sum1 = n[i] + n[left] + n[right];
                if (Math.abs(sum1 - t) < Math.abs(sum - t)) {
                    sum = sum1;
                }
                if (sum1 < t) {
                    ++left;
                } else if (sum1 > t) {
                    --right;
                } else {
                    return sum1;
                }
            }
        }
        
        return sum;
        
    }
}