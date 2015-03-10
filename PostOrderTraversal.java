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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> first = new Stack<TreeNode>();
        Stack<TreeNode> second = new Stack<TreeNode>();
        TreeNode temp;
        if(root !=null){
            first.push(root);
            while(!first.isEmpty()){
                temp = first.pop();
                second.push(temp);
                if(temp.left !=null){
                    first.push(temp.left);
                }
                if(temp.right !=null){
                    first.push(temp.right);
                }
            }
           while(!second.isEmpty()){
               temp = second.pop();
               list.add(temp.val);
           }   
        }
        return list;
    }
}
