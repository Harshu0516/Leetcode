/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int maxPath(TreeNode p,int[]M){
        if(p==null) return 0;
        int L=Math.max(0,maxPath(p.left,M));
        int R=Math.max(0,maxPath(p.right,M));
        M[0]=Math.max(M[0],L+R+p.val);
        return p.val+Math.max(L,R);
    }
    public int maxPathSum(TreeNode root) {
        int A[]={Integer.MIN_VALUE};
        maxPath(root,A);
        return A[0];
    }
}