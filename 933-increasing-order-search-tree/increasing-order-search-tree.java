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
    public TreeNode increasingBST(TreeNode root) {
        if(root == null) return null;
        dfs(root);
        System.out.println(list);
        Collections.sort(list);
        TreeNode nroot = new TreeNode();
        TreeNode newroot = nroot;
        nroot.val = list.get(0);
        for(int i=1 ; i<list.size() ; i++)
        {
            TreeNode rig = new TreeNode();
            nroot.right = rig;
            rig.val = list.get(i);
            nroot  = rig;
        }
        return newroot;
    }
    public void dfs(TreeNode root)
    {
        if(root == null) return;
        list.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}