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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        if(root == null){
            return false;
        }
        boolean check  = get_val(root,targetSum,sum);
        return check;
    }
    public static boolean get_val(TreeNode root,int targetSum,int sum){
        if(root == null){
            return false;
        }
        
        sum += root.val;
        
        // Check if it's a leaf node
        if(root.left == null && root.right == null){
            return sum == targetSum;
        }
        
        // Recursively check left and right subtrees
        return get_val(root.left, targetSum, sum) || get_val(root.right, targetSum, sum);
    }
}