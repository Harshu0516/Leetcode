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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> sol=new ArrayList<>();
            for(int i=0;i<s;i++){
                TreeNode Node=q.poll();
                sol.add(Node.val);
                if(Node.left!=null){
                    q.add(Node.left);
                }
                if(Node.right!=null){
                    q.add(Node.right);
                }
            }
            ans.add(sol);
        }
        return ans;
    }
}