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
    HashMap<Integer , Integer> map = new HashMap<>();
    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root);
        int maxx = 0, val = -1;
        for(int key : map.keySet())
        {
            maxx = Math.max(map.get(key) , maxx);
        }
        for(int key : map.keySet())
        {
            if(map.get(key) == maxx) list.add(key);
        }
        int n = list.size();
        int[] ans = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            ans[i] = list.get(i);
        }
        return ans;
    }
    public void inorder(TreeNode root)
    {
        if(root == null) return;
        inorder(root.left);
        map.put(root.val , map.getOrDefault(root.val , 0) + 1);
        inorder(root.right);
    }
}