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
    static void rightView(TreeNode root,List<Integer> ans,int L){
        if(root==null) return;

        if(ans.size()==L) ans.add(root.val);
        rightView(root.right,ans,L+1);
        rightView(root.left,ans,L+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        rightView(root,ans,0);
        return ans;
    }
}