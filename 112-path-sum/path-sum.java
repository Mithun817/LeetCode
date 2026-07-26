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
    boolean flag = false;
    int sum = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        dfs(root , targetSum);
        return flag;
    }

    public void dfs(TreeNode root , int target)
    {
        if(flag) return;

        if(root == null) return;

        sum+=root.val;
        if(sum == target && root.left == null && root.right == null)
        {
            flag = true;
            return;
        }

        dfs(root.left , target);
        sum-=root.val;
        sum+=root.val;
        dfs(root.right , target);
        sum-=root.val;
    }

}