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
     static int heightOfTree(TreeNode root,int []A){
        if (root == null) return 0;
        int L=heightOfTree(root.left,A);
        int R=heightOfTree(root.right,A);
        A[0]=Math.max(A[0],L+R);
        return 1+Math.max(L,R);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int A[]=new int[1];
        heightOfTree(root,A);
        return A[0];
    }
}