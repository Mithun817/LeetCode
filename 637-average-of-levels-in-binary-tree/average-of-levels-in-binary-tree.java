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
    List<Double> ans = new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            long sum = 0;
            int size = q.size();

            for(int i=0 ; i<size ; i++)
            {
                TreeNode rot = q.poll();
                if(rot.left!=null) q.add(rot.left);
                if(rot.right!=null) q.add(rot.right);

                sum+=rot.val;
            }

            ans.add((double)sum/size);
        }

        return ans;
    }
}