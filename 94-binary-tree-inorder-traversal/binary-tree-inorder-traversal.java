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
    private List<Integer> traverse= new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        MakeList(root);
        return traverse;
    }
    private void MakeList(TreeNode root){
        if(root == null){
            return;
        }
        MakeList(root.left);
        traverse.add(root.val);
        MakeList(root.right);
    }
}