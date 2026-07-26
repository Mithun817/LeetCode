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
    int value = 0 , depth = 0 , temp = 0;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root);
        return value;
    }
    public void dfs(TreeNode root)
    {
        if(root == null) return;

        temp++;

        if(root.left==null && root.right==null)
        {
            if(temp > depth)
            {
                value = root.val;
                depth = temp;
            }
            temp--;
            return;
        }
        dfs(root.left);
        dfs(root.right);
        temp--;

    }
}