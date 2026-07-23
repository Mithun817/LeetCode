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
    ArrayList<Integer> list = new ArrayList<>();
    int prev = Integer.MIN_VALUE+1;
    boolean flag = true;
    public void inorder(TreeNode root)
    {
        if(root == null) return;
        else if(list.size() > 0 && list.get(list.size()-1) >= root.val)
        {
            //System.out.println("prev : "+prev +" val : "+root.val);
            flag = false;
            return;
        }

        //System.out.println("prev : "+prev +" val : "+root.val);

        inorder(root.left);
        if(list.size() > 0 && list.get(list.size()-1) >= root.val)
        {
            //System.out.println("prev : "+prev +" val : "+root.val);
            flag = false;
            return;
        }
        list.add(root.val);
        inorder(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        return flag;
    }
}