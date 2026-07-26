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
    List<Integer> list = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        dfs(root);
        int n = list.size();

        for(int i=0 ; i<n ; i++)
        {
            for(int j=i+1 ; j<n ; j++)
            {
                if(k == list.get(i)+list.get(j)) return true;
            }
        }
        return false;
    }
    public void dfs(TreeNode root)
    {
        if(root == null) return;

        list.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}