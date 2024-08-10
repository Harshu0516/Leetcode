class Solution {
    public boolean canJump(int[] nums) {
       int maxi=0;
       for(int i=0;i<nums.length;i++){
        if(i>maxi) return false;
        maxi=Math.max(maxi,nums[i]+i);
        if(maxi>=nums.length-1) return true;
       } 
       System.gc();
       return true;
    }
}