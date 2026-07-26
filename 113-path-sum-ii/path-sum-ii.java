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
    List<List<Integer>> ans = new ArrayList<>();
    int sum=0;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root , targetSum , new ArrayList<>());
        return ans;
    }

    public void dfs(TreeNode root , int target , List<Integer> temp)
    {
        if(root == null) return;

        sum+=root.val;
        temp.add(root.val);
        if(sum == target && root.left == null && root.right == null)
        {
            ans.add(new ArrayList<>(temp));
            sum -= root.val;
            temp.remove(temp.size()-1);
            return;
        }

        dfs(root.left , target , temp);
        dfs(root.right , target , temp);
        sum-=root.val;
        temp.remove(temp.size()-1);
    }

}