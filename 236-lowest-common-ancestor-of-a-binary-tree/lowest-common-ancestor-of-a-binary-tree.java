/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //     if (root == null || root == p || root == q) {
    //         return root;
    //     }

    //     TreeNode left = lowestCommonAncestor(root.left, p, q);
    //     TreeNode right = lowestCommonAncestor(root.right, p, q);

    //     if (left != null && right != null) {
    //         return root;
    //     }

    //     return left != null ? left : right;
    // }

    TreeNode ans;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return ans;
    }

    public boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;

        boolean left = dfs(root.left, p, q);
        boolean right = dfs(root.right, p, q);

        if (left && right) ans = root;
        if (left && root == p || left && root == q) ans = root;
        if (right && root == p || right && root == q) ans = root;

        if (root == p || root == q) return true;

        return left || right;
    }
}