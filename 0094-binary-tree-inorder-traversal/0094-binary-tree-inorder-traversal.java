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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        TreeNode Node=root;
        Stack<TreeNode> st=new Stack<>();
        while(true){
            if(Node!=null){
                st.push(Node);
                Node=Node.left;
            }
            else{
                
                if(st.isEmpty()) break;
                Node=st.pop();
                ans.add(Node.val);
                Node=Node.right;
            }
        }
        return ans;
    }
}