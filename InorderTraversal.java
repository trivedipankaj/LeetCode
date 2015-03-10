/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode temp;
        while(!st.isEmpty()|| root !=null){
            while(root !=null){
                st.push(root);
                root =root.left;
            }
            temp = st.pop();
            list.add(temp.val);
            root = temp.right;
        }
        return list;
    }
}
