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
    int sum = 0 , depth = 0 , temp = 0;
    public int deepestLeavesSum(TreeNode root) {
        dfs(root);
        return sum;
    }
    public void dfs(TreeNode root)
    {
        if(root == null) return;

        temp++;

        if(root.left == null && root.right == null)
        {
            if(temp == depth)
            {
                sum += root.val;
            }
            else if(temp > depth)
            {
                sum = root.val;
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