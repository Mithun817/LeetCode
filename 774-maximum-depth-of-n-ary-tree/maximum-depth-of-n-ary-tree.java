/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    int size = Integer.MIN_VALUE , temp = 0;
    public int maxDepth(Node root) {
        if(root == null) return 0;
        dfs(root);
        return size;
    }
    public void dfs(Node root)
    {
        if(root == null) return;
        temp++;

        boolean flag = true;
        for(Node nod : root.children)
        {
            if(nod != null)
            {
                flag = false;
                break;
            }
        }
        if(flag)
        {
            size = Math.max(temp,size);
        }

        for(Node rot : root.children)
        {
            dfs(rot);
        }
        temp--;
    }
}