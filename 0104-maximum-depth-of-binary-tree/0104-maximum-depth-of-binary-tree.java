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
        if(root==null) return 0;
        int L=heightOfTree(root.left);
        int R=heightOfTree(root.right);
        return 1+Math.max(L,R);
    }
    public static int maxDepth(TreeNode root) {
        return heightOfTree(root);
    }
}