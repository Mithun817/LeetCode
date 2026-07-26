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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) return ans;
        
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> temp = new ArrayList<>();

            for(int i=0 ; i<size ; i++)
            {
                TreeNode rot = q.poll();

                if(rot.left!=null) q.add(rot.left);
                if(rot.right!=null) q.add(rot.right);

                temp.add(rot.val);
            }

            if(ans.size() != 0) ans.add(0 , temp);
            else ans.add(temp);
        }
        return ans;
    }
}