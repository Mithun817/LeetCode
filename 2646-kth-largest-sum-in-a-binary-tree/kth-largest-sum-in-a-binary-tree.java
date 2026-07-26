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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            long sum = 0;
            for(int i=0 ; i<size ; i++)
            {
                TreeNode rot = q.poll();
                if(rot.left!=null) q.add(rot.left);
                if(rot.right!=null) q.add(rot.right);
                sum+=rot.val;
            }
            list.add(sum);
        }
        Collections.sort(list);
        if(k>list.size()) return -1;
        return list.get(list.size()-k);
    }
}