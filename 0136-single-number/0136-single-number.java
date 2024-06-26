class Solution {
    public int singleNumber(int[] a) {
        int x=0;
        for(int i=0;i<a.length;i++){
            x=x^a[i];
        }
          return x;
    }
  
}