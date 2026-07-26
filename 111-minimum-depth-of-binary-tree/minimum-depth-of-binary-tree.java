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
    int size = Integer.MAX_VALUE;
    int temp = 0;
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        dfs(root);
        return size;
    }
    public void dfs(TreeNode root)
    {
        if(root==null) return;
        if(size == 2) return;
        temp++;
        if(root.left==null && root.right==null)
        {
            size = Math.min(temp , size);
            temp--;
            return;
        }

        dfs(root.left);
        dfs(root.right);
        temp--;
    }
}