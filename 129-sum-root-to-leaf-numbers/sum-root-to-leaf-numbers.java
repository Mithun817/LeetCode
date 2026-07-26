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
    int sum = 0;
    StringBuilder str = new StringBuilder();
    public int sumNumbers(TreeNode root) {
        dfs(root);
        return sum;
    }

    public void dfs(TreeNode root)
    {
        if(root == null) return;

        str.append(root.val);

        if(root.left == null && root.right == null)
        {
            System.out.println(str);
            sum += Integer.parseInt(str.toString());
            str.deleteCharAt(str.length()-1);
            return;
        }

        dfs(root.left);
        //str.deleteCharAt(str.length()-1);
        //str.append(root.val);
        dfs(root.right);
        str.deleteCharAt(str.length()-1);
    }

}