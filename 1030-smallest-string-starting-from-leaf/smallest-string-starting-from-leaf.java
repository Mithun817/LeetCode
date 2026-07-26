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
    ArrayList<String> list = new ArrayList<>();
    StringBuilder str = new StringBuilder();
    public String smallestFromLeaf(TreeNode root) {
        dfs(root);
        //System.out.println(list);
        Collections.sort(list);
        return list.get(0);
    }

    public void dfs(TreeNode root)
    {
        if(root == null) return;
        //System.out.print(convert(root.val)+" ");
        str.append(convert(root.val));

        if(root.left==null && root.right==null)
        {
            StringBuilder str2 = new StringBuilder(str);
            list.add(str2.reverse().toString());
            str.deleteCharAt(str.length()-1);
            return;
        }

        dfs(root.left);
        dfs(root.right);
        str.deleteCharAt(str.length()-1);
    }

    public char convert(int num)
    {
        return (char)(num+'a');
    }

}