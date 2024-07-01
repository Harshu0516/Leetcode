class Solution {
    public boolean containsNearbyDuplicate(int[] n, int k) {
     HashMap<Integer,Integer> ans=new HashMap<>();
     for(int i=0;i<n.length;i++){
        if(ans.containsKey(n[i])){
            int x=ans.get(n[i]);
            if(Math.abs(i-x)<=k) return true;
        }
        ans.put(n[i],i);
     }
        return false;
    }
}