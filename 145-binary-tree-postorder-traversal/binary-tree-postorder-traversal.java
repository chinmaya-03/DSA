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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        fn(ans,root);
        return ans;
        
    }
    private void fn(List<Integer> ans, TreeNode root){
        if(root== null){
            return;
        }

        fn(ans,root.left);
        fn(ans,root.right);
        ans.add(root.val);
    }
}