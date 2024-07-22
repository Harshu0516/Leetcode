class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        Deque < Integer > q = new ArrayDeque < > ();
        int n=a.length;
        int ans[]=new int[n-k+1];
        int j=0;
        for(int i=0;i<n;i++){
            if(!q.isEmpty() && q.peek()<=i-k) q.poll();

            while(!q.isEmpty() && a[q.peekLast()]<=a[i]) q.pollLast();

            q.offer(i);

            if(i>=k-1) ans[j++]=a[q.peek()]; 
        }
        return ans;
    }
}