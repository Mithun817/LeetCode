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
    public boolean isEvenOddTree(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;

        while(!q.isEmpty())
        {
            int size = q.size();
            int oe = flag ? 1 : 0;
            int prev = Integer.MIN_VALUE;
            int prev2 = Integer.MAX_VALUE;
            //List<Integer> list = new ArrayList<>();
            for(int i=0 ; i<size ; i++)
            {
                TreeNode rot = q.poll();

                if(rot.left!=null) q.add(rot.left);
                if(rot.right!=null) q.add(rot.right);
                //System.out.print(rot.val+" ");
                if(rot.val % 2 != oe) return false;
                if(oe == 1)
                {
                    if(rot.val > prev)
                    {
                        prev = rot.val;
                    }
                    else return false;
                }
                else
                {
                    if(rot.val < prev2)
                    {
                        prev2 = rot.val;
                    }
                    else return false;
                }
            }
            //System.out.println();
            flag = flag ? false : true;
        }
        return true;
    }
}