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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> largest = new ArrayList<>();
        if(root == null) return largest;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            int maxx = Integer.MIN_VALUE;
            for(int i=0 ; i<size ; i++)
            {
                TreeNode rot = q.poll();
                if(rot.left!=null) q.add(rot.left);
                if(rot.right!=null) q.add(rot.right);
                maxx = Math.max(rot.val , maxx);
            }
            largest.add(maxx);
        }
        return largest;
    }
}