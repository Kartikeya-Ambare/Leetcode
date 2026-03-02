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
    public int minDepth(TreeNode root) {
        return minHeight(root);
    }
    int minHeight(TreeNode node){
        if(node == null) return 0;

        int leftHeight = minHeight(node.left);
        int rightHeight = minHeight(node.right);

        if(node.left == null || node.right == null) return leftHeight + rightHeight + 1;

        return Math.min(leftHeight, rightHeight) + 1;
    }
}