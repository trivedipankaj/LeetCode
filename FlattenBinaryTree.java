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
    public void flatten(TreeNode root) {
        getFlatten(root);
    }
    
    public void getFlatten(TreeNode root){
        if(root ==null){
            return;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        
        root.left=null;
        getFlatten(left);
        getFlatten(right);
        
        root.right=left;
        TreeNode current = root;
        while(current.right !=null) current = current.right;
        current.right =right;
    }
}
