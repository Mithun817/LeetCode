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
    List<String> ans = new ArrayList<>();
    StringBuilder str = new StringBuilder();
    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root , new ArrayList<>());
        System.out.println(ans);
        return ans;
    }

    public void dfs(TreeNode root , List<String> temp)
    {
        if(root == null) return;

        temp.add(s(root.val));

        if(root.left == null && root.right == null)
        {
            ans.add(convert(temp));
            temp.remove(temp.size()-1);
            return;
        }

        dfs(root.left , temp);
        dfs(root.right , temp);
        temp.remove(temp.size()-1);
    }

    public String s(int num)
    {
        return String.valueOf(num);
    }

    public String convert(List<String> list)
    {
        StringBuilder str = new StringBuilder();

        for(int i=0 ; i<list.size() ; i++)
        {
            if(i==0) str.append(list.get(i));
            else
            {
                str.append("->");
                str.append(list.get(i));
            }
        }
        //System.out.println(str);
        return str.toString();
    }

}