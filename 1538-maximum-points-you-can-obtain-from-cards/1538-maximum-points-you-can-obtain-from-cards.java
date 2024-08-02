class Solution {
    public int maxScore(int[] C, int k) {
        int left_sum=0;
        for(int i=0;i<k;i++) left_sum+=C[i];
        int right_sum=0;
        int ri=C.length-1;
        int point=left_sum;
        for(int i=k-1;i>=0;i--){
            left_sum-=C[i];
            right_sum+=C[ri];
            ri--;
            
            point=Math.max(point,left_sum + right_sum);
        }
        return point;
    }
}