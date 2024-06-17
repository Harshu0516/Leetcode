class Solution {
    public int[] searchRange(int[] n, int target) {
        if(n.length==0){
         return new int[]{-1,-1}; 
        }
        int []a=new int[n.length];
        int x=0;
       for(int i=0;i<n.length;i++){
           if(n[i]==target){
               a[x]=i;
             
               x++;
           }
       } 
       if(x==0) return new int[]{-1,-1};
       return new int[] {a[0],a[x-1]};
      //  return new int[]{-1,-9}; 
    }
}