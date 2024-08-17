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
    static int heightOfTree(TreeNode root){
        if (root == null) return 0;
        int L=heightOfTree(root.left);
        if(L==-1) return -1;
        int R=heightOfTree(root.right);
        if(R==-1) return -1;
        if(Math.abs(L-R)>1) return -1;
        return 1+Math.max(L,R);
    }
    public boolean isBalanced(TreeNode root) {
        return (heightOfTree(root)==-1?false:true);
        // if(heightOfTree(root)!=-1) return true;
        // return false;
    }
}