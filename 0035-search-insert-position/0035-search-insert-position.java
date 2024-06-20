class Solution {
    public int searchInsert(int[] nums, int target) {
      int i=0;
    
      int j=nums.length-1;
      int ans=j+1;
      while(i<=j){
          int m=i+(j-i)/2;
          if(nums[m]>=target){
            ans=m;
            j=m-1;
           }
          else i=m+1;
        }
          return ans;
    }
        
}
