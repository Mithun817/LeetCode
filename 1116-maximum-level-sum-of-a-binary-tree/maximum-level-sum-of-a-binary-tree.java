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
    public int maxLevelSum(TreeNode root) {
        if(root == null) return -1;
        int fs=Integer.MIN_VALUE;
        int level = 0;
        int fl = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int sum = 0;
            int size = q.size();
            level++;
            for(int i=0 ; i<size ; i++)
            {
                TreeNode rot = q.poll();
                if(rot.left!=null) q.add(rot.left);
                if(rot.right!=null) q.add(rot.right);
                sum+=rot.val;
            }
            if(sum > fs)
            {
                fs = sum;
                fl = level;
            }
        }
        return fl;
    }
}